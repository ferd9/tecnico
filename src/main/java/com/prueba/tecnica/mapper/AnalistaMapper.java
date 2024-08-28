package com.prueba.tecnica.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.prueba.tecnica.model.AnalistaTI;

@Mapper
public interface AnalistaMapper {

	public List<AnalistaTI> findByName(String nombre);
}
