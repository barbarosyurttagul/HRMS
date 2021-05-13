CREATE TABLE IF NOT EXISTS systemUsers (
    id Serial NOT NULL PRIMARY KEY,
    userId int NOT NULL,
    firstName varchar(255) NOT NULL,
    lastName varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
    password varchar(255) NOT NULL
);