package com.example.eazytech.BookMyShowApplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Theatre extends BaseModel{
    private String name;
    private String address;
    @OneToMany(mappedBy = "theatre")
    private List<Auditorium> auditoriums;
    @OneToMany
    private List<Show> upcomingShows;
}

/*
    cardinality
    1 theatre can have many auditorium
    1 auditorium can only be in one theatre
    1:m

    1 theatre can have many upcoming shows
    1 show can be in many theatres
    m:m
 */
