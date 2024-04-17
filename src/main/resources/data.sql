-- Insert cities
INSERT INTO cities (name) VALUES ('New York');
INSERT INTO cities (name) VALUES ('London');

-- Insert articles
insert into articles (title, content, primary_author_name, primary_author_login , co_author_name, co_author_login, city_id, co_city_id)
values ('Sample Article 1', 'This is the content of the first article.', 'John Doe', 'john_doe_login' , 'Co John Doe', 'co_john_doe_login', 1, 2);

insert into articles (title, content, primary_author_name, primary_author_login)
values ('Sample Article 2', 'Content for the second article goes here.', 'Jane Smith', 'jane_smith_login');

insert into articles (title, content, primary_author_name, primary_author_login)
values ('Sample Article 3', 'Content for the third article.', 'Alice Johnson', 'alice_johnson_login');

insert into articles (title, content, primary_author_name, primary_author_login)
values ('Sample Article 4', 'Details of the fourth article.', 'Bob Williams', 'bob_williams_login');

insert into articles (title, content, primary_author_name, primary_author_login)
values ('Sample Article 5', 'Fifth article content.', 'Eva Davis', 'eva_davis_login');



