create sequence user_seq start 1 increment 1;
create sequence basket_seq start 1 increment 1;
create table users (id int8 not null, archive boolean not null, email varchar(255), name varchar(255), password varchar(255), role varchar(255), primary key (id));
create table basket (id int8 not null, firstname varchar(255), lastname varchar(255), lastname2 varchar(255), email varchar(255), address varchar(255), phone varchar(255), primary key (id));
