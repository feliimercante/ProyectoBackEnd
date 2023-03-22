/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.fmo.repositories;

import com.portfolio.fmo.entities.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andrea
 */
@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto,Integer> {
    public Proyecto findByNombre(String nombre);
  
}
