package com.iraunchy.springwebtraining.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {

    @RequestMapping({"/vets", "/vets/index.html", "vets/index"})
    public String vetsList() {
        return "vets/index";
    }
}
