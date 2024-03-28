package com.colak.springjpaembedded.tutorial.jpa;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "articles")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // The @Embedded annotation is then used on a field in the entity class to specify that this field is an embedded type.
    @Embedded
    private Author author;

    @Embedded
    // @AttributeOverride annotation allows us to override the mapping of fields in embeddable classes for each use
    // It seems @AttributeOverrides container annotation is not necessary anymore
    @AttributeOverride(name = "name", column = @Column(name = "temp_name"))
    @AttributeOverride(name = "login", column = @Column(name = "temp_login"))
    private Author tempAuthor;

    @Column(unique = true)
    private String title;

    private String content;

    // This field will not be saved in the DB
    @Transient
    private String transientField;

}
