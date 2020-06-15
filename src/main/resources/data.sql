INSERT INTO db_ironfood.clientes(id, endereco, nome) VALUES(1, 'QNN 06 Conjunto I Casa 31','Naruto Uzumaki');
INSERT INTO db_ironfood.clientes(id, endereco, nome) VALUES(2, 'QNN 08 Conjunto I Casa 31','Sasuke Uchiha');
INSERT INTO db_ironfood.clientes(id, endereco, nome) VALUES(3, 'QNN 10 Conjunto B Casa 24','Shikamaru Nara');

INSERT INTO db_ironfood.produtos(id, nome, preco) VALUES(1, 'Cachorro Quente no Molho', 10.90);
INSERT INTO db_ironfood.produtos(id, nome, preco) VALUES(2, 'Cachorro Quente na Chapa', 11.90);
INSERT INTO db_ironfood.produtos(id, nome, preco) VALUES(3, 'Hambúrguer de Carne', 10.90);
INSERT INTO db_ironfood.produtos(id, nome, preco) VALUES(4, 'Hambúrguer de Carne Vegano', 20.90);
INSERT INTO db_ironfood.produtos(id, nome, preco) VALUES(5, 'Hambúrguer de Frango', 10.90);
INSERT INTO db_ironfood.produtos(id, nome, preco) VALUES(6, 'Refrigerante em Lata (300ml)', 5.90);
INSERT INTO db_ironfood.produtos(id, nome, preco) VALUES(7, 'Suco Natural', 6.90);
INSERT INTO db_ironfood.produtos(id, nome, preco) VALUES(8, 'Água 500ml', 3.90);

INSERT INTO db_ironfood.pedidos(id, data, total, cliente_id) VALUES(1, now(),17.80,1);
INSERT INTO db_ironfood.pedidos(id, data, total, cliente_id) VALUES(2, now(),17.80,1);
INSERT INTO db_ironfood.pedidos(id, data, total, cliente_id) VALUES(3, now(),17.80,1);

INSERT INTO db_ironfood.pedidos_produto(pedidos_id, produto_id) VALUES(1,7);
INSERT INTO db_ironfood.pedidos_produto(pedidos_id, produto_id) VALUES(1,8);
INSERT INTO db_ironfood.pedidos_produto(pedidos_id, produto_id) VALUES(2,8);
INSERT INTO db_ironfood.pedidos_produto(pedidos_id, produto_id) VALUES(2,7);
INSERT INTO db_ironfood.pedidos_produto(pedidos_id, produto_id) VALUES(3,8);
INSERT INTO db_ironfood.pedidos_produto(pedidos_id, produto_id) VALUES(3,7);