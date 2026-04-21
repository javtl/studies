CREATE TABLE tb_Productos (nIDProducto       NUMBER(3) PRIMARY KEY,
						   vDeProducto       VARCHAR2(50 CHAR),
						   nUnidades         NUMBER(4),
						   nPrecioUnitario   NUMBER(6,2),
						   dFechaAlta	     DATE
						   );