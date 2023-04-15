CREATE TYPE TYPE as ENUM ('Game', 'DLC', 'Music');
CREATE TYPE GENRE as ENUM ('Indie', 'casual', 'Adventure', 'RPG', 'Fantasy', 'Horror', 'Arcade', 'Shooter')

CREATE TABLE studio (
                        studio_id SERIAL PRIMARY KEY,
                        name TEXT,
                        country TEXT,
                        foundationDate DATE,
)

CREATE TABLE game (
                      game_id SERIAL PRIMARY KEY,
                      title TEXT NOT NULL,
                      type TYPE,
                      publishedDate DATE,
                      genre GENRE

)

CREATE TABLE user (
                      user_id SERIAL PRIMARY KEY,
                      name VARCHAR(20) NOT NULL,
                      realName TEXT,
                      email_address TEXT,
                      password VARCHAR(20) NOT NULL
)

CREATE TABLE favourites (
)