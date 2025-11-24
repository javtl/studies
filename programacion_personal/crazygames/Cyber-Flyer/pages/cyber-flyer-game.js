// --- CYBER FLYER GAME ENGINE ---
// Lightweight HTML5 Canvas Game with requestAnimationFrame

// --- GLOBAL CONFIGURATION ---
const canvas = document.getElementById('gameCanvas');
const ctx = canvas.getContext('2d');

// Full-screen (or near full-screen) adjustment
function resizeCanvas() {
    canvas.width = window.innerWidth;
    canvas.height = window.innerHeight;
}
window.addEventListener('resize', resizeCanvas);
resizeCanvas(); // Initialize

// Game Variables
let gameState = 'MENU'; // MENU, PLAYING, GAME_OVER
let score = 0;
let lastTime = 0;
let obstacleSpawnTimer = 0;
const SPAWN_INTERVAL = 1500; // ms to generate a new obstacle

// --- PLAYER (THE FLYER) ---
const player = {
    x: 50,
    y: canvas.height / 2,
    width: 30,
    height: 30,
    velocity: 0,
    gravity: 0.5, // Force of fall
    lift: -10,   // Upward thrust force when jumping
    color: '#0ff' // NEON CYAN
};

// --- OBSTACLES ---
const obstacles = [];
const OBSTACLE_SPEED = 3; // Leftward scrolling speed
const GAP_HEIGHT = 150;   // Height of the central gap
const PIPE_WIDTH = 50;

// --- PARTICLE SYSTEM ---
const particles = [];

// --- SOUND EFFECTS ---
let audioContext;
let jumpSound, collisionSound;

// Initialize Web Audio API
function initAudio() {
    try {
        audioContext = new (window.AudioContext || window.webkitAudioContext)();
        createSounds();
    } catch (e) {
        console.log('Web Audio API not supported');
    }
}

// Create sound effects using Web Audio API
function createSounds() {
    if (!audioContext) return;

    // Jump sound
    jumpSound = () => {
        const oscillator = audioContext.createOscillator();
        const gainNode = audioContext.createGain();
        
        oscillator.connect(gainNode);
        gainNode.connect(audioContext.destination);
        
        oscillator.frequency.setValueAtTime(440, audioContext.currentTime);
        oscillator.frequency.exponentialRampToValueAtTime(660, audioContext.currentTime + 0.1);
        
        gainNode.gain.setValueAtTime(0.3, audioContext.currentTime);
        gainNode.gain.exponentialRampToValueAtTime(0.01, audioContext.currentTime + 0.1);
        
        oscillator.start(audioContext.currentTime);
        oscillator.stop(audioContext.currentTime + 0.1);
    };

    // Collision sound
    collisionSound = () => {
        const oscillator = audioContext.createOscillator();
        const gainNode = audioContext.createGain();
        
        oscillator.connect(gainNode);
        gainNode.connect(audioContext.destination);
        
        oscillator.frequency.setValueAtTime(150, audioContext.currentTime);
        oscillator.frequency.exponentialRampToValueAtTime(50, audioContext.currentTime + 0.3);
        
        gainNode.gain.setValueAtTime(0.5, audioContext.currentTime);
        gainNode.gain.exponentialRampToValueAtTime(0.01, audioContext.currentTime + 0.3);
        
        oscillator.start(audioContext.currentTime);
        oscillator.stop(audioContext.currentTime + 0.3);
    };
}

// --- UPDATE LOGIC ---
function updatePlayer(deltaTime) {
    player.velocity += player.gravity * (deltaTime / 16.66); // Framerate-based adjustment
    player.y += player.velocity;

    // Bottom limit (Game Over if touching the ground)
    if (player.y + player.height > canvas.height) {
        player.y = canvas.height - player.height;
        gameState = 'GAME_OVER';
        if (collisionSound) collisionSound();
        addExplosion(player.x + player.width / 2, player.y + player.height / 2);
    }
    // Top limit
    if (player.y < 0) {
        player.y = 0;
        player.velocity = 0;
    }
}

