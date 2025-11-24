# Guía Completa: WSL + Docker + Ollama + Open WebUI

Esta guía recopila todos los pasos para instalar y configurar WSL, Docker, Ollama y Open WebUI, incluyendo la inicialización, descarga de modelos y creación de un nuevo modelo en WebUI.

---

## 1. Inicialización de WSL (Windows Subsystem for Linux)

1. Abrir PowerShell como administrador y ejecutar:
   ```powershell
   wsl --install
````

2. Reiniciar el equipo si es necesario.
3. Durante la instalación:

   * Elige un **nombre de usuario** para tu distro.
   * Crea una **contraseña**.
4. Abrir WSL:

   ```powershell
   wsl
   ```
5. Verificar la distro instalada:

   ```bash
   lsb_release -a
   ```

> Recomendación: usar **Windows Terminal** para que funcionen los atajos modernos de copiar/pegar:
>
> * Copiar: `Ctrl + Shift + C`
> * Pegar: `Ctrl + Shift + V`
> * Si estás en la consola clásica (CMD/PowerShell):
>
>   * Copiar: seleccionar + `Enter`
>   * Pegar: clic derecho o `Shift + Insert`
> * Instalar Windows Terminal si no lo tienes:
>
>   ```powershell
>   winget install --id Microsoft.WindowsTerminal -e
>   ```

---

## 2. Instalación de Ollama

1. Actualizar paquetes:

   ```bash
   sudo apt update
   sudo apt upgrade -y
   ```
2. Instalar Ollama:

   ```bash
   curl -fsSL https://ollama.com/install.sh | sh
   ```
3. Descargar un modelo de Ollama, por ejemplo Llama2:

   ```bash
   ollama pull llama2
   ```

---

## 3. Instalación de Docker en WSL

### 3.1 Actualizar paquetes y dependencias

```bash
sudo apt update && sudo apt upgrade -y
sudo apt install -y ca-certificates curl gnupg lsb-release
sudo mkdir -p /etc/apt/keyrings
```

### 3.2 Descargar y añadir clave GPG de Docker

```bash
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | \
  sudo gpg --dearmor -o /etc/apt/keyrings/docker.gpg
```

### 3.3 Añadir repositorio de Docker

```bash
echo \
  "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.gpg] \
  https://download.docker.com/linux/ubuntu \
  $(lsb_release -cs) stable" | \
  sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
```

### 3.4 Instalar Docker

```bash
sudo apt update
sudo apt install -y docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin
```

### 3.5 Probar Docker

```bash
sudo service docker start
docker run hello-world
```

### 3.6 Ejecutar Docker sin `sudo` (opcional)

```bash
sudo usermod -aG docker $USER
newgrp docker
docker run hello-world
```

> Nota: en WSL no hay systemd, por lo que Docker no arranca automáticamente. Para automatizarlo, se puede añadir un comando en `~/.bashrc`.

---

## 4. Ejecutar contenedor Open WebUI

```bash
docker run -d \
  --network=host \
  -v open-webui:/app/backend/data \
  -e OLLAMA_BASE_URL=http://127.0.0.1:11434 \
  --name open-webui \
  --restart always \
  ghcr.io/open-webui/open-webui:main
```

### 4.1 Comprobar contenedores activos

```bash
docker ps
```

### 4.2 Ver logs del contenedor

```bash
docker logs -f open-webui
```

### 4.3 Detener o reiniciar contenedor

```bash
docker stop open-webui
docker start open-webui
docker restart open-webui
```

### 4.4 Acceso al WebUI

Abrir navegador en Windows:

```
http://127.0.0.1:11434
```

---

## 5. Descarga y gestión de modelos en Open WebUI

1. Abrir **Open WebUI** en el navegador.
2. Ir a la sección de **Modelos**.
3. Descargar modelos existentes desde el repositorio de Ollama u otros repositorios compatibles.
4. Crear un nuevo modelo:

   * Subir dataset si es necesario.
   * Configurar parámetros.
   * Entrenar o ajustar el modelo.
5. Guardar el modelo en el volumen persistente configurado (`open-webui:/app/backend/data`).

---

## 6. Tips y notas útiles

* Para que Docker arranque automáticamente en cada sesión WSL:

  ```bash
  echo "sudo service docker start" >> ~/.bashrc
  ```
* Siempre usa **Windows Terminal** para comodidad con copiar/pegar y pestañas.
* Si quieres acceder a Ollama desde Windows, recuerda que el contenedor usa `--network=host`.
* Comandos básicos de Ollama:

  ```bash
  ollama list          # lista los modelos descargados
  ollama pull <modelo> # descargar nuevos modelos
  ollama run <modelo>  # ejecutar un modelo desde la terminal
  ```

---

**Fin de la guía**

```

