create schema if not exists users;

create table users.user(
    id bigserial primary key,
    name varchar (100) not null,
    surname varchar (100) not null,
    identificationCard varchar (100) not null,
    celphone varchar (100) not null,
    registerDate timestamp not null

)