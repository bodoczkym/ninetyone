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
insert into notes ( name, text ) values ('ee', 'untur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque' ||
 'porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eiu ' ||
  's modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nos');
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


insert into livingroom(category_id, name, stocknumber, filters, description, rate, type, img, price, created_at, updated_at) values
  (1, 'table', 111, 'table' , 'dautem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestia' ||
   'e consequatur, vel illum qui dolorem eum fugiat quo voluptaescription1', 5,  'livingroom', '/assets/images/img3.jpg',
   3500, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into livingroom(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (2, 'little table', 112, 'table', 'm quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ull' ||
   'am corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur', 5,  'livingroom', '/assets/images/img3.jpg',
    999, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into livingroom(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (1, 'sofa', 113, 'sofa:armchair', 'description1', 5,  'livingroom', '/assets/images/img3.jpg', 700, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into livingroom(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (3, 'armchair', 114,  'armchair', 'm quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem u' ||
   'llam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur', 5,  'livingroom', '/assets/images/img3.jpg',
    260, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into livingroom(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (3, 'armchair', 115, 'armchair', 'description1', 5,  'livingroom', '/assets/images/img3.jpg', 3499, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into livingroom(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (2, 'pl', 116, 'armchair', 'description1', 5,  'livingroom', '/assets/images/img3.jpg', 3499, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into livingroom(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (3, 'pl2', 117, 'armchair', 'description1', 5,  'livingroom', '/assets/images/img3.jpg', 3499, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());


insert into bathroom(category_id, name, stocknumber, filters, description, rate, type, img, price, created_at, updated_at) values
  (1, 'mirror', 111, 'mirror' , 'dautem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestia' ||
   'e consequatur, vel illum qui dolorem eum fugiat quo voluptaescription1', 5,  'bathroom', '/assets/images/img3.jpg',
   3500, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into bathroom(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (2, 'sink', 112, 'sink:bath', 'm quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ull' ||
   'am corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur', 5,  'bathroom', '/assets/images/img3.jpg',
    999, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into bathroom(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (1, 'sink', 113, 'sink', 'description1', 5,  'bathroom', '/assets/images/img3.jpg', 700, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into bathroom(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (3, 'mirror', 114,  'mirror', 'm quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem u' ||
   'llam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur', 5,  'bathroom', '/assets/images/img3.jpg',
    260, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into bathroom(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (3, 'bath', 115, 'bath:bathtub', 'description1', 5,  'bathroom', '/assets/images/img3.jpg', 3499, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into bathroom(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (2, 'bathtub', 116, 'bathtub:bath', 'description1', 5,  'bathroom', '/assets/images/img3.jpg', 3499, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into bathroom(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (3, 'sink', 117, 'sink', 'description1', 5,  'bathroom', '/assets/images/img3.jpg', 3499, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

insert into kitchen(category_id, name, stocknumber, filters, description, rate, type, img, price, created_at, updated_at) values
  (1, 'table', 111, 'table' , 'dautem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestia' ||
   'e consequatur, vel illum qui dolorem eum fugiat quo voluptaescription1', 5,  'kitchen', '/assets/images/img3.jpg',
   3500, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into kitchen(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (2, 'serving table', 112, 'serving table:table', 'm quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ull' ||
   'am corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur', 5,  'kitchen', '/assets/images/img3.jpg',
    999, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into kitchen(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (1, 'desk', 113, 'desk:serving table', 'description1', 5,  'kitchen', '/assets/images/img3.jpg', 700, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into kitchen(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (3, 'mirror', 114,  'mirror', 'm quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem u' ||
   'llam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur', 5,  'kitchen', '/assets/images/img3.jpg',
    260, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into kitchen(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (3, 'table and chairs', 115, 'table:chair', 'description1', 5,  'kitchen', '/assets/images/img3.jpg', 3499, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into kitchen(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (2, 'chairs', 116, 'chair', 'description1', 5,  'kitchen', '/assets/images/img3.jpg', 3499, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into kitchen(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (3, 'table', 117, 'table', 'description1', 5,  'kitchen', '/assets/images/img3.jpg', 3499, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

insert into techs(category_id, name, stocknumber, filters, description, rate, type, img, price, created_at, updated_at) values
  (1, 'tv', 111, 'tv' , 'dautem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestia' ||
   'e consequatur, vel illum qui dolorem eum fugiat quo voluptaescription1', 5,  'techs', '/assets/images/img3.jpg',
   3500, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into techs(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (2, 'refigerator', 112, 'refigerator', 'm quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ull' ||
   'am corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur', 5,  'techs', '/assets/images/img3.jpg',
    999, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into techs(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (1, 'freezer', 113, 'refigerator:freezer', 'description1', 5,  'techs', '/assets/images/img3.jpg', 700, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into techs(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (3, 'refigerator', 114,  'refigerator', 'm quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem u' ||
   'llam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur', 5,  'techs', '/assets/images/img3.jpg',
    260, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into techs(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (3, 'microwave', 115, 'microwave', 'description1', 5,  'techs', '/assets/images/img3.jpg', 3499, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into techs(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (2, 'oven', 116, 'oven', 'description1', 5,  'techs', '/assets/images/img3.jpg', 3499, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
insert into techs(category_id, name, stocknumber, filters, description, rate,  type, img, price, created_at, updated_at) values
  (3, 'oven', 117, 'oven', 'description1', 5,  'techs', '/assets/images/img3.jpg', 3499, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());



