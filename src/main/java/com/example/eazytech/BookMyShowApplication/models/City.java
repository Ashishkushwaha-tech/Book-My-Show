package com.example.eazytech.BookMyShowApplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class City extends BaseModel {
    private String name;
    @OneToMany
    private List<Theatre> theatres;
}
/*
    cardinality
    a. City and Theatre
    1 city can have many theatre
    1 theatre can only exist in one city
    1:m
 */