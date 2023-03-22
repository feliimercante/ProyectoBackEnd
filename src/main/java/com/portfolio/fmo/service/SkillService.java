/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.fmo.service;

import com.portfolio.fmo.entities.Proyecto;
import com.portfolio.fmo.entities.Skill;
import com.portfolio.fmo.repositories.IProyectoRepository;
import com.portfolio.fmo.repositories.ISkillRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andrea
 */
@Service
@Transactional
public class SkillService {
    
    @Autowired
    private ISkillRepository SkillRepository;
    
    public List<Skill> list() {
        return SkillRepository.findAll();
    }
    
    public Optional<Skill> getOne(Integer id){
        return SkillRepository.findById(id);
    }
    
    public Skill getByNombre(String nombre){
        return SkillRepository.findByNombre(nombre);
    }
    
    public void save(Skill Skill){
        SkillRepository.save(Skill);
    }
    
    public void delete(Integer id ){
        SkillRepository.deleteById(id);
    }
}
