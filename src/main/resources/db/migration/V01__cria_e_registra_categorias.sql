--
-- Estrutura da tabela web_categoria
--

CREATE TABLE web_categoria (
  id bigint(20) NOT NULL,
  descricao varchar(50) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Indexes for table web_categoria
--
ALTER TABLE web_categoria
  ADD PRIMARY KEY (id);
  
--
-- AUTO_INCREMENT for table web_categoria
--
ALTER TABLE web_categoria
  MODIFY id bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=0;
  

--
-- Extraindo dados da tabela web_categoria
--

INSERT INTO web_categoria (descricao) VALUES ('Sucos');
INSERT INTO web_categoria (descricao) VALUES ('Refeições');
INSERT INTO web_categoria (descricao) VALUES ('Doces e Sobremesas');
INSERT INTO web_categoria (descricao) VALUES ('Porções');
INSERT INTO web_categoria (descricao) VALUES ('Lanches');
INSERT INTO web_categoria (descricao) VALUES ('Pizzas');
INSERT INTO web_categoria (descricao) VALUES ('Cervejas');
INSERT INTO web_categoria (descricao) VALUES ('Refrigerantes');





