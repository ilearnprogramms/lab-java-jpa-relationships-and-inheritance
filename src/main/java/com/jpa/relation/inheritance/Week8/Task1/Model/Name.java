package com.jpa.relation.inheritance.Week8.Task1.Model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Embeddable
public class Name {

    @Enumerated(EnumType.STRING)
    private Salutation salutation;

    private String firstName;
    private String middleName;
    private String lastName;
}
