DROP TABLE IF EXISTS best_games;
DROP TABLE IF EXISTS games CASCADE;
DROP TABLE IF EXISTS consoles CASCADE;

CREATE TABLE consoles
(
    console_id  serial PRIMARY KEY,
    name        VARCHAR(255),
    photo_url   VARCHAR(255),
    description VARCHAR(5012),
    sold        VARCHAR(255),
    best_games  VARCHAR(255)

);
CREATE TABLE games
(
    game_id serial PRIMARY KEY,
    name    VARCHAR(255),
    photo_url VARCHAR(255),
    description VARCHAR(2048)
);

