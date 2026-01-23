/*Crea un índice para la tabla CLASES ordenada por AULA_CL y ASIGNATURA_CL */

CREATE INDEX clase_aula_asig_idx 
ON clases(aula_cl, asignatura_cl);

