# Usamos la imagen base de Ubuntu
FROM ubuntu:latest

# Actualizamos el sistema e instalamos herramientas esenciales
RUN apt-get update && \
    apt-get install -y \
    curl \
    wget \
    vim \
    nano \
    git

# Definir una variable de entorno
ENV MY_ENV_VAR="Este es un entorno de Docker"

# Crear un usuario sin privilegios
RUN useradd -m dockeruser

# Cambiar al usuario no privilegiado
USER dockeruser

# Definir el directorio de trabajo
WORKDIR /home/dockeruser

# Comando por defecto para ejecutar cuando se inicie el contenedor
CMD ["bash"]
