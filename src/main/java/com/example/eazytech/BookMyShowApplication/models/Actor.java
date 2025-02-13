package com.example.eazytech.BookMyShowApplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Actor extends BaseModel{
    private String name;
    @ManyToMany(mappedBy = "actors")
    private List<Movie> movies;
}
/*
    cardinality
    1 actor can have many movies
    1 movie can have many actors
 */
