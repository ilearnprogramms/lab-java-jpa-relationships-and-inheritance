package com.jpa.relation.inheritance.Week8.Task2.Model;
import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "association_id")
    private Association association;

    private String name;
    private String district;
    private String president;

    @OneToMany(mappedBy = "division", fetch = FetchType.LAZY)
    private Set<Member> members;

    public Division( Association association, String name, String district, String president, Set<Member> members) {
        this.association = association;
        this.name = name;
        this.district = district;
        this.president = president;
        this.members = members;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public Set<Member> getMembers() {
        return members;
    }

    public void setMembers(Set<Member> members) {
        this.members = members;
    }
}
