FROM mysql:latest

ENV MYSQL_ROOT_PASSWORD=root_password \
    MYSQL_DATABASE=mi_basededatos \
    MYSQL_USER=usuario \
    MYSQL_PASSWORD=usuario_password

COPY init.sql /docker-entrypoint-initdb.d/
