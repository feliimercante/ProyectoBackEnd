/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.fmo.repositories;

import com.portfolio.fmo.entities.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author Andrea
 */
@Repository
public interface IEducacionRepository extends JpaRepository<Educacion,Integer> {
    public Educacion findByNombre(String nombre);

    public List<Educacion> findAll();
  
}
