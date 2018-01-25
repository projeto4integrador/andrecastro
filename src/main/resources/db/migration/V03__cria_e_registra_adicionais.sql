--
-- Estrutura da tabela web_adicional
--

CREATE TABLE web_adicional (
  id bigint(20) NOT NULL,
  descricao varchar(50) COLLATE utf8_bin NOT NULL,
  valor double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Indexes for table web_adicional
--
ALTER TABLE web_adicional
  ADD PRIMARY KEY (id);

--
-- AUTO_INCREMENT for table web_adicional
--

ALTER TABLE web_adicional
  MODIFY id bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Extraindo dados da tabela web_adicional
--

INSERT INTO web_adicional (id, descricao,valor) VALUES(1, 'Bacon', 3.5);
INSERT INTO web_adicional (id, descricao,valor) VALUES(2, 'Borda catupiry', 5.0);
INSERT INTO web_adicional (id, descricao,valor) VALUES(3, 'Borda cheddar', 5.0);
INSERT INTO web_adicional (id, descricao,valor) VALUES(4, 'Calabresa', 2.5);
INSERT INTO web_adicional (id, descricao,valor) VALUES(5, 'Cebola', 1);
INSERT INTO web_adicional (id, descricao,valor) VALUES(6, 'Champignon', 3.0);
INSERT INTO web_adicional (id, descricao,valor) VALUES(7, 'Chantilly',1.30);
INSERT INTO web_adicional (id, descricao,valor) VALUES(8, 'Frango desfiado',5.90);
INSERT INTO web_adicional (id, descricao,valor) VALUES(9, 'Hamburguer',2.90);
INSERT INTO web_adicional (id, descricao,valor) VALUES(10, 'Molho especial',2.50);
INSERT INTO web_adicional (id, descricao,valor) VALUES(11, 'Peito de peru',4.00);
INSERT INTO web_adicional (id, descricao,valor) VALUES(12, 'Queijo',1.50);
INSERT INTO web_adicional (id, descricao,valor) VALUES(13, 'Tomate seco',4.50);