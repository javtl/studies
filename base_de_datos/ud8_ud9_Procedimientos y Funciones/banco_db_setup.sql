-- =============================================================================
--  banco_db — Script de creación completo
--  Motor: MariaDB 10.4+
--  Descripción: Sistema de gestión bancaria para la prueba final de
--               vistas, usuarios y niveles de acceso
-- =============================================================================

DROP DATABASE IF EXISTS banco_db;
CREATE DATABASE banco_db
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

USE banco_db;

-- -----------------------------------------------------------------------------
--  1. TABLAS
-- -----------------------------------------------------------------------------

-- Sucursales del banco
CREATE TABLE sucursales (
    id          INT           AUTO_INCREMENT PRIMARY KEY,
    nombre      VARCHAR(100)  NOT NULL,
    ciudad      VARCHAR(80)   NOT NULL,
    direccion   VARCHAR(200),
    telefono    VARCHAR(20),
    activa      TINYINT(1)    NOT NULL DEFAULT 1
);

-- Empleados del banco
CREATE TABLE empleados (
    id           INT            AUTO_INCREMENT PRIMARY KEY,
    nombre       VARCHAR(100)   NOT NULL,
    email        VARCHAR(150)   NOT NULL UNIQUE,
    cargo        VARCHAR(80)    NOT NULL,
    salario      DECIMAL(10,2)  NOT NULL,
    sucursal_id  INT            NOT NULL,
    fecha_alta   DATE           NOT NULL DEFAULT (CURRENT_DATE),
    activo       TINYINT(1)     NOT NULL DEFAULT 1,
    CONSTRAINT fk_emp_suc
        FOREIGN KEY (sucursal_id) REFERENCES sucursales(id)
        ON DELETE RESTRICT ON UPDATE CASCADE,
    CONSTRAINT chk_salario_emp CHECK (salario > 0)
);

-- Clientes del banco (datos personales sensibles)
CREATE TABLE clientes (
    id           INT            AUTO_INCREMENT PRIMARY KEY,
    nombre       VARCHAR(100)   NOT NULL,
    dni          CHAR(9)        NOT NULL UNIQUE,
    email        VARCHAR(150),
    telefono     VARCHAR(20),
    fecha_nac    DATE,
    sucursal_id  INT,
    fecha_alta   DATE           NOT NULL DEFAULT (CURRENT_DATE),
    CONSTRAINT fk_cli_suc
        FOREIGN KEY (sucursal_id) REFERENCES sucursales(id)
        ON DELETE SET NULL ON UPDATE CASCADE
);

-- Cuentas bancarias (datos financieros muy sensibles)
CREATE TABLE cuentas (
    id           INT             AUTO_INCREMENT PRIMARY KEY,
    iban         CHAR(24)        NOT NULL UNIQUE,
    cliente_id   INT             NOT NULL,
    tipo         ENUM('corriente','ahorro','plazo_fijo') NOT NULL DEFAULT 'corriente',
    saldo        DECIMAL(14,2)   NOT NULL DEFAULT 0.00,
    tae          DECIMAL(5,4)    NOT NULL DEFAULT 0.0000,
    fecha_apertura DATE          NOT NULL DEFAULT (CURRENT_DATE),
    estado       ENUM('activa','bloqueada','cancelada') NOT NULL DEFAULT 'activa',
    CONSTRAINT fk_cta_cli
        FOREIGN KEY (cliente_id) REFERENCES clientes(id)
        ON DELETE RESTRICT ON UPDATE CASCADE,
    CONSTRAINT chk_saldo CHECK (saldo >= 0)
);

