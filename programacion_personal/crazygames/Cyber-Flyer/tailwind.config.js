module.exports = {
  content: [
    "./pages/*.{html,js}",
    "./index.html",
    "./js/*.js",
    "./components/*.{html,js}"
  ],
  theme: {
    extend: {
      colors: {
        // Primary Colors
        primary: {
          DEFAULT: "#FF6B35", // orange-500
          50: "#FFF4F0", // orange-50
          100: "#FFE4D6", // orange-100
          200: "#FFCAB0", // orange-200
          300: "#FFB08A", // orange-300
          400: "#FF8D5F", // orange-400
          500: "#FF6B35", // orange-500
          600: "#E55A2B", // orange-600
          700: "#CC4A21", // orange-700
          800: "#B23A17", // orange-800
          900: "#992A0D", // orange-900
        },
        // Secondary Colors
        secondary: {
          DEFAULT: "#4ECDC4", // teal-400
          50: "#F0FDFC", // teal-50
          100: "#CCFBF1", // teal-100
          200: "#99F6E4", // teal-200
          300: "#5EEAD4", // teal-300
          400: "#4ECDC4", // teal-400
          500: "#14B8A6", // teal-500
          600: "#0D9488", // teal-600
          700: "#0F766E", // teal-700
          800: "#115E59", // teal-800
          900: "#134E4A", // teal-900
        },
        // Accent Colors
        accent: {
          DEFAULT: "#FFE66D", // yellow-300
          50: "#FEFCE8", // yellow-50
          100: "#FEF3C7", // yellow-100
          200: "#FDE68A", // yellow-200
          300: "#FFE66D", // yellow-300
          400: "#FBBF24", // yellow-400
          500: "#F59E0B", // yellow-500
          600: "#D97706", // yellow-600
          700: "#B45309", // yellow-700
          800: "#92400E", // yellow-800
          900: "#78350F", // yellow-900
        },
        // Background Colors
        background: "#1A1A2E", // slate-900
        surface: {
          DEFAULT: "#16213E", // slate-800
          light: "#1E293B", // slate-700
        },
        // Text Colors
        "text-primary": "#FFFFFF", // white
        "text-secondary": "#B8BCC8", // slate-400
        "text-muted": "#64748B", // slate-500
        // Status Colors
        success: "#4ECDC4", // teal-400
        warning: "#F7931E", // orange-400
        error: "#FF4757", // red-500
      },
      fontFamily: {
        heading: ['Exo 2', 'sans-serif'],
        body: ['Inter', 'sans-serif'],
        caption: ['Roboto', 'sans-serif'],
        mono: ['JetBrains Mono', 'monospace'],
      },
      fontSize: {
        'xs': ['0.75rem', { lineHeight: '1rem' }],
        'sm': ['0.875rem', { lineHeight: '1.25rem' }],
        'base': ['1rem', { lineHeight: '1.5rem' }],
        'lg': ['1.125rem', { lineHeight: '1.75rem' }],
        'xl': ['1.25rem', { lineHeight: '1.75rem' }],
        '2xl': ['1.5rem', { lineHeight: '2rem' }],
        '3xl': ['1.875rem', { lineHeight: '2.25rem' }],
        '4xl': ['2.25rem', { lineHeight: '2.5rem' }],
        '5xl': ['3rem', { lineHeight: '1' }],
        '6xl': ['3.75rem', { lineHeight: '1' }],
      },
      spacing: {
        '18': '4.5rem',
        '88': '22rem',
        '128': '32rem',
      },
      borderRadius: {
        'lg': '8px',
        'md': '6px',
        'sm': '4px',
      },
      boxShadow: {
        'sm': '0 1px 2px 0 rgba(0, 0, 0, 0.05)',
        'base': '0 2px 4px rgba(0, 0, 0, 0.1), 0 8px 16px rgba(0, 0, 0, 0.1)',
        'md': '0 4px 6px -1px rgba(0, 0, 0, 0.1), 0 2px 4px -1px rgba(0, 0, 0, 0.06)',
        'lg': '0 10px 15px -3px rgba(0, 0, 0, 0.1), 0 4px 6px -2px rgba(0, 0, 0, 0.05)',
        'xl': '0 20px 25px -5px rgba(0, 0, 0, 0.1), 0 10px 10px -5px rgba(0, 0, 0, 0.04)',
        'inner': 'inset 0 2px 4px 0 rgba(0, 0, 0, 0.06)',
      },
      transitionDuration: {
        '150': '150ms',
        '200': '200ms',
        '300': '300ms',
      },
      transitionTimingFunction: {
        'out': 'ease-out',
        'game': 'cubic-bezier(0.4, 0.0, 0.2, 1)',
      },
      scale: {
        '102': '1.02',
        '98': '0.98',
      },
      backdropBlur: {
        'game': '8px',
      },
      animation: {
        'slide-in-right': 'slideInRight 300ms cubic-bezier(0.4, 0.0, 0.2, 1)',
        'pulse-subtle': 'pulseSubtle 2s cubic-bezier(0.4, 0.0, 0.6, 1) infinite',
      },
      keyframes: {
        slideInRight: {
          'from': {
            opacity: '0',
            transform: 'translateX(100%)',
          },
          'to': {
            opacity: '1',
            transform: 'translateX(0)',
          },
        },
        pulseSubtle: {
          '0%, 100%': {
            opacity: '1',
          },
          '50%': {
            opacity: '0.8',
          },
        },
      },
      minHeight: {
        'touch': '44px',
      },
      minWidth: {
        'touch': '44px',
      },
    },
  },
  plugins: [
    function({ addUtilities }) {
      const newUtilities = {
        '.touch-target': {
          minHeight: '44px',
          minWidth: '44px',
        },
        '.game-focus': {
          '&:focus': {
            outline: 'none',
            boxShadow: '0 0 0 2px #FF6B35, 0 0 0 4px rgba(255, 107, 53, 0.2)',
          },
        },
      }
      addUtilities(newUtilities)
    }
  ],
}