package com.jpa.relation.inheritance.Week8.Task2.Repository;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.jpa.relation.inheritance.Week8.Task2.Model.Association;
import com.jpa.relation.inheritance.Week8.Task2.Model.Division;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssociationRepo extends JpaRepository<Association, Integer> {

    List<Association> findByName(Long id);
}
