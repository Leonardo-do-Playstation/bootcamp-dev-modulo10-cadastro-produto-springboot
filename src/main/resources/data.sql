INSERT INTO TBL_CATEGORY (NAME) VALUES ( 'Fabricação Própria');
INSERT INTO TBL_CATEGORY (NAME) VALUES ( 'Nacional');
INSERT INTO TBL_CATEGORY (NAME) VALUES ( 'Importado');
INSERT INTO TBL_CATEGORY (NAME) VALUES ( 'Premium');


INSERT INTO TBL_PRODUCTS ( name, description, category_id, promotion, new_product, price)
VALUES ( 'Fone Bluetooth', 'Fone de ouvido sem fio com cancelamento de ruído', 1, true, false, 199.90);

INSERT INTO TBL_PRODUCTS ( name, description, category_id, promotion, new_product, price)
VALUES ('Livro Java', 'Livro completo sobre desenvolvimento Java com Spring', 2, false, true, 89.90);

INSERT INTO TBL_PRODUCTS ( name, description, category_id, promotion, new_product, price)
VALUES ( 'Camisa Polo', 'Camisa polo masculina 100% algodão', 3, true, true, 59.90);

INSERT INTO TBL_PRODUCTS ( name, description, category_id, promotion, new_product, price)
VALUES ( 'Jogo de Blocos', 'Blocos de montar para crianças a partir de 3 anos', 4, false, false, 49.99);