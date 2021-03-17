package com.example.demo.service;

import com.example.demo.dao.FakePersonDataAccessService;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final FakePersonDataAccessService personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") FakePersonDataAccessService personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
}
