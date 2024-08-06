package com.demoj3v2.demoj3v2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demoj3v2.demoj3v2.models.dto.ParamsDto;

@RestController
@RequestMapping("api/params/hader")
public class RequestParamsController {

    @GetMapping("/foo")
        public ParamsDto foot(@RequestParam(required = false, defaultValue = "Hola Mundo") String message) {
        ParamsDto param = new ParamsDto();
        param.setMessage(message);
        return param;
    }
}
