package com.diplom.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MirrorController {
    @GetMapping("/mirror")
    public String mirror(Model model) {
        return "mirror";
    }
}