-- Movimientos / transacciones (historial completo)
CREATE TABLE movimientos (
    id              INT             AUTO_INCREMENT PRIMARY KEY,
    cuenta_id       INT             NOT NULL,
    tipo            ENUM('ingreso','cargo','transferencia','comision') NOT NULL,
    importe         DECIMAL(14,2)   NOT NULL,
    saldo_tras_op   DECIMAL(14,2)   NOT NULL,
    descripcion     VARCHAR(200),
    fecha_hora      DATETIME        NOT NULL DEFAULT CURRENT_TIMESTAMP,
    cuenta_destino  INT,
    CONSTRAINT fk_mov_cta
        FOREIGN KEY (cuenta_id) REFERENCES cuentas(id)
        ON DELETE RESTRICT ON UPDATE CASCADE,
    CONSTRAINT chk_importe_mov CHECK (importe > 0)
);

-- Préstamos concedidos (datos financieros confidenciales)
CREATE TABLE prestamos (
    id              INT             AUTO_INCREMENT PRIMARY KEY,
    cliente_id      INT             NOT NULL,
    sucursal_id     INT             NOT NULL,
    capital         DECIMAL(12,2)   NOT NULL,
    tipo_interes    DECIMAL(5,4)    NOT NULL,
    plazo_meses     INT             NOT NULL,
    cuota_mensual   DECIMAL(10,2)   NOT NULL,
    saldo_pendiente DECIMAL(12,2)   NOT NULL,
    estado          ENUM('solicitado','activo','cancelado','impagado') NOT NULL DEFAULT 'solicitado',
    fecha_concesion DATE,
    CONSTRAINT fk_prest_cli
        FOREIGN KEY (cliente_id)  REFERENCES clientes(id)
        ON DELETE RESTRICT ON UPDATE CASCADE,
    CONSTRAINT fk_prest_suc
        FOREIGN KEY (sucursal_id) REFERENCES sucursales(id)
        ON DELETE RESTRICT ON UPDATE CASCADE,
    CONSTRAINT chk_capital CHECK (capital > 0),
    CONSTRAINT chk_plazo   CHECK (plazo_meses > 0)
);

-- Auditoría de accesos al sistema bancario
CREATE TABLE auditoria (
    id          INT           AUTO_INCREMENT PRIMARY KEY,
    usuario_bd  VARCHAR(100)  NOT NULL,
    operacion   VARCHAR(200)  NOT NULL,
    tabla_obj   VARCHAR(80),
    fecha_hora  DATETIME      NOT NULL DEFAULT CURRENT_TIMESTAMP,
    ip_origen   VARCHAR(45),
    resultado   ENUM('ok','denegado','error') NOT NULL DEFAULT 'ok'
);

-- Alertas de fraude (acceso ultrarestringido)
CREATE TABLE alertas_fraude (
    id            INT      AUTO_INCREMENT PRIMARY KEY,
    cuenta_id     INT      NOT NULL,
    tipo_alerta   VARCHAR(100) NOT NULL,
    descripcion   TEXT,
    riesgo        ENUM('bajo','medio','alto','critico') NOT NULL DEFAULT 'medio',
    resuelta      TINYINT(1) NOT NULL DEFAULT 0,
    fecha_hora    DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_alerta_cta
        FOREIGN KEY (cuenta_id) REFERENCES cuentas(id)
        ON DELETE RESTRICT ON UPDATE CASCADE
);

-- -----------------------------------------------------------------------------
--  2. ÍNDICES
-- -----------------------------------------------------------------------------
CREATE INDEX idx_emp_suc        ON empleados(sucursal_id);
CREATE INDEX idx_cli_suc        ON clientes(sucursal_id);
CREATE INDEX idx_cta_cli        ON cuentas(cliente_id);
CREATE INDEX idx_cta_estado     ON cuentas(estado);
CREATE INDEX idx_mov_cta        ON movimientos(cuenta_id);
CREATE INDEX idx_mov_fecha      ON movimientos(fecha_hora);
CREATE INDEX idx_prest_cli      ON prestamos(cliente_id);
CREATE INDEX idx_prest_estado   ON prestamos(estado);
CREATE INDEX idx_audit_usuario  ON auditoria(usuario_bd);
CREATE INDEX idx_audit_fecha    ON auditoria(fecha_hora);
CREATE INDEX idx_alerta_riesgo  ON alertas_fraude(riesgo);
CREATE INDEX idx_alerta_resuelta ON alertas_fraude(resuelta);

