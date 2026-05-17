package com.jpa.relation.inheritance.Week8;

import com.jpa.relation.inheritance.Week8.Task2.Model.Association;
import com.jpa.relation.inheritance.Week8.Task2.Model.Division;
import com.jpa.relation.inheritance.Week8.Task2.Model.Member;
import com.jpa.relation.inheritance.Week8.Task2.Model.Status;
import com.jpa.relation.inheritance.Week8.Task2.Repository.AssociationRepo;
import com.jpa.relation.inheritance.Week8.Task2.Repository.DivisionRepo;
import com.jpa.relation.inheritance.Week8.Task2.Repository.MemberRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;

@SpringBootApplication
public class Week8Application {

	public static void main(String[] args) {
		SpringApplication.run(Week8Application.class, args);
	}


	@Bean
	CommandLineRunner run(AssociationRepo associationRepo,
						  DivisionRepo divisionRepo,
						  MemberRepo memberRepo) {
		return args -> {

			// Association
			Association association = associationRepo.save(
					new Association(
							"Nurse Association of Germany",
							new HashSet<>()));

			// Division

			Division d1 = divisionRepo.save(
					new Division(association,
							"Northern Hawks",
							"Berlin Central",
							"Anna Mustermann",
							new HashSet<>()));

			Division d2 = divisionRepo.save(
					new Division(association,
							"Riverside Union",
							"Hamburg West",
							"Daniel Mustermann",
							new HashSet<>()));

			Division d3 = divisionRepo.save(
					new Division(association,
							"Silver Wolves",
							"Munich North",
							"Felix Mustermann",
							new HashSet<>()));

			Division d4 = divisionRepo.save(
					new Division(association,
							"Iron Titans",
							"Cologne South",
							"Marie Mustermann",
							new HashSet<>()));

			Division d5 = divisionRepo.save(
					new Division(association,
							"Emerald Eagles",
							"Frankfurt East",
							"Sebastian Mustermann",
							new HashSet<>()));

			Division d6 = divisionRepo.save(
					new Division(association,
							"Storm Troops",
							"Stuttgart Central",
							"Katharina Mustermann",
							new HashSet<>()));

			Division d7 = divisionRepo.save(
					new Division(association,
							"Golden Falcons",
							"Dresden Heights",
							"Michael Mustermann",
							new HashSet<>()));

			// Members

			Member mbr1 = memberRepo.save(
					new Member(d1, "Harry Potter", Status.ACTIVE, LocalDate.now().plusMonths(1))
			);
			Member mbr2 = memberRepo.save(
					new Member(d2, "Ron Weasley", Status.ACTIVE, LocalDate.now().plusMonths(1))
			);
			Member mbr3 = memberRepo.save(
					new Member(d3, "Hermine Granger", Status.ACTIVE, LocalDate.now().plusMonths(1))
			);
			Member mbr4 = memberRepo.save(
					new Member(d4, "Rubeus Hagrid", Status.ACTIVE, LocalDate.now().plusMonths(1))
			);
			Member mbr5 = memberRepo.save(
					new Member(d5, "Apollyon Pringle", Status.LAPSED, LocalDate.now().minusWeeks(2))
			);
			Member mbr6 = memberRepo.save(
					new Member(d6, "Aurora Sinistra", Status.ACTIVE, LocalDate.now().plusMonths(1))
			);
			Member mbr7 = memberRepo.save(
					new Member(d7, "Cuthbert Binns", Status.LAPSED, LocalDate.now().minusWeeks(3))
			);

		};

	}

}
