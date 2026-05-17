package com.jpa.relation.inheritance.Week8.Task2.Repository;

import com.jpa.relation.inheritance.Week8.Task2.Model.Association;
import com.jpa.relation.inheritance.Week8.Task2.Model.Division;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DivisionRepo extends JpaRepository<Division, Integer> {

    List<Division> findByAssociation(Association association);
}
