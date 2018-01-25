--
-- Estrutura da tabela web_preparo_cozinha
--

CREATE TABLE web_preparo_cozinha (
  id bigint(20) NOT NULL,
  id_pedido bigint(20) NOT NULL,
  observacao varchar(500) COLLATE utf8_bin,
  hora datetime NOT NULL,
  estado int COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


ALTER TABLE web_preparo_cozinha
  ADD PRIMARY KEY (id),
  ADD KEY fk_id_pedido (id_pedido);
  
  ALTER TABLE web_preparo_cozinha
  MODIFY id bigint(20) NOT NULL AUTO_INCREMENT;
  
  ALTER TABLE web_preparo_cozinha
  ADD CONSTRAINT fk_id_pedido FOREIGN KEY (id_pedido) REFERENCES web_pedido (id);