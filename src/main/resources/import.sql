INSERT INTO tipo_preguntas (id, nombre) VALUES (1, 'Multiple');
INSERT INTO tipo_preguntas (id, nombre) VALUES (2, 'Abierta');

INSERT INTO preguntas (id, nombre, tipo_pregunta) VALUES (1, '¿Recomendaria el restaurante a un amigo?', 1);
INSERT INTO preguntas (id, nombre, tipo_pregunta) VALUES (2, '¿Cuál es su comida favorita?', 2);
INSERT INTO preguntas (id, nombre, tipo_pregunta) VALUES (3, '¿Que calificación tiene la comida?', 1);
INSERT INTO preguntas (id, nombre, tipo_pregunta) VALUES (4, '¿Qué se debe mejorar en el menú?', 2);

INSERT INTO opciones (id, nombre, preguntas ) VALUES (1, 'SI', 1);
INSERT INTO opciones (id, nombre, preguntas ) VALUES (2, 'NO', 1);
INSERT INTO opciones (id, nombre, preguntas ) VALUES (3, '', 2);
INSERT INTO opciones (id, nombre, preguntas ) VALUES (4, 'Excelente', 3);
INSERT INTO opciones (id, nombre, preguntas ) VALUES (5, 'Buena', 3);
INSERT INTO opciones (id, nombre, preguntas ) VALUES (6, 'Regular', 3);
INSERT INTO opciones (id, nombre, preguntas ) VALUES (7, 'Mala', 3);
INSERT INTO opciones (id, nombre, preguntas ) VALUES (8, '', 4);

INSERT INTO encuesta (id, nombre) VALUES (1, 'Encuesta Restaurante Robbin Food');
INSERT INTO encuesta (id, nombre) VALUES (2, 'Encuesta Restaurante Robbin Food Sucursal');


INSERT INTO encuesta_preguntas (id_pregunta, id_encuesta) VALUES (1,1);
INSERT INTO encuesta_preguntas (id_pregunta, id_encuesta) VALUES (2,1);
INSERT INTO encuesta_preguntas (id_pregunta, id_encuesta) VALUES (3,1);
INSERT INTO encuesta_preguntas (id_pregunta, id_encuesta) VALUES (4,1);
INSERT INTO encuesta_preguntas (id_pregunta, id_encuesta) VALUES (1,2);

INSERT INTO encuestado (id, identificacion, nombre ) VALUES (1,123, 'Pepito Perez');
INSERT INTO encuestado (id, identificacion, nombre ) VALUES (2,321, 'Maria Martinez');


