CREATE TABLE IF NOT EXISTS jobSeekers (
    id Serial NOT NULL PRIMARY KEY,
    firstName varchar(255) NOT NULL,
    lastName varchar(255) NOT NULL,
    nationalIdentity varchar(255) NOT NULL,
    birthYear varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    verifiedByEmail boolean NOT NULL
);