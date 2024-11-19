package com.example.eazytech.BookMyShowApplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter @Setter
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;
    private Date startTime;

    private Date endTime;
    @ManyToOne
    private Auditorium auditorium;
    @OneToMany(mappedBy = "show")
    private List<ShowSeat> showSeats;
    @OneToMany
    private List<ShowSeatType> showSeatTypes;

    @Enumerated(EnumType.STRING)
    private Language language;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<ShowFeature> showFeatures; // <Feature>
}
    /*
        cardinality
        1 show can have one movie
        1 movie can be in many shows
        m:1

        1 show can have many show seats
        1 show seat can be in one show
        1:m

        1 show can have many show seat types
        1 show seat type can be in one show
        1:m

        1 show can have one auditorium
        1 auditorium can have many shows
        m:1

        1 show can have one language
        1 language can be in many shows
        1:m

        1 show can have many show features
        1 show feature can be in many shows
        m:m
     */
