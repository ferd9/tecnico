package com.prueba.tecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.model.AnalistaTI;
import com.prueba.tecnica.service.AnalistaService;

@RestController
@RequestMapping("/api/analistas")
@CrossOrigin("*")
public class AnalistaController {

	@Autowired
	AnalistaService analistaService;
	
	@GetMapping("/nombres")
	public List<AnalistaTI> getAnalistasByName(@RequestParam(name = "buscar") String nombre){
		return analistaService.findByName(nombre);
	}
}
