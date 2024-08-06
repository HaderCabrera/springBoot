package com.demoj3v2.demoj3v2.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoj3v2.demoj3v2.models.User;

@RestController
@RequestMapping("/api")
public class UserRestModelController {
    @GetMapping("/details")
    public Map<String,Object> details(){
        User user = new User("Johlver","Pardo");
        Map<String,Object> body = new HashMap<>();
        body.put("title", "Desarrollando con Spring boot CreativeCode");
        body.put("user", user);
        return body;
    }

    @GetMapping("/list-details")
        public List<User> listdetails(){
        User user = new User("Juan","Perez");
        User userA = new User("Camilo","Hernandez");
        User userB = new User("Martha","Estupiñan");
        List<User> lstUsers = new ArrayList<>();
        lstUsers.add(user);
        lstUsers.add(userA);
        lstUsers.add(userB);
        return lstUsers;
    }
}
