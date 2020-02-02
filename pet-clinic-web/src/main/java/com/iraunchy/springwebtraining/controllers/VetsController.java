package com.iraunchy.springwebtraining.controllers;

import com.iraunchy.springwebtraining.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {

    private final VetService vetService;

    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index.html", "vets/index"})
    public String listOfVets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
