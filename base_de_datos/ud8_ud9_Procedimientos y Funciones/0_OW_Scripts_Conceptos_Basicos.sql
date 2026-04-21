--------------------------------------------------------------------------------
-- Bloque anonimo 
--------------------------------------------------------------------------------
DECLARE

    vv_texto VARCHAR2(50 CHAR);
    
BEGIN

    vv_texto := 'Bienvenido al curso de fundamentos de PL/SQL';
    
    DBMS_OUTPUT.PUT_LINE(vv_texto);
    
END;
/

--------------------------------------------------------------------------------
-- pr_escribir_bienvenida
-- Subprograma Procedimiento que escribe el texto de bienvenida del curso
--------------------------------------------------------------------------------
CREATE OR REPLACE PROCEDURE pr_escribir_bienvenida IS

    vv_texto VARCHAR2(50 CHAR);
    
BEGIN

    vv_texto := 'Bienvenid@ al curso de fundamentos de PL/SQL';
    
    DBMS_OUTPUT.PUT_LINE(vv_texto);
    
END pr_escribir_bienvenida;
/

--------------------------------------------------------------------------------
-- fn_v_recupera_bienvenida
-- Subprograma Funcion que devuelve el texto de bienvenida del curso
--------------------------------------------------------------------------------
CREATE OR REPLACE FUNCTION fn_v_recupera_bienvenida RETURN VARCHAR2 IS
BEGIN

    RETURN 'Bienvenid@ al curso de fundamentos de PL/SQL';
    
END fn_v_recupera_bienvenida;
/

--------------------------------------------------------------------------------
-- Bloque anónimo que invoca a la funcion fn_v_recupera_bienvenida
--------------------------------------------------------------------------------
BEGIN

    DBMS_OUTPUT.PUT_LINE(fn_v_recupera_bienvenida);
    
END;
/


--------------------------------------------------------------------------------
-- Trigger tr_escribe_cambio_precio_prod
-- Muestra por pantalla el precio anterior y el nuevo precio asignado a 
-- un producto
--------------------------------------------------------------------------------
CREATE OR REPLACE TRIGGER tr_escribe_cambio_precio_prod 
  BEFORE DELETE OR INSERT OR UPDATE ON tb_productos
  FOR EACH ROW
WHEN (new.n_codprod > 0)
DECLARE
    n_dif_precio number;
BEGIN
    n_dif_precio  := :new.n_precio  - :old.n_precio;
    dbms_output.put('Precio anterior: ' || :old.n_precio);
    dbms_output.put('  Nuevo precio: ' || :new.n_precio);
    dbms_output.put_line('  Diferencia ' || n_dif_precio);
END;
/


