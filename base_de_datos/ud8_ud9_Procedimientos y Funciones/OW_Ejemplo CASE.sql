DECLARE 
    vn_numero NUMBER := 1;
    
BEGIN 
    CASE vn_numero
        WHEN 0 THEN DBMS_OUTPUT.PUT_LINE('Es el número 0');
        WHEN 1 THEN DBMS_OUTPUT.PUT_LINE('Es el número 1');
        WHEN 2 THEN DBMS_OUTPUT.PUT_LINE('Es el número 2');
        ELSE DBMS_OUTPUT.PUT_LINE('Es otro número');
    END CASE;

END;
/



DECLARE 
    vn_numero NUMBER := 1;
    vv_cadena VARCHAR2(1) := 'A';
    
BEGIN 
    CASE 
        WHEN vn_numero = 0 THEN DBMS_OUTPUT.PUT_LINE('Es el número 0'); 
        WHEN NOT vn_numero = 1 AND vv_cadena = 'A' THEN DBMS_OUTPUT.PUT_LINE('No es el número 1'); DBMS_OUTPUT.PUT_LINE('Y es la letra A');
        WHEN NOT vn_numero = 1 OR vv_cadena = 'A' THEN DBMS_OUTPUT.PUT_LINE('Es el número 1'); DBMS_OUTPUT.PUT_LINE('o es la letra A');
        WHEN vn_numero = 2 THEN DBMS_OUTPUT.PUT_LINE('Es el número 2');
        ELSE DBMS_OUTPUT.PUT_LINE('Es otro número');
    END CASE;

END;
/