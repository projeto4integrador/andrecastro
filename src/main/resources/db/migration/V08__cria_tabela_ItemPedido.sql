--
-- Estrutura da tabela web_item_pedido
--

CREATE TABLE web_item_pedido (
  id bigint(20) NOT NULL,
  id_produto bigint(20) NOT NULL,
  id_pedido bigint(20) NOT NULL,
  quantidade varchar(45) COLLATE utf8_bin NOT NULL,
  valor_total double NOT NULL,
  observacao varchar(500) COLLATE utf8_bin
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


ALTER TABLE web_item_pedido
  ADD PRIMARY KEY (id),
  ADD KEY fk_pedido_id (id_pedido),
  ADD KEY fk_produto_id (id_produto);
  

ALTER TABLE web_item_pedido
  MODIFY id bigint(20) NOT NULL AUTO_INCREMENT;

 ALTER TABLE web_item_pedido
  ADD CONSTRAINT fk_pedido_id FOREIGN KEY (id_pedido) REFERENCES web_pedido (id),
  ADD CONSTRAINT fk_produto_id FOREIGN KEY (id_produto) REFERENCES web_produto (id);