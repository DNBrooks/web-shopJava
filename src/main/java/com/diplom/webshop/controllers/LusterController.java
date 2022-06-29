package com.diplom.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LusterController {
    @GetMapping("/luster")
    public String luster(Model model) {
        return "luster";
    }
}
