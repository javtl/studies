CREATE DATABASE IF NOT EXISTS examen_2018;
USE examen_2018; 

CREATE TABLE profesores(
    cod_pr TINYINT(2) UNSIGNED, 
    dni_pr CHAR(9) NOT NULL UNIQUE, 
    nombre_pr VARCHAR(50), -- Ampliado para nombres largos
    especialidad_pr VARCHAR(30),
    PRIMARY KEY (cod_pr) 
);

CREATE TABLE asignaturas(
    cod_as SMALLINT(3) UNSIGNED,
    nombre_as VARCHAR(50),
    hora_as SMALLINT UNSIGNED,
    PRIMARY KEY (cod_as)
);

CREATE TABLE alumnos(
    cod_al SMALLINT(3) UNSIGNED,
    fecinc_al DATE,
    fecnac_al DATE,
    dni_al CHAR(9) NOT NULL UNIQUE,
    nombre_al VARCHAR(50),
    ciudad_al VARCHAR(50), -- Ampliado para evitar errores
    tutor_al TINYINT(2) UNSIGNED,    
    delegado_al SMALLINT(3) UNSIGNED, 
    PRIMARY KEY (cod_al),
    CONSTRAINT fk_tutor FOREIGN KEY (tutor_al) REFERENCES profesores(cod_pr),
    CONSTRAINT fk_delegado FOREIGN KEY (delegado_al) REFERENCES alumnos(cod_al)
);

CREATE TABLE clases(
    profesores_cl TINYINT(2) UNSIGNED,
    asignatura_cl SMALLINT(3) UNSIGNED,
    aula_cl TINYINT UNSIGNED,
    horassem_cl TINYINT UNSIGNED,
    PRIMARY KEY (profesores_cl, asignatura_cl), 
    CONSTRAINT fk_clase_profe FOREIGN KEY (profesores_cl) REFERENCES profesores(cod_pr),
    CONSTRAINT fk_clase_asig FOREIGN KEY (asignatura_cl) REFERENCES asignaturas(cod_as)
);

CREATE TABLE notas(
    alumno_no SMALLINT(3) UNSIGNED,
    asignatura_no SMALLINT(3) UNSIGNED,
    fecha_no DATE,
    nota_no DECIMAL(4,2), -- Mantenemos decimal para precisión de nota
    PRIMARY KEY (alumno_no, asignatura_no, fecha_no), 
    CONSTRAINT fk_nota_alumno FOREIGN KEY (alumno_no) REFERENCES alumnos(cod_al),
    CONSTRAINT fk_nota_asig FOREIGN KEY (asignatura_no) REFERENCES asignaturas(cod_as)
);