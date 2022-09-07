INSERT INTO plataformas (id,codigo, nombre) VALUES (1,'PACTO', 'Plataforma de generacion de pagares');
INSERT INTO plataformas (id,codigo, nombre) VALUES (2,'DEPO', 'Plataforma de boveda de valores');
INSERT INTO plataformas (id,codigo, nombre) VALUES (3,'BAKO', 'Plataforma de backoffice');
INSERT INTO plataformas (id,codigo, nombre) VALUES (4,'PLATGI', 'Plataforma digital');

INSERT INTO evento (id_evento,cantidad_veces,descripcion, fecha_evento, valor_unitario, plataforma_id) VALUES ( 1,2, 'Consulta de informacion bursatil', '2022-09-01', 20.5, 1);
INSERT INTO evento (id_evento,cantidad_veces,descripcion, fecha_evento, valor_unitario, plataforma_id) VALUES ( 2,1, 'Emisión de título valor', '2022-08-30', 200, 1);
INSERT INTO evento (id_evento,cantidad_veces,descripcion, fecha_evento, valor_unitario, plataforma_id) VALUES ( 3,3, 'Generación de reportes operativos', '2022-09-01',55.9, 2);
INSERT INTO evento (id_evento,cantidad_veces,descripcion, fecha_evento, valor_unitario, plataforma_id) VALUES ( 4,4, 'Custodia de titulo valor', '2022-09-01', 100, 3);
INSERT INTO evento (id_evento,cantidad_veces,descripcion, fecha_evento, valor_unitario, plataforma_id) VALUES ( 5,4, 'Complementación de operacion', '2022-08-30', 32, 4);

CREATE TRIGGER db_prueba_backend.trigger_costos  AFTER INSERT ON db_prueba_backend.evento  FOR EACH ROW  insert into db_prueba_backend.costo (id_evento,plataforma_id,costo) values (NEW.id_evento,new.plataforma_id,NEW.cantidad_veces*NEW.valor_unitario);