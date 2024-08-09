package com.project01.project01.controllers;

import java.util.HashMap;
import java.util.Map;

import org.apache.tomcat.util.openssl.pem_password_cb;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project01.project01.models.Person;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class PersonController {
    Map<String,Person> lstPerson = new HashMap<>();

    @PostMapping("/createPerson")
    public Map<String,Person> createPerson(@RequestBody Person person){
        lstPerson.put(person.getCedula(), person);
        return lstPerson;
    }

    @GetMapping("/findPerson/{cedula}")
    public Person saludo(@PathVariable String cedula, Model model) {

        Person person = new Person();
        try {
          person = lstPerson.get(cedula);  
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        model.addAttribute("person", person);
        return person;
    }
    
}
