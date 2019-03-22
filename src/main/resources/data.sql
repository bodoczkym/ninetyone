insert into user(username, password, enabled, role, reference, description, rate, img, email) values (
  'owner1', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_OWNER',
   'https://www.youtube.com/watch?v=YFXlzKDjL8E', 'He is sooo funny', 0, '/assets/images/img3.jpg', 'weirdo@ww.wwad');
insert into user(username, password, enabled, role, reference, description, rate, img, email) values (
  'owner2', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_OWNER',
  'https://www.youtube.com/watch?v=YFXlzKDjL8E', 'He is sooo funnyHe is sooo funnyHe is sooo funnyHe is sooo funny', 1,
   '/assets/images/img2.jpg', 'asd@gmail.com');
insert into user(username, password, enabled, role, reference, description, rate, img, email) values (
  'user1', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_USER',
  'https://www.youtube.com/watch?v=YFXlzKDjL8E', 'He is sooo funnyHe is sooo funnyHe is sooo funny', 2,
   '/assets/images/img3.jpg', 'asd@gmail.com');
insert into user(username, password, enabled, role, reference, description, rate, img, email) values (
  'owner3', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_OWNER',
  'https://www.youtube.com/watch?v=YFXlzKDjL8E', 'He is sooo funnyjnfkj nfkjas gnjkasb gkadbgdk afhbghd fabghl ' ||
   'fabgdjfbjad fljgkrsk aljgbrjks ahlkjabgkl fdjagbl fdjabgl kdfaj bgldkfagbl fdabl hdafbg khbaed lghbrwl bl' ||
    ' krejabgraebgb.', 3, '/assets/images/img1.png', 'asd@gmail.com');
insert into user(username, password, enabled, role, reference, description, rate, img, email) values (
  'user2', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_USER',
   'https://www.youtube.com/watch?v=YFXlzKDjL8E', 'He is sooo funnyjnfkj nfkjas gnjkasb gkadbgdkafhbghd fabghl' ||
    ' fabgdjfbjad fljgkrskaljgbrjks ahlkjabgkl fdjagblkfdjabgl kdfajbgldkfagbl fdabl hdafbgkhbaed gkadbgdkafhbghd' ||
     ' flgbl krejabgraebgb.', 4, '/assets/images/img3.jpg', 'asd@gmail.com');
insert into user(username, password, enabled, role, reference, description, rate, img, email) values (
  'user3', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_USER',
  'https://www.youtube.com/watch?v=YFXlzKDjL8E', 'He is sooo funnyjnfkj nfkjas gnjkasb gkadbgdkafhbghd fabghl' ||
   ' fabgdjfbjad fljgkrskaljgbrjks ahlkjabgkl fdjagblkfdjabgl kdfajbgldkfagbl fdabl hdafbgkhbaed lghbrwlgbl ' ||
    'krejabgraebgb.', 5, '/assets/images/img3.jpg', 'asd@gmail.com');


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



insert into notes ( name, text ) values ('Karcsi', 'I hope it will be a wonderful page');
insert into notes ( name, text ) values ('Bela', 'Do the TODOs');
insert into notes ( name, text ) values ('asf', 'I hope it will be a wonderful pagehope it will be a wonderful page' ||
 '   hope it will be a wonderful page hope it will be a wonderful pagehope it will be a wonderful page');
insert into notes ( name, text ) values ('ee', 'fffffffffffffffaasdasdafafadfdfsdfsdfffffffffffffffaasdasdafafad' ||
 'fdfsdfsdfffffffffffffffaasdasdafafadfdfsdfsdfffffffffffffffaasdasdafafadfdfsdfsdfffffffffffffffaasdasdafafadfdfsd' ||
  'fsdfffffffffffffffaasdasdafafadfdfsdfsdfffffffffffffffaasdasdafafadfdfsdfsdfffffffffffffffaasdasdafafadfdfsdfsdffff' ||
   'fffffff');
insert into notes ( name, text ) values ('zozu', 'I hope it will be a wonderful page');




insert into job ( name, description ) values ('engineeringJob', 'hdmi hdmihdmi hd mihdmihdm i hdm');
insert into job ( name, description ) values ('engineeringJob', 'hdmi hdmihdmi hd mihdmihdm i hdm dmi hdmihdmi hd ' ||
 'mihdmihdm i hdm');
insert into job ( name, description ) values ('projectManagemant', 'hdmi hdmihdmi hd mihdmihdm i hdm');
insert into job ( name, description ) values ('projectManagemant', 'hdmi hdmihdmi hd mihdmihdm i hdm dmi hdmihd' ||
 'mi hd mihdmihdm i hdm');





insert into question ( name, question, description ) values ( 'Kreta', 'What does 42 mean?', 'sdfsdf sdf sdf sd sdf');
insert into question ( name, question, description ) values ( 'Komamasszony', 'How is it possible that people ' ||
 'blissful in marriage?', '');

insert into comment (  q_id, comment, comment_name ) values ( '1', 'is it a comment?', 'sandee');
insert into comment (  q_id, comment, comment_name ) values ( '2', 'is it a comment1?', 'sandee');
insert into comment (  q_id, comment, comment_name ) values ( '1', 'is it a comment2?', 'sandee');


insert into bedroom(category_id, name, stocknumber, filters, description, rate, type, img, price, created_at, updated_at) values
  (1, 'bed product1', 111, 'cupboard:nightstand' , 'description1', 5,  'bedroom', '/assets/images/img3.jpg', 3500, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into bedroom(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (2, 'bed product2', 112, 'cupboard', 'description1', 5,  'bedroom', '/assets/images/img3.jpg', 999, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into bedroom(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (1, 'bed product3', 113, 'cupboard', 'description1', 5,  'bedroom', '/assets/images/img3.jpg', 700, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into bedroom(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (3, 'bed product4', 114,  'cupboard', 'description1', 5,  'bedroom', '/assets/images/img3.jpg', 260, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into bedroom(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (3, 'bed product5', 115, 'cupboard', 'description1', 5,  'bedroom', '/assets/images/img3.jpg', 3499, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into bedroom(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (2, 'bed product6', 116, 'cupboard:bed', 'description1', 5, 'bedroom', '/assets/images/img3.jpg', 1, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

