package com.prueba.tecnica.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin("*")
public class MenuController {

    @GetMapping("/requerimientos")
    public String getRequerimientos() {
        return "Requerimientos Endpoint";
    }

    @GetMapping("/ayuda")
    public String getAyuda() {
        return "Ayuda Endpoint";
    }
}

