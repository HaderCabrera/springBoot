package com.project01.project01.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project01.project01.models.Person;


@RestController
public class PersonController {
    Map<Integer,Object> lstPerson = new HashMap<>();

    @PostMapping("/createPerson")
    public Map<Integer,Object> createPerson(@RequestBody Person person){
        lstPerson.put(person.getCedula(), person);
        return lstPerson;
    }

}
