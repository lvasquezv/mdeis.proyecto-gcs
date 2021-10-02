# --- !Ups

CREATE SEQUENCE people_seq;

create table "people" (
  "id" bigint not null primary key DEFAULT nextval('people_seq'),
  "name" varchar not null,
  "age" int not null
);

# --- !Downs

drop table "people" if exists;
