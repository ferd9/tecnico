package com.prueba.tecnica.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.prueba.tecnica.model.Solicitante;

@Mapper
public interface SolicitanteMapper {

	public List<Solicitante> findByName(String nombre);
}
