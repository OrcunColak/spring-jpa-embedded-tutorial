package com.colak.springjpatutorial.tutorial.repository;

import com.colak.springjpatutorial.tutorial.jpa.Article;
import com.colak.springjpatutorial.tutorial.jpa.Author;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ArticleRepositoryTest {

    @Autowired
    private ArticleRepository repository;

    @Test
    void findByAuthorLogin() {
        List<Article> list = repository.findByPrimaryAuthorLogin("john_doe_login");
        assertThat(list).hasSize(1);

        Article first = list.getFirst();
        Author tempAuthor = first.getCoAuthor();
        assertThat(tempAuthor.getName()).isEqualTo("Co John Doe");
    }
}
