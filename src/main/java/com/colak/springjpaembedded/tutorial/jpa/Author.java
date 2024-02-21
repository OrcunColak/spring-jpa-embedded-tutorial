package com.colak.springjpaembedded.tutorial.jpa;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// The @Embeddable annotation is used to indicate that a class should be embedded within another entity.
@Embeddable

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    private String name;

    private String login;
}
