CREATE TABLE web_usuario (
  id bigint(20) NOT NULL,
  nome varchar(45) COLLATE utf8_bin NOT NULL,
  usuario varchar(25) COLLATE utf8_bin NOT NULL,
  senha varchar(20) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


ALTER TABLE web_usuario
  ADD PRIMARY KEY (id);

ALTER TABLE web_usuario
  MODIFY id bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=0;


INSERT INTO web_usuario (nome, usuario, senha) VALUES('André Luiz', 'andre', '1234');
INSERT INTO web_usuario (nome, usuario, senha) VALUES('Marcelo Castro', 'marcelo', '1234');
INSERT INTO web_usuario (nome, usuario, senha) VALUES('Natasha Martins', 'nat', '1234');
INSERT INTO web_usuario (nome, usuario, senha) VALUES('Lanna Sofia', 'lanna', '1234');
INSERT INTO web_usuario (nome, usuario, senha) VALUES('Alice Natario', 'alice', '1234');