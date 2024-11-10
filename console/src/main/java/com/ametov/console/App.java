package com.ametov.console;

import com.ametov.core.Person;
import com.ametov.service.PersonService;
import com.fasterxml.jackson.core.JsonProcessingException;

public class App {
    private static PersonService personService = new PersonService();

    public static void main(String[] args) throws JsonProcessingException {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        System.out.println(person);

        String json = personService.convert(person);
        System.out.println(json);

        Person fromJson = personService.parse(json);
        System.out.println(fromJson);
    }
}
