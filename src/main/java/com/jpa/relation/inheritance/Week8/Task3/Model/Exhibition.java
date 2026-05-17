package com.jpa.relation.inheritance.Week8.Task3.Model;

import jakarta.persistence.Entity;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Exhibition extends Event {
    public Exhibition(String title, LocalDate date, Integer duration, String location, Set<Guest> guests) {
        super(title, date, duration, location, guests);
    }
}
