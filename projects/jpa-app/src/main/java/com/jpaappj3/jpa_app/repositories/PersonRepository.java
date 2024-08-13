package com.jpaappj3.jpa_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpaappj3.jpa_app.entities.Person;

public interface PersonRepository extends JpaRepository<Person,Long>{
    //https://github.com/trainingLeader/jpa-app
}
