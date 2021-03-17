package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface PersonDao {

    int insertPerson(UUID id, Person person);

    //We can implement the method in interface when using default
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();
    int deletePersonById(UUID id);
    int updatePersonById(UUID id, Person person);
    Optional<Person> selectPersonById(UUID id);
}
