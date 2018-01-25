CREATE TABLE web_mesa (
  id bigint(20) NOT NULL,
  numero varchar(45) COLLATE utf8_bin NOT NULL,
  estado int COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

ALTER TABLE web_mesa
  ADD PRIMARY KEY (id);

ALTER TABLE web_mesa
  MODIFY id bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11; 
  
INSERT INTO web_mesa (id, numero, estado) VALUES
(1, 'Mesa 1', 0),
(2, 'Mesa 2', 0),
(3, 'Mesa 3', 0),
(4, 'Mesa 4', 0),
(5, 'Mesa 5', 1),
(6, 'Mesa 6', 1),
(7, 'Mesa 7', 0),
(8, 'Mesa 8', 0),
(9, 'Mesa 9', 0),
(10,'Mesa 10',0);