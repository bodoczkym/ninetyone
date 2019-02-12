insert into user(username, password, enabled, role) values (
  'owner1', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_OWNER');
insert into user(username, password, enabled, role) values (
  'owner2', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_OWNER');
insert into user(username, password, enabled, role) values (
  'user1', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_USER');
insert into user(username, password, enabled, role) values (
  'owner3', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_OWNER');
insert into user(username, password, enabled, role) values (
  'user2', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_USER');
insert into user(username, password, enabled, role) values (
  'user3', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_USER');


insert into category(category_name,created_at,updated_at) values
  ('kat1', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into category(category_name,created_at,updated_at) values
  ('kat2', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into category(category_name,created_at,updated_at) values
  ('kat3', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());


insert into product(category_id, productname, stocknumber, description, price, created_at, updated_at) values
  (1, 'product1', 111,'description1', 1000, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into product(category_id, productname, stocknumber, description, price, created_at, updated_at) values
  (2, 'product2', 112, 'description2', 2000, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into product(category_id,  productname, stocknumber, description, price, created_at, updated_at) values
  (1, 'product3', 114,'description3', 3000, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into product(category_id, productname, stocknumber, description, price, created_at, updated_at) values
  (1, 'product4', 113, 'description4', 4000, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into product(category_id, productname, stocknumber, description, price, created_at, updated_at) values
  (2, 'product5', 121, 'description5', 5000, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into product(category_id, productname, stocknumber, description, price, created_at, updated_at) values
  (3, 'product6', 122, 'description6', 6000, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into product(category_id, productname, stocknumber, description, price, created_at, updated_at) values
  (3, 'product7', 123, 'description7', 7000, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());


insert into purchase(user_id, product_id, order_name,address,phone_number,is_delivered, created_at, updated_at) values
  (2, 7, 'prder1','proba1','030312342',false, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into purchase(user_id, product_id, order_name,address,phone_number,is_delivered, created_at, updated_at) values
  (1, 3, 'prder2','proba2','230312342',false, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into purchase(user_id, product_id, order_name,address,phone_number,is_delivered, created_at, updated_at) values
  (6, 1, 'prder3','proba3','330312342',true, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());