-- -----------------------------------------------------------------------------
--  3. DATOS DE MUESTRA
-- -----------------------------------------------------------------------------

-- Sucursales
INSERT INTO sucursales (nombre, ciudad, direccion, telefono) VALUES
    ('Sucursal Central',       'Madrid',    'Paseo de la Castellana 45', '910001100'),
    ('Sucursal Goya',          'Madrid',    'Calle Goya 82',             '910002200'),
    ('Sucursal Diagonal',      'Barcelona', 'Av. Diagonal 350',          '932003300'),
    ('Sucursal Gran Vía',      'Bilbao',    'Gran Vía 28',               '944004400'),
    ('Sucursal Triana',        'Sevilla',   'Calle Betis 14',            '954005500');

-- Empleados
INSERT INTO empleados (nombre, email, cargo, salario, sucursal_id, fecha_alta) VALUES
    ('Carmen Ruiz',      'c.ruiz@banco.es',      'Directora Central',       5800.00, 1, '2017-03-01'),
    ('Marcos Gil',       'm.gil@banco.es',        'Director Goya',           4200.00, 2, '2019-06-10'),
    ('Laura Puig',       'l.puig@banco.es',       'Directora Diagonal',      4300.00, 3, '2018-11-20'),
    ('Iker Etxea',       'i.etxea@banco.es',      'Director Bilbao',         4100.00, 4, '2020-01-15'),
    ('Rosa Morales',     'r.morales@banco.es',    'Directora Triana',        4000.00, 5, '2020-04-01'),
    ('Pedro Vega',       'p.vega@banco.es',       'Analista de Riesgos',     3200.00, 1, '2021-02-28'),
    ('Silvia Torres',    's.torres@banco.es',     'Gestora de Clientes',     2900.00, 1, '2021-07-05'),
    ('Andres Lamas',     'a.lamas@banco.es',      'Cajero',                  2100.00, 2, '2022-03-14'),
    ('Nuria Sanz',       'n.sanz@banco.es',       'Gestor Creditos',         3100.00, 3, '2021-09-01'),
    ('Elena Mora',       'e.mora@banco.es',       'Analista Fraude',         3500.00, 1, '2020-10-10'),
    ('Tomas Blanco',     't.blanco@banco.es',     'Cajero',                  2100.00, 5, '2023-01-09'),
    ('Lucia Herrero',    'l.herrero@banco.es',    'Auditora Interna',        3800.00, 1, '2019-05-15');

-- Clientes
INSERT INTO clientes (nombre, dni, email, telefono, fecha_nac, sucursal_id, fecha_alta) VALUES
    ('Antonio Fernandez', '12345678A', 'a.fernandez@mail.es', '600111222', '1980-05-12', 1, '2020-01-10'),
    ('Maria Gonzalez',    '23456789B', 'm.gonzalez@mail.es',  '600222333', '1975-08-23', 1, '2019-06-15'),
    ('Jose Martinez',     '34567890C', 'j.martinez@mail.es',  '600333444', '1990-11-30', 2, '2021-03-22'),
    ('Ana Lopez',         '45678901D', 'a.lopez@mail.es',     '600444555', '1985-02-17', 2, '2020-09-05'),
    ('Carlos Sanchez',    '56789012E', 'c.sanchez@mail.es',   '600555666', '1992-07-08', 3, '2022-01-18'),
    ('Isabel Romero',     '67890123F', 'i.romero@mail.es',    '600666777', '1968-04-25', 3, '2018-11-03'),
    ('Miguel Torres',     '78901234G', 'm.torres@mail.es',    '600777888', '1978-09-14', 4, '2021-07-30'),
    ('Carmen Diaz',       '89012345H', 'c.diaz@mail.es',      '600888999', '1983-12-01', 5, '2020-05-20'),
    ('Luis Jimenez',      '90123456I', 'l.jimenez@mail.es',   '600999000', '1995-03-06', 1, '2023-02-14'),
    ('Pilar Ruiz',        '01234567J', 'p.ruiz@mail.es',      '601000111', '1970-06-28', 4, '2017-08-09');

