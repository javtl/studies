CREATE TABLE profesores(
    cod_pr DECIMAL(2),
    dni_pr CHAR(9) NOT NULL,
    nombre_pr VARCHAR(25),
    especialidad_pr VARCHAR(15),
    PRIMARY KEY (cod_pr) 
);


CREATE TABLE asignaturas(
    cod_as DECIMAL(3),
    nombre_as VARCHAR(35),
    hora_as DECIMAL(3),
    PRIMARY KEY (cod_as)
);


CREATE TABLE alumnos(
    cod_al DECIMAL(2),
    fecinc_al DATE,
    fecnac_al DATE,
    dni_al VARCHAR(9) NOT NULL,
    nombre_al VARCHAR(25),
    ciudad_al VARCHAR(10),
    tutor_al DECIMAL(2),    
    delegado_al DECIMAL(2), 
    PRIMARY KEY (cod_al),
    CONSTRAINT fk_tutor FOREIGN KEY (tutor_al) REFERENCES profesores(cod_pr),
    CONSTRAINT fk_delegado FOREIGN KEY (delegado_al) REFERENCES alumnos(cod_al)
);


CREATE TABLE clases(
    profesores_cl DECIMAL(2),
    asignatura_cl DECIMAL(3),
    aula_cl DECIMAL(2),
    horassem_cl DECIMAL(2),
    PRIMARY KEY (profesores_cl, asignatura_cl), 
    CONSTRAINT fk_clase_profe FOREIGN KEY (profesores_cl) REFERENCES profesores(cod_pr),
    CONSTRAINT fk_clase_asig FOREIGN KEY (asignatura_cl) REFERENCES asignaturas(cod_as)
);


CREATE TABLE notas(
    alumno_no DECIMAL (2),
    asignatura_no DECIMAL (3),
    fecha_no DATE,
    nota_no DECIMAL(4,2),
    PRIMARY KEY (alumno_no, asignatura_no, fecha_no), 
    CONSTRAINT fk_nota_alumno FOREIGN KEY (alumno_no) REFERENCES alumnos(cod_al),
    CONSTRAINT fk_nota_asig FOREIGN KEY (asignatura_no) REFERENCES asignaturas(cod_as)
);