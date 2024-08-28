package com.prueba.tecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.tecnica.mapper.SolicitanteMapper;
import com.prueba.tecnica.model.Solicitante;

@Service
public class SolicitanteService {

	@Autowired
	private SolicitanteMapper solicitanteMapper;
	
	public List<Solicitante> findByName(String name){
		return solicitanteMapper.findByName(name+"%");
	}
}
