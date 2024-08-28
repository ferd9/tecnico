package com.prueba.tecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.model.Solicitante;
import com.prueba.tecnica.service.SolicitanteService;

@RestController
@RequestMapping("/api/solicitantes")
@CrossOrigin("*")
public class SolicitanteController {

	@Autowired
	SolicitanteService solicitanteService;
	
	@GetMapping("/nombres")
	public List<Solicitante> getSolicitantesByName(@RequestParam(name = "buscar") String nombre){
		return solicitanteService.findByName(nombre);
	}
}
