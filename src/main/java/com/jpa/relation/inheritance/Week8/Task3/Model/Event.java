package com.jpa.relation.inheritance.Week8.Task3.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate date;
    private Integer duration;
    private String location;

    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY)
    private Set<Guest> guests;

    public Event(String title, LocalDate date, Integer duration, String location, Set<Guest> guests) {
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.guests = guests;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<Guest> getGuests() {
        return guests;
    }

    public void setGuests(Set<Guest> guests) {
        this.guests = guests;
    }
}
