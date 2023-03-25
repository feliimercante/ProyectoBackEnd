/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.fmo.service;

/**
 *
 * @author Andrea
 */

import com.portfolio.fmo.entities.ExpLaboral;
import com.portfolio.fmo.repositories.IExpLaboralRepository;
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
public class ExpLaboralService {
    
    @Autowired
    private IExpLaboralRepository ExpLaboralRepository;
    
    public List<ExpLaboral> list() {
        return ExpLaboralRepository.findAll();
    }
    
    public Optional<ExpLaboral> getOne(Integer id){
        return ExpLaboralRepository.findById(id);
    }
    
    public void save(ExpLaboral ExpLaboral){
        ExpLaboralRepository.save(ExpLaboral);
    }
    
    public void delete(Integer id ){
        ExpLaboralRepository.deleteById(id);
    }
}