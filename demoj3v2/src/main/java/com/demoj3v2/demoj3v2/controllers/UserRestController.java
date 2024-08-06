package com.demoj3v2.demoj3v2.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoj3v2.demoj3v2.models.User;
import com.demoj3v2.demoj3v2.models.dto.UserDto;

@RestController
public class UserRestController {
    // @GetMapping("/v2/details")
    // public Map<String,Object> details(){
    //     Map<String,Object> body = new HashMap<>();
    //     body.put("title", "Desarrollando con Spring boot CreativeCode");
    //     body.put("author", "Johlver Pardo");
    //     return body;
    // }

    @GetMapping("/v2/details")
    public UserDto details(){
        UserDto userDto = new UserDto();
        User user = new User("Hader", "Cabrera");
        userDto.setTitle("Programando como locos, vamos que vamos");
        userDto.setUser(user);
        return userDto;
    }

}
