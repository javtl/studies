-----------------------------------------------------------------------------------------
-- Cursor implícito
-----------------------------------------------------------------------------------------
BEGIN 
    
    UPDATE tbProductos 
       SET vDesProducto = vDesProducto;
    
	IF SQL%FOUND THEN 
		DBMS_OUTPUT.PUT_LINE('Se han actualizado ' || SQL%ROWCOUNT || ' productos.');
	ELSE 
		DBMS_OUTPUT.PUT_LINE('No se han actualizado productos.');
	END IF;
	
	COMMIT; -- Si ponemos el commit inmediatamente depues del UPDATE nos indicara que no se han actualizado registros
	
	DBMS_OUTPUT.PUT_LINE('Se han actualizado ' || SQL%ROWCOUNT || ' productos.');
    
END;
/

-----------------------------------------------------------------------------------------
-- Cursor explícito estático
-----------------------------------------------------------------------------------------
DECLARE	

	CURSOR c_consulta_productos IS 
	    SELECT *
	      FROM tbProductos;
    
    vr_tbProductos  TBPRODUCTOS%ROWTYPE;
		  
BEGIN 
	
	OPEN c_consulta_productos; -- Abrimos el cursor
    LOOP 
        FETCH c_consulta_productos INTO vr_tbProductos; -- Leemos un registro del cursor
        
        DBMS_OUTPUT.PUT_LINE('Registro: ' || vr_tbProductos.nIDProducto); 
        DBMS_OUTPUT.PUT_LINE('El producto es: ' || vr_tbProductos.vDesProducto); 
        DBMS_OUTPUT.PUT_LINE('El número de unidades recibidas es: ' || vr_tbProductos.nUnidades); 
        DBMS_OUTPUT.PUT_LINE('El precio unitario es: ' || vr_tbProductos.nPrecioUnitario); 
        DBMS_OUTPUT.PUT_LINE('La fecha de entrega es: ' || TO_CHAR(vr_tbProductos.dFechaAlta, 'DD/MM/YYYY'));
        DBMS_OUTPUT.PUT_LINE('---------------------------------------------------------------------------'); 
        
        EXIT WHEN c_consulta_productos%NOTFOUND; -- Salimos cuando se cumpla la condicion indicada en el WHEN
    END LOOP;
    CLOSE c_consulta_productos; -- Cerramos el cursor
    
END;
/


-----------------------------------------------------------------------------------------
-- Cursor explícito estático
-----------------------------------------------------------------------------------------
BEGIN 
	
	FOR vr_tbProductos IN (SELECT * FROM tbProductos) LOOP 
        
        DBMS_OUTPUT.PUT_LINE('Registro: ' || vr_tbProductos.nIDProducto); 
        DBMS_OUTPUT.PUT_LINE('El producto es: ' || vr_tbProductos.vDesProducto); 
        DBMS_OUTPUT.PUT_LINE('El número de unidades recibidas es: ' || vr_tbProductos.nUnidades); 
        DBMS_OUTPUT.PUT_LINE('El precio unitario es: ' || vr_tbProductos.nPrecioUnitario); 
        DBMS_OUTPUT.PUT_LINE('La fecha de entrega es: ' || TO_CHAR(vr_tbProductos.dFechaAlta, 'DD/MM/YYYY'));
        DBMS_OUTPUT.PUT_LINE('---------------------------------------------------------------------------'); 
        
    END LOOP;
    
END;
/



-----------------------------------------------------------------------------------------
-- Cursor explícito dinámico
-----------------------------------------------------------------------------------------
DECLARE
    vn_IDProducto_inicio    TBPRODUCTOS.NIDPRODUCTO%TYPE := 2;
    vn_IDProducto_fin       TBPRODUCTOS.NIDPRODUCTO%TYPE := 4;
    
