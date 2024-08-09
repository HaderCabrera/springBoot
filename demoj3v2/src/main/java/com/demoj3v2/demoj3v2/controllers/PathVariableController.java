package com.demoj3v2.demoj3v2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoj3v2.demoj3v2.models.dto.ParamsDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/demovar")

public class PathVariableController {

    @Value("${app.name}")
    private String name;
    @Value("${app.version}")
    private String version;
    @Value("${app.listwords}")
    private String[] listwords;
    @Value("${app.listaroles}")
    private List<String> lstroles;
    @Value("${app.message}")
    private String message;

    @GetMapping("/valores")
    public Map<String,Object> valores(){
        Map<String,Object> json = new HashMap<>();
        json.put("name", name);
        json.put("version",version);
        json.put("listwords",listwords);
        json.put("lstroles",lstroles);
        json.put("message",message);
        return json;
    }

    @GetMapping("/saludo/{message}")
    public ParamsDto saludo(@PathVariable String message) {
        ParamsDto param = new ParamsDto();
        param.setMessage(message);
        return param;
    }


    
}