function updateObstacles(deltaTime) {
    // 1. Generate a new obstacle
    obstacleSpawnTimer += deltaTime;
    if (obstacleSpawnTimer >= SPAWN_INTERVAL) {
        // Random height for the top edge
        const topHeight = Math.random() * (canvas.height - 200) + 50;
        
        obstacles.push({
            x: canvas.width,
            y: 0,
            width: PIPE_WIDTH,
            height: topHeight,
            scored: false,
            type: 'top'
        });
        
        // Add the bottom obstacle
        obstacles.push({
            x: canvas.width,
            y: topHeight + GAP_HEIGHT,
            width: PIPE_WIDTH,
            height: canvas.height - (topHeight + GAP_HEIGHT),
            scored: false,
            type: 'bottom'
        });

        obstacleSpawnTimer = 0;
    }

    // 2. Move and check collisions/scoring
    for (let i = obstacles.length - 1; i >= 0; i--) {
        const obs = obstacles[i];
        obs.x -= OBSTACLE_SPEED;

        // Scoring: only the top obstacle counts
        if (obs.type === 'top' && !obs.scored && obs.x + obs.width < player.x) {
            score++;
            obs.scored = true;
            // Mark the corresponding bottom obstacle as scored too
            const bottomObs = obstacles.find(o => o.type === 'bottom' && Math.abs(o.x - obs.x) < 1);
            if (bottomObs) bottomObs.scored = true;
            
            // Add score particles
            addScoreParticles(obs.x + obs.width, obs.y + obs.height + GAP_HEIGHT / 2);
        }

        // Cleanup: remove if off-screen
        if (obs.x + obs.width < 0) {
            obstacles.splice(i, 1);
        }
    }
}

function checkCollisions() {
    // Simplified AABB detection
    const playerRect = {
        x: player.x,
        y: player.y,
        w: player.width,
        h: player.height
    };

    for (const obs of obstacles) {
        const obsRect = {
            x: obs.x,
            y: obs.y,
            w: obs.width,
            h: obs.height
        };

        // AABB Collision
        if (playerRect.x < obsRect.x + obsRect.w &&
            playerRect.x + playerRect.w > obsRect.x &&
            playerRect.y < obsRect.y + obsRect.h &&
            playerRect.y + playerRect.h > obsRect.y) {
            
            gameState = 'GAME_OVER';
            if (collisionSound) collisionSound();
            addExplosion(player.x + player.width / 2, player.y + player.height / 2);
            break;
        }
    }
}

// --- PARTICLE EFFECTS ---
function addExplosion(x, y) {
    for (let i = 0; i < 15; i++) {
        particles.push({
            x: x,
            y: y,
            vx: (Math.random() - 0.5) * 10,
            vy: (Math.random() - 0.5) * 10,
            life: 1,
            decay: 0.02,
            color: '#f00',
            size: Math.random() * 4 + 2
        });
    }
}

function addScoreParticles(x, y) {
    for (let i = 0; i < 8; i++) {
        particles.push({
            x: x,
            y: y,
            vx: (Math.random() - 0.5) * 5,
            vy: Math.random() * -3 - 1,
            life: 1,
            decay: 0.015,
            color: '#0ff',
            size: Math.random() * 3 + 1
        });
    }
}

function updateParticles(deltaTime) {
    for (let i = particles.length - 1; i >= 0; i--) {
        const p = particles[i];
        p.x += p.vx;
        p.y += p.vy;
        p.vy += 0.2; // gravity
        p.life -= p.decay;
        
        if (p.life <= 0) {
            particles.splice(i, 1);
        }
    }
}

// --- DRAWING LOGIC ---
function drawBackground() {
    // Cyber grid background
    ctx.fillStyle = '#0a0a2a';
    ctx.fillRect(0, 0, canvas.width, canvas.height);
    
    // Grid pattern
    ctx.strokeStyle = '#1a1a4a';
    ctx.lineWidth = 1;
    
    // Vertical lines
    for (let x = 0; x < canvas.width; x += 40) {
        ctx.beginPath();
        ctx.moveTo(x, 0);
        ctx.lineTo(x, canvas.height);
        ctx.stroke();
    }
    
    // Horizontal lines
    for (let y = 0; y < canvas.height; y += 40) {
        ctx.beginPath();
        ctx.moveTo(0, y);
        ctx.lineTo(canvas.width, y);
        ctx.stroke();
    }
}

