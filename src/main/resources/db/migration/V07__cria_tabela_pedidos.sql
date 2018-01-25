CREATE TABLE web_pedido (
  id bigint(20) NOT NULL,
  id_usuario bigint(20) NOT NULL,
  id_mesa bigint(20) NOT NULL,
  valor double NOT NULL,
  estado int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Indexes for table web_pedido
--

ALTER TABLE web_pedido
  ADD PRIMARY KEY (id),
  ADD KEY fk_mesa_id (id_mesa),
  ADD KEY fk_usuario_id (id_usuario);
  
--
-- AUTO_INCREMENT for table web_pedido
--
ALTER TABLE web_pedido
  MODIFY id bigint(20) NOT NULL AUTO_INCREMENT;
  
--
-- Limitadores para a tabela web_pedido
--
ALTER TABLE web_pedido
  ADD CONSTRAINT fk_mesa_id FOREIGN KEY (id_mesa) REFERENCES web_mesa (id),
  ADD CONSTRAINT fk_usuario_id FOREIGN KEY (id_usuario) REFERENCES web_usuario (id);  