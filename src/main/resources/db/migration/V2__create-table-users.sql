CREATE TABLE users
(
    id       TEXT PRIMARY KEY UNIQUE NOT NULL,
    login    TEXT                    NOT NULL UNIQUE,
    nome     TEXT                    NOT NULL,
    password TEXT                    NOT NULL,
    role     TEXT                    NOT NULL
);
