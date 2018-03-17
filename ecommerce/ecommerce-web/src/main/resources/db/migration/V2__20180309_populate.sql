INSERT INTO projects (id, title, code, host, meta_description) VALUES (nextval('seq_projects'), 'Project', 'prj', 'domain.ru', 'domain.ru');
COMMIT;

INSERT INTO catalog (id, title, meta_keywords, meta_description, slug, project_id) VALUES
  (nextval('seq_catalog'), 'Киатйский чай', '', '', 'tea', 1);
INSERT INTO catalog (id, title, meta_keywords, meta_description, slug, project_id) VALUES
  (nextval('seq_catalog'), 'Игрушки для детей', '', '', 'toys', 1);
INSERT INTO catalog (id, title, meta_keywords, meta_description, slug, project_id) VALUES
  (nextval('seq_catalog'), 'Умные доски', '', '', 'doski', 1);
INSERT INTO catalog (id, title, meta_keywords, meta_description, slug, project_id) VALUES
  (nextval('seq_catalog'), 'Конструкторы', '', '', 'konstructor', 1);
COMMIT;

INSERT INTO products (id, title, meta_keywords, meta_description, slug, project_id, catalog_id, view_name, article, price)
VALUES (nextval('seq_products'), 'Product1', 'meta_keywords', 'meta_description', 'product1', 1, 1, 'Product 1', 'article1', 200.0);
INSERT INTO products (id, title, meta_keywords, meta_description, slug, project_id, catalog_id, view_name, article, price)
VALUES (nextval('seq_products'), 'Product2', 'meta_keywords', 'meta_description', 'product2', 1, 1, 'Product 1', 'article2', 200.0);
INSERT INTO products (id, title, meta_keywords, meta_description, slug, project_id, catalog_id, view_name, article, price)
VALUES (nextval('seq_products'), 'Product3', 'meta_keywords', 'meta_description', 'product3', 1, 1, 'Product 1', 'article3', 200.0);
INSERT INTO products (id, title, meta_keywords, meta_description, slug, project_id, catalog_id, view_name, article, price)
VALUES (nextval('seq_products'), 'Product4', 'meta_keywords', 'meta_description', 'product4', 1, 1, 'Product 1', 'article4', 200.0);
INSERT INTO products (id, title, meta_keywords, meta_description, slug, project_id, catalog_id, view_name, article, price)
VALUES (nextval('seq_products'), 'Product5', 'meta_keywords', 'meta_description', 'product5', 1, 1, 'Product 1', 'article5', 200.0);
INSERT INTO products (id, title, meta_keywords, meta_description, slug, project_id, catalog_id, view_name, article, price)
VALUES (nextval('seq_products'), 'Product6', 'meta_keywords', 'meta_description', 'product6', 1, 1, 'Product 1', 'article6', 200.0);
INSERT INTO products (id, title, meta_keywords, meta_description, slug, project_id, catalog_id, view_name, article, price)
VALUES (nextval('seq_products'), 'Product7', 'meta_keywords', 'meta_description', 'product7', 1, 1, 'Product 1', 'article6', 200.0);
INSERT INTO products (id, title, meta_keywords, meta_description, slug, project_id, catalog_id, view_name, article, price)
VALUES (nextval('seq_products'), 'Product8', 'meta_keywords', 'meta_description', 'product8', 1, 1, 'Product 1', 'article7', 200.0);
INSERT INTO products (id, title, meta_keywords, meta_description, slug, project_id, catalog_id, view_name, article, price)
VALUES (nextval('seq_products'), 'Product9', 'meta_keywords', 'meta_description', 'product9', 1, 1,'Product 1', 'article8', 200.0);
COMMIT;

INSERT INTO menu (id, name, code, project_id) VALUES (nextval('seq_menu'), 'Top Menu', 'top', 1);
INSERT INTO menu_items (id, name, code, link, menu_id, project_id) VALUES
  (nextval('seq_menu_items'), 'Главная', 'main', '/page/page1', 1, 1);
COMMIT;

insert into pages(id, title, meta_keywords, meta_description, slug, project_id)
VALUES (nextval('seq_pages'), 'Page 1', 'meta_keywords23233', 'descripion22323', 'page1', 1);
COMMIT;