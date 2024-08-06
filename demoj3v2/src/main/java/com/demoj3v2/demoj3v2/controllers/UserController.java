package com.demoj3v2.demoj3v2.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.demoj3v2.demoj3v2.models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



// @Controller
// public class UserController {
//     @GetMapping("/details")
//     public String details(Model model) {
//         model.addAttribute("mensaje", "Hola putos");
//         return "details";
//     }
    
// }

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Johlver","Pardo");
        model.addAttribute("mensaje", "Hola putos");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
        public String list(ModelMap model){
            List<User> users = Arrays.asList(
            new User("Carlos", "Perez"),
            new User("Martha","Sanchez"),
            new User("Vicente","Camargo")
            );
            model.addAttribute("title", "Listado de Usuarios");
            model.addAttribute("users", users);
        return "list";
    }
    
}
