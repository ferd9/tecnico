package com.prueba.tecnica.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.prueba.tecnica.model.Requerimiento;

@Mapper
public interface RequerimientoMapper {
    List<Requerimiento> findAll();
    List<Requerimiento> findByName(String nombre);
    Requerimiento findById(Long id);
    void insert(Requerimiento requerimiento);
    void update(Requerimiento requerimiento);
    void delete(Long id);
}
