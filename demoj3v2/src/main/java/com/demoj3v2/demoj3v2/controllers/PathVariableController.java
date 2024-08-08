package com.demoj3v2.demoj3v2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoj3v2.demoj3v2.models.dto.ParamsDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/demovar")

public class PathVariableController {
    @GetMapping("/saludo/{message}")
    public ParamsDto saludo(@PathVariable String message) {
        ParamsDto param = new ParamsDto();
        param.setMessage(message);
        return param;
    }
    
}
