CREATE SEQUENCE users_sequence
INCREMENT 1
MINVALUE 1
MAXVALUE 9223372036854775807
START 1
CACHE 1;

CREATE TABLE users
(
    id BIGINT PRIMARY KEY NOT NULL,
    firstname VARCHAR(100) NOT NULL,
    lastname VARCHAR(100) NOT NULL,
    email VARCHAR(30) NOT NULL,
    last_sign DATE NOT NULL
);
ALTER TABLE users ADD CONSTRAINT unique_id UNIQUE (id);

ALTER TABLE users ALTER COLUMN id SET DEFAULT nextval('users_sequence');
