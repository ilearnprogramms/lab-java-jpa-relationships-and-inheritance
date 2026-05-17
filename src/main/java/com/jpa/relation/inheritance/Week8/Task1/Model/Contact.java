package com.jpa.relation.inheritance.Week8.Task1.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String company;
    private String title;

    @Embedded
    private Name name;


}
