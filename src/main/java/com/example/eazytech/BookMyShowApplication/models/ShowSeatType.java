package com.example.eazytech.BookMyShowApplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 * for a show, for every seat type, what is price for those seat
 * type for that show
 */
@Entity
@Getter @Setter
public class ShowSeatType extends BaseModel {
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    private double price;
}
/*
    cardinality
    1 show seat type can belong to one show
    1 show can have many show seat types
    m:1
 */