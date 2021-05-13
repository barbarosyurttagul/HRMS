CREATE TABLE IF NOT EXISTS employers (
    id Serial NOT NULL,
    companyName varchar(255) NOT NULL,
    webUrl varchar(255) NOT NULL,
    phone varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    verifiedByEmail boolean NOT NULL,
    PRIMARY KEY (id)
);