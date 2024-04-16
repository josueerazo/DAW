package com.libcode.Crud.crud.Users.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class PageUserCotroller {

    @GetMapping("/users")
    public String listUser(Model model) {

        return "list-users";

    }
    
}