BEGIN 
	
	FOR vr_tbProductos IN (SELECT * FROM tbProductos WHERE nIDProducto BETWEEN vn_IDProducto_inicio AND vn_IDProducto_fin) LOOP 
        
        DBMS_OUTPUT.PUT_LINE('Registro: ' || vr_tbProductos.nIDProducto); 
        DBMS_OUTPUT.PUT_LINE('El producto es: ' || vr_tbProductos.vDesProducto); 
        DBMS_OUTPUT.PUT_LINE('El número de unidades recibidas es: ' || vr_tbProductos.nUnidades); 
        DBMS_OUTPUT.PUT_LINE('El precio unitario es: ' || vr_tbProductos.nPrecioUnitario); 
        DBMS_OUTPUT.PUT_LINE('La fecha de entrega es: ' || TO_CHAR(vr_tbProductos.dFechaAlta, 'DD/MM/YYYY'));
        DBMS_OUTPUT.PUT_LINE('---------------------------------------------------------------------------'); 
        
    END LOOP;
    
    vn_IDProducto_inicio    := 1;
    vn_IDProducto_fin       := 3;
    
    FOR vr_tbProductos IN (SELECT * FROM tbProductos WHERE nIDProducto BETWEEN vn_IDProducto_inicio AND vn_IDProducto_fin) LOOP 
        
        DBMS_OUTPUT.PUT_LINE('Registro: ' || vr_tbProductos.nIDProducto); 
        DBMS_OUTPUT.PUT_LINE('El producto es: ' || vr_tbProductos.vDesProducto); 
        DBMS_OUTPUT.PUT_LINE('El número de unidades recibidas es: ' || vr_tbProductos.nUnidades); 
        DBMS_OUTPUT.PUT_LINE('El precio unitario es: ' || vr_tbProductos.nPrecioUnitario); 
        DBMS_OUTPUT.PUT_LINE('La fecha de entrega es: ' || TO_CHAR(vr_tbProductos.dFechaAlta, 'DD/MM/YYYY'));
        DBMS_OUTPUT.PUT_LINE('---------------------------------------------------------------------------'); 
        
    END LOOP;
    
END;
/


-----------------------------------------------------------------------------------------
-- Cursor explícito estático
-----------------------------------------------------------------------------------------
DECLARE
    vn_IDProducto_inicio    TBPRODUCTOS.NIDPRODUCTO%TYPE := 2;
    vn_IDProducto_fin       TBPRODUCTOS.NIDPRODUCTO%TYPE := 4;
    
    CURSOR c_tbProductos (pin_IDProducto_ini TBPRODUCTOS.NIDPRODUCTO%TYPE, 
                          pin_IDProducto_fin TBPRODUCTOS.NIDPRODUCTO%TYPE) 
    IS 
        SELECT * 
          FROM tbProductos 
         WHERE nIDProducto BETWEEN vn_IDProducto_inicio AND vn_IDProducto_fin;
        
BEGIN 
	
	FOR vr_tbProductos IN c_tbProductos(vn_IDProducto_inicio, vn_IDProducto_fin) LOOP 
        
        DBMS_OUTPUT.PUT_LINE('Registro: ' || vr_tbProductos.nIDProducto); 
        DBMS_OUTPUT.PUT_LINE('El producto es: ' || vr_tbProductos.vDesProducto); 
        DBMS_OUTPUT.PUT_LINE('El número de unidades recibidas es: ' || vr_tbProductos.nUnidades); 
        DBMS_OUTPUT.PUT_LINE('El precio unitario es: ' || vr_tbProductos.nPrecioUnitario); 
        DBMS_OUTPUT.PUT_LINE('La fecha de entrega es: ' || TO_CHAR(vr_tbProductos.dFechaAlta, 'DD/MM/YYYY'));
        DBMS_OUTPUT.PUT_LINE('---------------------------------------------------------------------------'); 
        
    END LOOP;
    
    vn_IDProducto_inicio    := 1;
    vn_IDProducto_fin       := 3;
    
    FOR vr_tbProductos IN c_tbProductos(vn_IDProducto_inicio, 
                                        vn_IDProducto_fin)  
    LOOP 
        
        DBMS_OUTPUT.PUT_LINE('Registro: ' || vr_tbProductos.nIDProducto); 
        DBMS_OUTPUT.PUT_LINE('El producto es: ' || vr_tbProductos.vDesProducto); 
        DBMS_OUTPUT.PUT_LINE('El número de unidades recibidas es: ' || vr_tbProductos.nUnidades); 
        DBMS_OUTPUT.PUT_LINE('El precio unitario es: ' || vr_tbProductos.nPrecioUnitario); 
        DBMS_OUTPUT.PUT_LINE('La fecha de entrega es: ' || TO_CHAR(vr_tbProductos.dFechaAlta, 'DD/MM/YYYY'));
        DBMS_OUTPUT.PUT_LINE('---------------------------------------------------------------------------'); 
        
    END LOOP;
    
END;
/