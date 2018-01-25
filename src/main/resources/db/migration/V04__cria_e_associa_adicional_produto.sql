--
-- Estrutura da tabela web_adicional_produto
--

CREATE TABLE web_adicional_produto (
  id_produto bigint(20) NOT NULL,
  id_adicional bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Indexes for table web_adicional_produto
--
ALTER TABLE web_adicional_produto
  ADD KEY fk_adicional (id_adicional),
  ADD KEY fk_produto (id_produto);

--
-- Limitadores para a tabela web_adicional_produto
--
ALTER TABLE web_adicional_produto
  ADD CONSTRAINT fk_adicional FOREIGN KEY (id_adicional) REFERENCES web_adicional (id),
  ADD CONSTRAINT fk_produto FOREIGN KEY (id_produto) REFERENCES web_produto (id);

--
-- Extraindo dados da tabela web_adicional_produto
--

INSERT INTO web_adicional_produto (id_produto, id_adicional) VALUES
(8,1),
(8,5),
(8,8),
(8,10),
(8,10),
(8,11),
(8,13),
(9,1),
(9,5),
(9,8),
(9,9),
(9,10),
(9,11),
(9,13),
(10,1),
(10,5),
(10,8),
(10,9),
(10,10),
(10,11),
(10,13),
(11,1),
(11,5),
(11,8),
(11,9),
(11,10),
(11,11),
(11,13),
(12,1),
(12,5),
(12,8),
(12,9),
(12,10),
(12,11),
(12,13),
(13,4),
(13,13),
(14,4),
(14,13);