CREATE TABLE IF NOT EXISTS articles
(
    id      BIGSERIAL PRIMARY KEY,
    title   VARCHAR(255) UNIQUE,
    content VARCHAR(255),
    name    VARCHAR(255),
    login   VARCHAR(255),
    temp_name    VARCHAR(255),
    temp_login   VARCHAR(255)
);