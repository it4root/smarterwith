CREATE TABLE user_detail
(
    id varchar primary key,
    first_name varchar(255),
    last_name varchar(255),
    email varchar(255) unique
);

