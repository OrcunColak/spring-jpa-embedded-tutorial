package com.colak.springjpatutorial.tutorial.repository;

import com.colak.springjpatutorial.tutorial.jpa.Article;
import com.colak.springjpatutorial.tutorial.jpa.Author;
import com.colak.springjpatutorial.tutorial.jpa.City;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ArticleRepositoryTest {

    @Autowired
    private ArticleRepository repository;

    @Test
    @Transactional(readOnly = true)
    void findByPrimaryAuthorLogin() {
        List<Article> list = repository.findByPrimaryAuthorLogin("john_doe_login");
        assertThat(list).hasSize(1);

        Article firstArticle = list.getFirst();

        Author primaryAuthor = firstArticle.getPrimaryAuthor();
        assertThat(primaryAuthor.getName()).isEqualTo("John Doe");

        Author coAuthor = firstArticle.getCoAuthor();
        assertThat(coAuthor.getName()).isEqualTo("Co John Doe");

        City primaryCity = primaryAuthor.getCity();
        assertThat(primaryCity.getName()).isEqualTo("New York");

        City coCity = coAuthor.getCity();
        assertThat(coCity.getName()).isEqualTo("London");
    }
}
