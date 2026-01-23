create database if not exists jr;

use jr;
DROP TABLE IF EXISTS persona;
CREATE TABLE persona(
	dni CHAR(9),
    id_persona INT NOT NULL UNIQUE AUTO_INCREMENT,
    nombre VARCHAR(50),
    apellidos VARCHAR(150),
    fecha_nac DATE,
    fecha_alta TIMESTAMP DEFAULT NOW(),
    num_hermanos INT1,
    estado_civil ENUM('C','S','D','V') DEFAULT ('S'),
    PRIMARY KEY(dni),
    UNIQUE (apellidos, nombre)
);

