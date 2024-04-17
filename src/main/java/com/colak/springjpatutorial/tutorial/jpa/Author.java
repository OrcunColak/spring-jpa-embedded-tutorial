package com.colak.springjpatutorial.tutorial.jpa;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

// The @Embeddable annotation is used to indicate that a class should be embedded within another entity.
// In our case Author is embedded into Article class
@Embeddable

@Getter
public class Author {
    private String name;

    private String login;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id")
    private City city;
}
