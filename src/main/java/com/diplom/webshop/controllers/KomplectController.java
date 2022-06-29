package com.diplom.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KomplectController {
    @GetMapping("/komplect")
    public String tableAndChair(Model model) {
        return "komplect";
    }
}
