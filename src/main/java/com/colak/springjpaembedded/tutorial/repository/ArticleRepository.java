package com.colak.springjpaembedded.tutorial.repository;

import com.colak.springjpaembedded.tutorial.jpa.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    List<Article> findByAuthorName(String name);

    List<Article> findByAuthorLogin(String login);
}
