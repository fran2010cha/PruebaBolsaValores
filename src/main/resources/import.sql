INSERT INTO plataformas (codigo, nombre) VALUES ('PACTO', 'Plataforma de generacion de pagares');
INSERT INTO plataformas (codigo, nombre) VALUES ('DEPO', 'Plataforma de boveda de valores');
INSERT INTO plataformas (codigo, nombre) VALUES ('BAKO', 'Plataforma de backoffice');
INSERT INTO plataformas (codigo, nombre) VALUES ('PLATGI', 'Plataforma digital');

INSERT INTO evento (cantidad_veces,descripcion, fecha_evento, valor_unitario, plataforma_id) VALUES ( 2, 'Consulta de informacion bursatil', '2022-09-01', 20.5, 1);
INSERT INTO evento (cantidad_veces,descripcion, fecha_evento, valor_unitario, plataforma_id) VALUES ( 1, 'Emisión de título valor', '2022-08-30', 200, 1);
INSERT INTO evento (cantidad_veces,descripcion, fecha_evento, valor_unitario, plataforma_id) VALUES ( 3, 'Generación de reportes operativos', '2022-09-01',55.9, 2);
INSERT INTO evento (cantidad_veces,descripcion, fecha_evento, valor_unitario, plataforma_id) VALUES ( 4, 'Custodia de titulo valor', '2022-09-01', 100, 3);
INSERT INTO evento (cantidad_veces,descripcion, fecha_evento, valor_unitario, plataforma_id) VALUES ( 4, 'Complementación de operacion', '2022-08-30', 32, 4);