-- Cuentas
INSERT INTO cuentas (iban, cliente_id, tipo, saldo, tae, fecha_apertura, estado) VALUES
    ('ES7621000418401234567891', 1,  'corriente',  15420.50, 0.0000, '2020-01-10', 'activa'),
    ('ES7621000418401234567892', 1,  'ahorro',     42000.00, 0.0150, '2020-01-10', 'activa'),
    ('ES7621000418401234567893', 2,  'corriente',   8750.25, 0.0000, '2019-06-15', 'activa'),
    ('ES7621000418401234567894', 3,  'corriente',   2100.00, 0.0000, '2021-03-22', 'activa'),
    ('ES7621000418401234567895', 4,  'ahorro',     18500.00, 0.0100, '2020-09-05', 'activa'),
    ('ES7621000418401234567896', 5,  'corriente',   5300.75, 0.0000, '2022-01-18', 'activa'),
    ('ES7621000418401234567897', 6,  'plazo_fijo', 75000.00, 0.0250, '2018-11-03', 'activa'),
    ('ES7621000418401234567898', 7,  'corriente',   3200.00, 0.0000, '2021-07-30', 'activa'),
    ('ES7621000418401234567899', 8,  'corriente',   9800.00, 0.0000, '2020-05-20', 'activa'),
    ('ES7621000418401234567900', 9,  'ahorro',      6500.00, 0.0100, '2023-02-14', 'activa'),
    ('ES7621000418401234567901', 10, 'corriente',  22000.00, 0.0000, '2017-08-09', 'activa'),
    ('ES7621000418401234567902', 10, 'plazo_fijo', 50000.00, 0.0300, '2019-01-15', 'activa'),
    ('ES7621000418401234567903', 2,  'corriente',    450.00, 0.0000, '2022-05-01', 'bloqueada');

-- Movimientos
INSERT INTO movimientos (cuenta_id, tipo, importe, saldo_tras_op, descripcion, fecha_hora) VALUES
    (1, 'ingreso',       3000.00, 15420.50, 'Nomina marzo 2026',          '2026-03-28 09:00:00'),
    (1, 'cargo',          120.50,  15300.00, 'Recibo electricidad',        '2026-03-29 10:15:00'),
    (1, 'transferencia',  500.00,  14800.00, 'Transferencia a cuenta 4',   '2026-03-30 11:30:00'),
    (2, 'ingreso',       2000.00, 42000.00, 'Ahorro mensual',              '2026-03-01 08:00:00'),
    (3, 'cargo',           80.00,  8750.25, 'Comision mantenimiento',      '2026-03-01 00:00:01'),
    (4, 'ingreso',        500.00,  2100.00, 'Transferencia recibida',      '2026-03-30 11:30:00'),
    (7, 'ingreso',      75000.00, 75000.00, 'Constitucion plazo fijo',     '2018-11-03 10:00:00'),
    (9, 'ingreso',       9800.00,  9800.00, 'Ingreso inicial',             '2020-05-20 09:00:00'),
    (11,'ingreso',       2200.00, 22000.00, 'Renta alquiler',              '2026-03-05 12:00:00'),
    (13,'cargo',         450.00,    450.00, 'Cargo no autorizado sospechoso','2026-03-15 03:22:00');

