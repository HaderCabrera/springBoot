package com.demoj3v2.demoj3v2.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
    @GetMapping("/v2/details")
    public Map<String,Object> details(){
        Map<String,Object> body = new HashMap<>();
        body.put("title", "Desarrollando con Spring boot CreativeCode");
        body.put("author", "Johlver Pardo");
        return body;
    }
}
