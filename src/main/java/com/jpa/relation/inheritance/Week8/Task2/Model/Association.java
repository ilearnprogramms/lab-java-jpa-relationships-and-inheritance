package com.jpa.relation.inheritance.Week8.Task2.Model;
import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;

    private String name;

    @OneToMany(mappedBy = "association", fetch = FetchType.LAZY)
    private Set<Division>  divisions;

    public Association(String name, Set<Division> divisions) {
        this.name = name;
        this.divisions = divisions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(Set<Division> divisions) {
        this.divisions = divisions;
    }
}
