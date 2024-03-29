/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.fmo.service;

import com.portfolio.fmo.entities.Educacion;
import com.portfolio.fmo.repositories.IEducacionRepository;
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
public class EducacionService {
    
    @Autowired
    private IEducacionRepository EducacionRepository;
    
    public List<Educacion> list() {
        return EducacionRepository.findAll();
    }
    
    public Optional<Educacion> getOne(Integer id){
        return EducacionRepository.findById(id);
    }
   
    public void save(Educacion Educacion){
        EducacionRepository.save(Educacion);
    }
    
    public void delete(Integer id ){
        EducacionRepository.deleteById(id);
    }
}