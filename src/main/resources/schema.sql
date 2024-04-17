CREATE TABLE IF NOT EXISTS cities (
  id BIGSERIAL PRIMARY KEY,
  name VARCHAR(255)
 );

CREATE TABLE IF NOT EXISTS articles
(
    id      BIGSERIAL PRIMARY KEY,
    title   VARCHAR(255) UNIQUE,
    content VARCHAR(255),
    primary_author_name    VARCHAR(255),
    primary_author_login   VARCHAR(255),
    co_author_name    VARCHAR(255),
    co_author_login   VARCHAR(255),
    city_id BIGINT,
    co_city_id BIGINT,
    FOREIGN KEY (city_id) references cities(id),
    FOREIGN KEY (co_city_id) references cities(id)
);