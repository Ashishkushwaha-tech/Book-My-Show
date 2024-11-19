package com.example.eazytech.BookMyShowApplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter @Setter
public class Ticket extends BaseModel{
    @ManyToOne
    private User bookedBy;
    @ManyToOne
    private Show show;
    @ManyToMany
    private List<ShowSeat> showSeats;
    private double totalAmount;

    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
    private Date timeOfBooking;

}

/*
    cardinality
    1 ticket can be booked by one user
    1 user can book many tickets
    m:1

    1 ticket can have only one show
    1 show can have many tickets
    m:1

    1 ticket can have many show seats
    1 show seat can be included in many tickets (if no cancellation 1:1 overall, @oneToMany)
    m:m

    1 ticket can have only one ticket status
    1 ticket status can be for many tickets
    m:1
*/