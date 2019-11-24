DROP TABLE IF EXISTS usuario;

CREATE TABLE usuario (
  usuario_id        INT PRIMARY KEY NOT NULL,
  nome_usuario   TEXT NOT NULL);


INSERT INTO usuario (usuario_id,  nome_usuario)
VALUES ('1', 'Marcia');
INSERT INTO usuario (usuario_id,  nome_usuario)
VALUES ('2', 'Patricia');
INSERT INTO usuario (usuario_id,  nome_usuario)
VALUES ('3', 'Victoria');
INSERT INTO usuario (usuario_id,  nome_usuario)
VALUES ('4', 'Meiry');