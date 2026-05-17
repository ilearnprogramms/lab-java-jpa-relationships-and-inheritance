package com.jpa.relation.inheritance.Week8.Task1.Model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Name {
    private Salutation salutation;
    private String firstName;
    private String middleName;
    private String lastName;
}
