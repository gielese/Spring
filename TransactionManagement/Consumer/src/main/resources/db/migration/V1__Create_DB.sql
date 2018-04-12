create table logging (
  uuid varchar(36),
  username varchar(50),
  uuid_remote varchar(36),
  string_to_log varchar(500),
  time timestamp
);

create table user(
  uuid varchar(36),
  name varchar(50),
  loyalty int(10)
);

create table orderItems(
  uuid varchar(36),
  number_of_items int(10),
  price numeric(12,2)
);

insert into user (uuid, name, loyalty) values ('cbcb6f0c-5f32-42b2-806c-bc47f99adbff', 'seppeg-user', 15);
insert into orderItems (uuid, number_of_items, price) values ('04ec8f47-5365-4983-bb37-6661433d3b01', 230, 2110.04);