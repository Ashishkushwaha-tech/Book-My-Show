package com.example.eazytech.BookMyShowApplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Movie extends BaseModel{
    private String name;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Language> languages;

    @ManyToMany
    private List<Actor> actors;

    private int Length;
    private double rating;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeature> movieFeatures;

}
/*

        cardinality
        1 movie can have many languages
        1 language can be in many movies
        m:m

        1 movie can have many actors
        1 actor can have many movies
        m:m

        1 movie can have many movie features
        1 movie feature can be in many movie
        m:m
 */
