CREATE TABLE fabricantes (
	cod_fabricante INT(3) NOT NULL,
    nombre VARCHAR(15),
    pais VARCHAR(15),
    CHECK (nombre=UPPER(nombre)),
    CHECK (pais=UPPER(nombre))
);
CREATE TABLE articulos(
	articulo VARCHAR(20) NOT NULL,
    cod_fabricante INT(3) NOT NULL,
    peso INT(3) NOT NULL,
    categoria VARCHAR(10) NOT NULL CHECK(categoria IN('Primera','Segunda','Tercera')),
    precio_venta INT(4) CHECK(precio_venta > 0),
    precio_costo INT(4) CHECK (precio_costo > 0),
    existencias INT(5),
    PRIMARY KEY (articulo,cod_fabricante,peso,categoria)
    
);

CREATE TABLE tiendas(
	nif VARCHAR(10) NOT NULL,
    nombre VARCHAR(20),
    direccion VARCHAR(20),
    poblacion VARCHAR(20),
    provincia VARCHAR(20),
    codpostal INT(5)
);

CREATE TABLE pedidos(
	nif VARCHAR(10) NOT NULL,
    articulo VARCHAR (20) NOT NULL,
    cod_fabricante INT(3) NOT NULL,
    peso INT(3) NOT NULL,
    categoria VARCHAR(10) NOT NULL,
    fecha_pedido DATE NOT NULL,
    unidades_pedidas INT(4),
    CONSTRAINT pk_pedidos PRIMARY KEY(articulo,cod_fabricante,peso,categoria,fecha_pedido),
	CONSTRAINT fk_fabricantes FOREIGN KEY (cod_fabricante) REFERENCES fabricantes,
	CONSTRAINT fk_nif FOREIGN KEY (nif) REFERENCES tiendas
);

CREATE TABLE ventas(
	nif VARCHAR(10) NOT NULL,
    articulo VARCHAR(20) NOT NULL,
    cod_fabricante INT(3) NOT NULL,
    peso INT(3) NOT NULL,
    categoria VARCHAR(10) NOT NULL CHECK(categoria IN('Primera','Segunda','Tercera')),
    fecha_venta DATE NOT NULL,
    unidades_vendidas INT(4) CHECK(unidades_vendidas > 0),
    CONSTRAINT pk_ventas PRIMARY KEY (nif,articulo,cod_fabricante,peso,categoria,fecha_nacimiento),
    CONSTRAINT fk_fabricantes FOREIGN KEY (cod_fabricante) REFERENCES fabricantes,
	CONSTRAINT fk_nif FOREIGN KEY (nif) REFERENCES tiendas
);