-- Prestamos
INSERT INTO prestamos (cliente_id, sucursal_id, capital, tipo_interes, plazo_meses, cuota_mensual, saldo_pendiente, estado, fecha_concesion) VALUES
    (1, 1, 150000.00, 0.0285, 300, 698.50,  148200.00, 'activo',     '2022-06-01'),
    (3, 2,  12000.00, 0.0599,  60, 231.80,    8400.00, 'activo',     '2023-01-15'),
    (5, 3,  20000.00, 0.0450,  84, 273.20,   18600.00, 'activo',     '2022-09-20'),
    (7, 4,   8000.00, 0.0699,  36, 247.00,       0.00, 'cancelado',  '2022-03-10'),
    (8, 5,  50000.00, 0.0320, 180, 349.00,   46000.00, 'activo',     '2021-11-05'),
    (2, 1,   5000.00, 0.0799,  24, 226.60,    3200.00, 'impagado',   '2024-02-01');

-- Auditoría inicial
INSERT INTO auditoria (usuario_bd, operacion, tabla_obj, fecha_hora, ip_origen, resultado) VALUES
    ('cajero_app',    'SELECT',  'cuentas',        '2026-03-28 09:05:00', '192.168.1.10', 'ok'),
    ('gestor_app',    'UPDATE',  'clientes',       '2026-03-28 10:20:00', '192.168.1.11', 'ok'),
    ('cajero_app',    'SELECT',  'prestamos',      '2026-03-28 11:00:00', '192.168.1.10', 'denegado'),
    ('externo_audit', 'SELECT',  'alertas_fraude', '2026-03-29 08:30:00', '10.0.5.22',   'denegado'),
    ('gestor_app',    'INSERT',  'movimientos',    '2026-03-29 14:45:00', '192.168.1.11', 'ok'),
    ('analista_app',  'SELECT',  'prestamos',      '2026-03-30 09:00:00', '192.168.2.50', 'ok'),
    ('cajero_app',    'UPDATE',  'cuentas',        '2026-03-30 10:10:00', '192.168.1.10', 'denegado'),
    ('root',          'SELECT',  'alertas_fraude', '2026-03-30 22:00:00', '127.0.0.1',    'ok');

-- Alertas de fraude
INSERT INTO alertas_fraude (cuenta_id, tipo_alerta, descripcion, riesgo, resuelta) VALUES
    (13, 'Cargo nocturno inusual',   'Cargo de 450 EUR a las 3:22 AM desde IP extranjera', 'alto',    0),
    (1,  'Patron transferencias',    'Tres transferencias en menos de 1 hora al mismo destino', 'medio', 0),
    (11, 'Ingreso origen sospechoso','Ingreso de 22.000 EUR desde cuenta sin historial',  'critico', 0);

-- -----------------------------------------------------------------------------
--  4. PROCEDIMIENTO ALMACENADO
-- -----------------------------------------------------------------------------
DELIMITER $$
CREATE PROCEDURE registrar_operacion(
    IN p_usuario   VARCHAR(100),
    IN p_operacion VARCHAR(200),
    IN p_tabla     VARCHAR(80),
    IN p_ip        VARCHAR(45),
    IN p_resultado ENUM('ok','denegado','error')
)
BEGIN
    INSERT INTO auditoria (usuario_bd, operacion, tabla_obj, ip_origen, resultado)
    VALUES (p_usuario, p_operacion, p_tabla, p_ip, p_resultado);
END$$
DELIMITER ;

-- -----------------------------------------------------------------------------
--  5. VERIFICACIÓN (descomenta para comprobar)
-- -----------------------------------------------------------------------------
-- SELECT 'sucursales',      COUNT(*) FROM sucursales
-- UNION ALL SELECT 'empleados',   COUNT(*) FROM empleados
-- UNION ALL SELECT 'clientes',    COUNT(*) FROM clientes
-- UNION ALL SELECT 'cuentas',     COUNT(*) FROM cuentas
-- UNION ALL SELECT 'movimientos', COUNT(*) FROM movimientos
-- UNION ALL SELECT 'prestamos',   COUNT(*) FROM prestamos
-- UNION ALL SELECT 'auditoria',   COUNT(*) FROM auditoria
-- UNION ALL SELECT 'alertas_fraude', COUNT(*) FROM alertas_fraude;
