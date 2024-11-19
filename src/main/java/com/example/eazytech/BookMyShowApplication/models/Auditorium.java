package com.example.eazytech.BookMyShowApplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Auditorium extends BaseModel {
    private String name;
    @OneToMany
    private List<Seat> seats;
    private int capacity;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<AuditoriumFeature> auditoriumFeatures;
    @ManyToOne
    private Theatre  theatre;
}
/*
    cardinality:
    a. Auditorium and seat
    1 auditorium can have many seats
    1 seat can only be in one auditorium
    m:1

    b. Auditorium and AuditoriumFeature
    1 auditorium can have many auditorium feature
    1 auditorium feature can be in many auditorium
    m:m

    c. Auditorium and theatre
    1 auditorium can only be inn 1 theatre
    1 theatre can contain many auditorium
    m:1
 */
