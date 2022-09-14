DROP TABLE IF EXISTS games CASCADE;
DROP TABLE IF EXISTS consoles CASCADE;

CREATE TABLE games
(
    game_id serial PRIMARY KEY,
    name    VARCHAR(255)
);

CREATE TABLE consoles
(
    console_id serial PRIMARY KEY,
    name       VARCHAR(255)
);
