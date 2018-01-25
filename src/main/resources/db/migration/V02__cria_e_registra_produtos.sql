--
-- Estrutura da tabela web_produto
--

CREATE TABLE web_produto (
  id bigint(20) NOT NULL,
  id_categoria bigint(20) NOT NULL,
  descricao varchar(50) COLLATE utf8_bin NOT NULL,
  valor double NOT NULL,
  situacao int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


--
-- Indexes for table web_produto
--
ALTER TABLE web_produto
  ADD PRIMARY KEY (id),
  ADD KEY fk_categoria_id (id_categoria);

--
-- AUTO_INCREMENT for table web_produto
--
ALTER TABLE web_produto
  MODIFY id bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Limitadores para a tabela web_produto
--
ALTER TABLE web_produto
  ADD CONSTRAINT fk_categoria_id FOREIGN KEY (id_categoria) REFERENCES web_categoria (id);
--
-- Extraindo dados da tabela web_produto
--

INSERT INTO web_produto (id, id_categoria, descricao, valor, situacao) VALUES
(1, 8, 'Refrigerante lata 350 ml', 4, 0),
(2, 8, 'Refrigerante 600 ml', 5, 0),
(3, 7, 'Cerveja lata', 4, 0),
(4, 1, 'Suco de limão', 2.5, 0),
(5, 8, 'Refrigerante 2 L', 6, 0),
(6, 3, 'Três chocolates', 5, 0),
(7, 3, 'Petit gateau', 8.6, 0),
(8, 2, 'Prato da segunda feira - Picadinho com batata', 13.8, 0),
(9, 2, 'Prato da terça feira - Linguiça aurora com ovo', 13.8, 0),
(10, 2, 'Prato da quarta feira - Bisteca com ovo', 13.8, 0),
(11, 2, 'Prata da quinta feira - Frango ao molho com batata', 13.8, 0),
(12, 2, 'Prata da sexta feira - Linguiça aurora simples', 13.8, 0),
(13, 4, 'Porção de Cenoura', 5.9, 0),
(14, 4, 'Porção de Carne - Espetinho', 9.9, 0);