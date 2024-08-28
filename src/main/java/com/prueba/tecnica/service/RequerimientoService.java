package com.prueba.tecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.tecnica.mapper.RequerimientoMapper;
import com.prueba.tecnica.model.Requerimiento;

@Service
public class RequerimientoService {

    @Autowired
    private RequerimientoMapper requerimientoMapper;

    public List<Requerimiento> getAllRequerimientos() {
        return requerimientoMapper.findAll();
    }
    
    public List<Requerimiento> getAllByName(String nombre) {
        return requerimientoMapper.findByName(nombre+"%");
    }

    public Requerimiento getRequerimientoById(Long id) {
        return requerimientoMapper.findById(id);
    }

    public void createRequerimiento(Requerimiento requerimiento) {
        requerimientoMapper.insert(requerimiento);
    }

    public void updateRequerimiento(Long id, Requerimiento requerimiento) {
        requerimiento.setIdRequerimiento(id);
        requerimientoMapper.update(requerimiento);
    }

    public void deleteRequerimiento(Long id) {
        requerimientoMapper.delete(id);
    }
}
