CREATE TABLE IF NOT EXISTS jobTitles (
    id Serial NOT NULL PRIMARY KEY,
    title varchar(255) NOT NULL,
    UNIQUE(title)
);