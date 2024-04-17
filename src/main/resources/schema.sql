CREATE TABLE IF NOT EXISTS articles
(
    id      BIGSERIAL PRIMARY KEY,
    title   VARCHAR(255) UNIQUE,
    content VARCHAR(255),
    primary_author_name    VARCHAR(255),
    primary_author_login   VARCHAR(255),
    co_author_name    VARCHAR(255),
    co_author_login   VARCHAR(255)
);