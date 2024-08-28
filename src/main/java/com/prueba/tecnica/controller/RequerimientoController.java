package com.prueba.tecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.model.Requerimiento;
import com.prueba.tecnica.service.RequerimientoService;

@RestController
@RequestMapping("/api/requerimientos")
@CrossOrigin("*")
public class RequerimientoController {

    @Autowired
    private RequerimientoService requerimientoService;

    @GetMapping
    public List<Requerimiento> getAllRequerimientos() {
        return requerimientoService.getAllRequerimientos();
    }
    
    @GetMapping("/buscar")
    public List<Requerimiento> getAllByName(@RequestParam(name = "b") String nombre) {
        return requerimientoService.getAllByName(nombre);
    }

    @GetMapping("/{id}")
    public Requerimiento getRequerimientoById(@PathVariable Long id) {
        return requerimientoService.getRequerimientoById(id);
    }

    @PostMapping
    public String createRequerimiento(@RequestBody Requerimiento requerimiento) {
        requerimientoService.createRequerimiento(requerimiento);
        return requerimiento.getIdRequerimiento().toString();
    }

    @PutMapping("/{id}")
    public void updateRequerimiento(@PathVariable Long id, @RequestBody Requerimiento requerimiento) {
        requerimientoService.updateRequerimiento(id, requerimiento);
    }

    @DeleteMapping("/{id}")
    public void deleteRequerimiento(@PathVariable Long id) {
        requerimientoService.deleteRequerimiento(id);
    }
}