function drawPlayer() {
    // Player glow
    ctx.shadowColor = player.color;
    ctx.shadowBlur = 15;
    
    // Player body
    ctx.fillStyle = player.color;
    ctx.fillRect(player.x, player.y, player.width, player.height);
    
    // Player details (simple ship design)
    ctx.fillStyle = '#fff';
    ctx.fillRect(player.x + player.width - 5, player.y + 5, 3, player.height - 10);
    
    ctx.shadowBlur = 0;
}

function drawObstacles() {
    ctx.shadowColor = '#FF00FF';
    ctx.shadowBlur = 10;
    
    ctx.fillStyle = '#FF00FF'; // Cyber Magenta
    for (const obs of obstacles) {
        ctx.fillRect(obs.x, obs.y, obs.width, obs.height);
        
        // Add obstacle details
        ctx.fillStyle = '#ff44ff';
        ctx.fillRect(obs.x + 2, obs.y + 2, obs.width - 4, obs.height - 4);
        ctx.fillStyle = '#FF00FF';
    }
    
    ctx.shadowBlur = 0;
}

function drawParticles() {
    for (const p of particles) {
        ctx.globalAlpha = p.life;
        ctx.fillStyle = p.color;
        ctx.shadowColor = p.color;
        ctx.shadowBlur = 5;
        
        ctx.beginPath();
        ctx.arc(p.x, p.y, p.size, 0, Math.PI * 2);
        ctx.fill();
    }
    
    ctx.globalAlpha = 1;
    ctx.shadowBlur = 0;
}

function drawHUD() {
    ctx.fillStyle = '#FFFFFF';
    ctx.font = '30px Orbitron, monospace';
    ctx.textAlign = 'left';
    ctx.shadowColor = '#0ff';
    ctx.shadowBlur = 10;
    ctx.fillText(`Score: ${score}`, 20, 40);
    ctx.shadowBlur = 0;
}

function drawMenu() {
    ctx.fillStyle = 'rgba(0, 0, 42, 0.8)'; // Semi-transparent background
    ctx.fillRect(0, 0, canvas.width, canvas.height);
    
    // Title
    ctx.fillStyle = '#0ff';
    ctx.font = 'bold 60px Orbitron, monospace';
    ctx.textAlign = 'center';
    ctx.shadowColor = '#0ff';
    ctx.shadowBlur = 20;
    ctx.fillText('CYBER FLYER', canvas.width / 2, canvas.height / 2 - 100);
    
    // Subtitle
    ctx.font = '24px Orbitron, monospace';
    ctx.shadowBlur = 10;
    ctx.fillText('Click/Space to Start and Fly', canvas.width / 2, canvas.height / 2 - 20);
    ctx.fillText('Avoid the Cyber Blocks!', canvas.width / 2, canvas.height / 2 + 20);
    
    // Instructions
    ctx.font = '18px Orbitron, monospace';
    ctx.fillStyle = '#f0f';
    ctx.shadowColor = '#f0f';
    ctx.fillText('Mobile: Tap to fly | Desktop: Space/Click', canvas.width / 2, canvas.height / 2 + 80);
    
    ctx.shadowBlur = 0;
}

