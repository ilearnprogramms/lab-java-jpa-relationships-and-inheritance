package com.jpa.relation.inheritance.Week8.Task2.Repository;

import com.jpa.relation.inheritance.Week8.Task2.Model.Division;
import com.jpa.relation.inheritance.Week8.Task2.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepo extends JpaRepository<Member, Integer> {

    List<Member> findByDivision(Division division);
}
