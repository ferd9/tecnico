package com.prueba.tecnica.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.prueba.tecnica.model.CoordinadorHelpdesk;

@Mapper
public interface CoordinadorMapper {

	public List<CoordinadorHelpdesk> findByName(String nombre);
}