function drawGameOver() {
    ctx.fillStyle = 'rgba(255, 0, 0, 0.6)'; // Red/dark Game Over background
    ctx.fillRect(0, 0, canvas.width, canvas.height);
    
    // Game Over text with glitch effect
    ctx.fillStyle = '#f00';
    ctx.font = 'bold 70px Orbitron, monospace';
    ctx.textAlign = 'center';
    ctx.shadowColor = '#f00';
    ctx.shadowBlur = 20;
    
    // Glitch effect
    const glitchOffset = Math.random() * 4 - 2;
    ctx.fillText('GAME OVER', canvas.width / 2 + glitchOffset, canvas.height / 2 - 80);
    
    // Score
    ctx.fillStyle = '#fff';
    ctx.font = '40px Orbitron, monospace';
    ctx.shadowColor = '#fff';
    ctx.shadowBlur = 10;
    ctx.fillText(`Final Score: ${score}`, canvas.width / 2, canvas.height / 2 - 10);
    
    // High score
    const highScore = localStorage.getItem('cyberFlyerHighScore') || 0;
    if (score > highScore) {
        localStorage.setItem('cyberFlyerHighScore', score);
        ctx.fillStyle = '#0ff';
        ctx.font = '24px Orbitron, monospace';
        ctx.shadowColor = '#0ff';
        ctx.fillText('NEW HIGH SCORE!', canvas.width / 2, canvas.height / 2 + 30);
    } else {
        ctx.fillStyle = '#888';
        ctx.font = '20px Orbitron, monospace';
        ctx.shadowColor = '#888';
        ctx.fillText(`High Score: ${highScore}`, canvas.width / 2, canvas.height / 2 + 30);
    }
    
    // Restart instruction
    ctx.fillStyle = '#0ff';
    ctx.font = '24px Orbitron, monospace';
    ctx.shadowColor = '#0ff';
    ctx.shadowBlur = 10;
    ctx.fillText('Click/Space to Retry', canvas.width / 2, canvas.height / 2 + 80);
    
    ctx.shadowBlur = 0;
}

// --- THE MAIN LOOP (GAME LOOP) ---
function gameLoop(timestamp) {
    const deltaTime = timestamp - lastTime;
    lastTime = timestamp;

    // Clear the canvas
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    
    // Draw background
    drawBackground();

    switch (gameState) {
        case 'MENU':
            drawMenu();
            break;
            
        case 'PLAYING':
            updatePlayer(deltaTime);
            updateObstacles(deltaTime);
            updateParticles(deltaTime);
            checkCollisions();

            drawObstacles();
            drawPlayer();
            drawParticles();
            drawHUD();
            break;
            
        case 'GAME_OVER':
            drawObstacles(); // Draw the last position before Game Over
            drawPlayer();
            drawParticles();
            drawGameOver();
            break;
    }

    requestAnimationFrame(gameLoop);
}

// --- INPUT CONTROL ---
function handleInput() {
    if (gameState === 'MENU' || gameState === 'GAME_OVER') {
        // Reset/Start
        score = 0;
        player.y = canvas.height / 2;
        player.velocity = 0;
        obstacles.length = 0; // Empty the obstacles array
        particles.length = 0; // Clear particles
        obstacleSpawnTimer = 0;
        gameState = 'PLAYING';
        
        // Initialize audio on first user interaction
        if (!audioContext) {
            initAudio();
        }
    } else if (gameState === 'PLAYING') {
        // Flight
        player.velocity = player.lift; // Apply upward thrust
        if (jumpSound) jumpSound();
    }
}

// Keyboard controls
document.addEventListener('keydown', (e) => {
    if (e.code === 'Space') {
        e.preventDefault(); // Prevent the spacebar from scrolling the page
        handleInput();
    }
});

// Mouse controls
canvas.addEventListener('mousedown', handleInput);

// Touch controls (crucial for mobile)
canvas.addEventListener('touchstart', (e) => {
    e.preventDefault(); // Crucial for mobile
    handleInput();
});

// Prevent context menu on right-click
canvas.addEventListener('contextmenu', (e) => {
    e.preventDefault();
});

// Prevent scrolling on mobile when touching the canvas
document.addEventListener('touchmove', (e) => {
    if (e.target === canvas) {
        e.preventDefault();
    }
}, { passive: false });

// Responsive canvas adjustment
function handleResize() {
    resizeCanvas();
    // Adjust player position if needed
    if (player.y > canvas.height - player.height) {
        player.y = canvas.height - player.height;
    }
}

window.addEventListener('resize', handleResize);

// ¡START THE GAME!
requestAnimationFrame(gameLoop);

console.log("Cyber Flyer initiated. Ready for takeoff.");

// Performance monitoring
let frameCount = 0;
let lastFPSTime = 0;

function monitorPerformance(timestamp) {
    frameCount++;
    if (timestamp - lastFPSTime >= 1000) {
        console.log(`FPS: ${frameCount}`);
        frameCount = 0;
        lastFPSTime = timestamp;
    }
}

// Add FPS monitoring to game loop (optional)
const originalGameLoop = gameLoop;
gameLoop = function(timestamp) {
    originalGameLoop(timestamp);
    monitorPerformance(timestamp);
};