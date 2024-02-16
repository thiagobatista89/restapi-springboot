package com.thiago.restapi.services;

import com.thiago.restapi.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
@Service
public class PersonService {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person findById(String id) {
        logger.info("Finding one person!");
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Thiago");
        person.setLastName("Batista");
        person.setAdress("Lisbon, Portugal");
        person.setGender("Male");
        return person;
    }

    public List<Person> findByAll(){
        logger.info("Finding all people!");
        List<Person> persons = new ArrayList<>();
        for(int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name " + i);
        person.setLastName("Last name " + 1);
        person.setAdress("Some adress in lisbon " + i);
        person.setGender("Option " + i);
        return person;
    }

    public Person create(Person person) {
        logger.info("Create one person!");
        return person;
    }

    public Person update(Person person) {
        logger.info("Update a person!");
        return person;
    }
    public void delete(String person) {
        logger.info("Delete a person!");
    }

}
