CREATE TYPE GAME_TYPE as ENUM ('Game', 'DLC', 'Music');
CREATE TYPE GENRE as ENUM ('Indie', 'casual', 'Adventure', 'RPG', 'Fantasy', 'Horror', 'Arcade', 'Shooter');

CREATE TABLE studio (
    studioId SERIAL PRIMARY KEY,
    name TEXT,
    country TEXT,
    foundationDate DATE,
);

CREATE TABLE game (
    gameId SERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    type GAME_TYPE,
    publishedDate DATE,
    genre GENRE,
    rating INTEGER
);

CREATE TABLE user (
    userId SERIAL PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    realName TEXT,
    emailAddress TEXT,
    password VARCHAR(20) NOT NULL
);

-- CREATE TABLE favourites (
-- )