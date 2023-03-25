/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.fmo.service;

import com.portfolio.fmo.entities.Proyecto;
import com.portfolio.fmo.repositories.IProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Andrea
 */
@Service
@Transactional
public class ProyectoService {
    
    @Autowired
    private IProyectoRepository ProyectoRepository;
    
    public List<Proyecto> list() {
        return ProyectoRepository.findAll();
    }
    
    public Optional<Proyecto> getOne(Integer id){
        return ProyectoRepository.findById(id);
    }
    
    public Proyecto getByNombre(String nombre){
        return ProyectoRepository.findByNombre(nombre);
    }
    
    public void save(Proyecto proyecto){
        ProyectoRepository.save(proyecto);
    }
    
    public void delete(Integer id ){
        ProyectoRepository.deleteById(id);
    }
}
