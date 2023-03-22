/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.fmo.repositories;

/**
 *
 * @author Andrea
 */

import com.portfolio.fmo.entities.ExpLaboral;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andrea
 */
@Repository
public interface IExpLaboralRepository extends JpaRepository<ExpLaboral,Integer> {
    public ExpLaboral findByNombre(String nombre);

    public List<ExpLaboral> findAll();
  
}
