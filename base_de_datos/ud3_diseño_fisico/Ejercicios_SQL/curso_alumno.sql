create database if not exists jr;

use jr;

DROP TABLE IF EXISTS alumno;
DROP TABLE IF EXISTS curso;


CREATE TABLE curso(
id INT1 AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(50) NOT NULL,
turno ENUM('MAÑANA','TARDE')

);

CREATE TABLE alumno(
	id INT4 AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    apellido1 VARCHAR(75) NOT NULL,
    edad INT1 CHECK(edad<18),
    fecha_alta TIMESTAMP DEFAULT(now()),
    id_curso INT1,
    id_delegado INT4,
    PRIMARY KEY(id),
    FOREIGN KEY  (id_delegado) REFERENCES alumno(id),
    FOREIGN KEY (id_curso) REFERENCES curso(id)
			ON DELETE SET NULL
            ON UPDATE CASCADE
    );
    
    ALTER TABLE curso ADD FOREIGN KEY (id_delegado) REFERENCES alumno(id)
			ON DELETE SET NULL ON UPDATE CASCADE;
	
    ALTER TABLE alumno ADD apellido2 VARCHAR(75);
	ALTER TABLE alumno MODIFY id_curso INT1  NOT NULL;
    ALTER TABLE alumno MODIFY apellidos1 VARCHAR(100);
    
    ALTER TABLE alumno DROP apellido1;
    # ALTER TABLE curso DROP CONSTRAINT delegado_FK;

SHOW TABLES;
DESCRIBE alumno;
DESCRIBE curso;
    
