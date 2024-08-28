package com.prueba.tecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.tecnica.mapper.AnalistaMapper;
import com.prueba.tecnica.model.AnalistaTI;

@Service
public class AnalistaService {

	@Autowired
	private AnalistaMapper analistaMapper;
	
	public List<AnalistaTI> findByName(String name){
		return analistaMapper.findByName(name+"%");
	}
}
