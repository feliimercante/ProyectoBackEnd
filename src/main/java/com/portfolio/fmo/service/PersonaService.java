/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.fmo.service;

import com.portfolio.fmo.entities.Persona;
import com.portfolio.fmo.repositories.IPersonaRepository;
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
public class PersonaService {
    
    @Autowired
    private IPersonaRepository PersonaRepository;
    
    public List<Persona> list() {
        return PersonaRepository.findAll();
    }
    
    public Optional<Persona> getOne(Integer id){
        return PersonaRepository.findById(id);
    }
    
    public Persona getByNombre(String nombre){
        return PersonaRepository.findByNombre(nombre);
    }
    
    public void save(Persona persona){
        PersonaRepository.save(persona);
    }
    
    public void delete(Integer id ){
        PersonaRepository.deleteById(id);
    }
}

