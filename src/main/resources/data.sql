INSERT INTO db_ironfood.clientes(id, endereco, nome) VALUES(1, 'QNN 04 Conjunto A Casa 1001','Cliente 01');
INSERT INTO db_ironfood.clientes(id, endereco, nome) VALUES(2, 'QNN 06 Conjunto B Casa 1002','Cliente 02');
INSERT INTO db_ironfood.clientes(id, endereco, nome) VALUES(3, 'QNN 08 Conjunto C Casa 1003','Cliente 03');
INSERT INTO db_ironfood.clientes(id, endereco, nome) VALUES(4, 'QNN 10 Conjunto D Casa 1004','Cliente 04');

INSERT INTO db_ironfood.produtos(id, nome, preco) VALUES(1, 'Cachorro Quente (Lanche 01)', 10.90);
INSERT INTO db_ironfood.produtos(id, nome, preco) VALUES(2, 'Cachorro Quente (Lanche 02)', 10.90);
INSERT INTO db_ironfood.produtos(id, nome, preco) VALUES(3, 'Cachorro Quente (Lanche 03)', 10.90);
INSERT INTO db_ironfood.produtos(id, nome, preco) VALUES(4, 'Cachorro Quente (Lanche 04)', 10.90);

INSERT INTO db_ironfood.pedidos(id, data_lancamento, valor_total, cliente_id) VALUES(1, now(),65.40,1);
INSERT INTO db_ironfood.pedidos(id, data_lancamento, valor_total, cliente_id) VALUES(2, now(),65.40,2);
INSERT INTO db_ironfood.pedidos(id, data_lancamento, valor_total, cliente_id) VALUES(3, now(),65.40,3);
INSERT INTO db_ironfood.pedidos(id, data_lancamento, valor_total, cliente_id) VALUES(4, now(),65.40,4);
INSERT INTO db_ironfood.pedidos(id, data_lancamento, valor_total, cliente_id) VALUES(5, now(),65.40,1);
INSERT INTO db_ironfood.pedidos(id, data_lancamento, valor_total, cliente_id) VALUES(6, now(),65.40,2);
INSERT INTO db_ironfood.pedidos(id, data_lancamento, valor_total, cliente_id) VALUES(7, now(),65.40,3);
INSERT INTO db_ironfood.pedidos(id, data_lancamento, valor_total, cliente_id) VALUES(8, now(),65.40,4);
INSERT INTO db_ironfood.pedidos(id, data_lancamento, valor_total, cliente_id) VALUES(9, now(),65.40,1);
INSERT INTO db_ironfood.pedidos(id, data_lancamento, valor_total, cliente_id) VALUES(10, now(),65.40,2);
INSERT INTO db_ironfood.pedidos(id, data_lancamento, valor_total, cliente_id) VALUES(11, now(),65.40,3);
INSERT INTO db_ironfood.pedidos(id, data_lancamento, valor_total, cliente_id) VALUES(12, now(),65.40,4);

INSERT INTO db_ironfood.pedidos_produto(pedidos_id, produto_id) VALUES(1,4);
INSERT INTO db_ironfood.pedidos_produto(pedidos_id, produto_id) VALUES(2,3);
INSERT INTO db_ironfood.pedidos_produto(pedidos_id, produto_id) VALUES(3,2);
INSERT INTO db_ironfood.pedidos_produto(pedidos_id, produto_id) VALUES(4,1);
INSERT INTO db_ironfood.pedidos_produto(pedidos_id, produto_id) VALUES(5,4);
INSERT INTO db_ironfood.pedidos_produto(pedidos_id, produto_id) VALUES(6,3);
INSERT INTO db_ironfood.pedidos_produto(pedidos_id, produto_id) VALUES(7,2);
INSERT INTO db_ironfood.pedidos_produto(pedidos_id, produto_id) VALUES(8,1);
INSERT INTO db_ironfood.pedidos_produto(pedidos_id, produto_id) VALUES(9,4);
INSERT INTO db_ironfood.pedidos_produto(pedidos_id, produto_id) VALUES(10,3);
INSERT INTO db_ironfood.pedidos_produto(pedidos_id, produto_id) VALUES(11,2);
INSERT INTO db_ironfood.pedidos_produto(pedidos_id, produto_id) VALUES(12,1);