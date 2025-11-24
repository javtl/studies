# ============================================
# 1️⃣ Actualizar paquetes base y dependencias
sudo apt update && sudo apt upgrade -y
sudo apt install -y ca-certificates curl gnupg lsb-release

# ============================================
# 2️⃣ Instalar Ollama
curl -fsSL https://ollama.com/install.sh | sh

# Descargar un modelo de ejemplo (Llama2)
ollama pull llama2

# ============================================
# 3️⃣ Instalar Docker en WSL

# Crear directorio para claves
sudo mkdir -p /etc/apt/keyrings

# Descargar y guardar la clave GPG de Docker
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | \
  sudo gpg --dearmor -o /etc/apt/keyrings/docker.gpg

# Añadir repositorio de Docker
echo \
"deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.gpg] \
https://download.docker.com/linux/ubuntu \
$(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null

# Instalar Docker y plugins
sudo apt update
sudo apt install -y docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin

# Iniciar servicio Docker
sudo service docker start

# Permitir usar Docker sin sudo
sudo usermod -aG docker $USER
newgrp docker

# Verificar instalación
docker run hello-world

# ============================================
# 4️⃣ Ejecutar Open WebUI en Docker

docker run -d \
  --network=host \
  -v open-webui:/app/backend/data \
  -e OLLAMA_BASE_URL=http://127.0.0.1:11434 \
  --name open-webui \
  --restart always \
  ghcr.io/open-webui/open-webui:main

# ============================================
# 5️⃣ Verificar contenedores y logs

# Contenedores activos
docker ps

# Logs del contenedor
docker logs -f open-webui

# ============================================
# 6️⃣ Acceso a WebUI
# Abrir en navegador de Windows:
# http://127.0.0.1:11434

# ============================================
# 7️⃣ Automatizar inicio de Docker al abrir WSL (opcional)
echo "sudo service docker start" >> ~/.bashrc
