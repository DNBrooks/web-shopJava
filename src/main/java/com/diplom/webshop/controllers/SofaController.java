package com.diplom.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class SofaController {
    @GetMapping("/sofa")
    public String sales(Model model) {
        return "sofa";
    }
}
