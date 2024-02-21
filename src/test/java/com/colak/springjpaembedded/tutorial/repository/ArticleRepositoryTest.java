package com.colak.springjpaembedded.tutorial.repository;

import com.colak.springjpaembedded.tutorial.jpa.Article;
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
    void findByAuthorLogin () {
        List<Article> list = repository.findByAuthorLogin("john_doe_login");
        assertThat(list).hasSize(1);
    }


}
