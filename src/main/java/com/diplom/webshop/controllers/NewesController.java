package com.diplom.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewesController {
    @GetMapping ("/newes")
    public String newes(Model model) {
        return  "newes";
    }
}
