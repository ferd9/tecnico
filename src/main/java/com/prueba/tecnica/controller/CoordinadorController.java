package com.prueba.tecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.model.CoordinadorHelpdesk;
import com.prueba.tecnica.service.CoordinadorService;


@RestController
@RequestMapping("/api/coordinador")
@CrossOrigin("*")
public class CoordinadorController {

	@Autowired
	CoordinadorService coordinadorService;
	
	@GetMapping("/nombres")
	public List<CoordinadorHelpdesk> getSolicitantesByName(@RequestParam(name = "buscar") String nombre){
		return coordinadorService.findByName(nombre);
	}
}
