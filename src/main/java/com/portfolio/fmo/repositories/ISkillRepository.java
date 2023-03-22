/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.fmo.repositories;

import com.portfolio.fmo.entities.Proyecto;
import com.portfolio.fmo.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andrea
 */
@Repository
public interface ISkillRepository extends JpaRepository<Skill,Integer> {
    public Skill findByNombre(String nombre);
  
}

