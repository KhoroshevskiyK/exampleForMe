CREATE TABLE user (
id int NOT NULL AUTO INCREMENT,
password varchar(64) not null,
username varchar(64) not null unique,
PRIMARY KEY (id)
);

CREATE TABLE todo(
id int NOT NULL AUTO INCREMENT,
title varchar(64) not null,
completed BOOLEAN not null,
PRIMARY KEY (id)
);