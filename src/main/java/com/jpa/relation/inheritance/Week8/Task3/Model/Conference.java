package com.jpa.relation.inheritance.Week8.Task3.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Conference extends Event{

    @OneToMany(mappedBy = "conference", fetch = FetchType.LAZY)
    private Set<Speaker> speakers;


    public Conference(String title, LocalDate date, Integer duration, String location, Set<Guest> guests) {
        super(title, date, duration, location, guests);
    }
}
