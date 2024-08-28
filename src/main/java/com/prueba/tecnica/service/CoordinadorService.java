package com.prueba.tecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.tecnica.mapper.CoordinadorMapper;
import com.prueba.tecnica.model.CoordinadorHelpdesk;

@Service
public class CoordinadorService {

	@Autowired
	private CoordinadorMapper coordinadorMapper;
	
	public List<CoordinadorHelpdesk> findByName(String name){
		return coordinadorMapper.findByName(name+"%");
	}
}
