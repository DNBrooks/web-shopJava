package com.diplom.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarpedController {
    @GetMapping("/carped")
    public String carped(Model model) {
        return "carped";
    }
}
