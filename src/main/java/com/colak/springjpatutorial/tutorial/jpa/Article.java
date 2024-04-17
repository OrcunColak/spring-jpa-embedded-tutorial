package com.colak.springjpatutorial.tutorial.jpa;

import jakarta.persistence.AssociationOverride;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;


@Entity
@Table(name = "articles")

@Getter
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // The @Embedded annotation is then used on a field in the entity class to specify that this field is an embedded type.
    @Embedded
    @AttributeOverride(name = "name", column = @Column(name = "primary_author_name"))
    @AttributeOverride(name = "login", column = @Column(name = "primary_author_login"))
    private Author primaryAuthor;

    @Embedded
    // @AttributeOverride annotation allows us to override the mapping of fields in embeddable classes for each use
    // It seems @AttributeOverrides container annotation is not necessary anymore
    @AttributeOverride(name = "name", column = @Column(name = "co_author_name"))
    @AttributeOverride(name = "login", column = @Column(name = "co_author_login"))

    @AssociationOverride(name = "city", joinColumns = @JoinColumn(name = "co_city_id"))
    private Author coAuthor;

    @Column(unique = true)
    private String title;

    private String content;

    // This field will not be saved in the DB
    @Transient
    private String transientField;

}
