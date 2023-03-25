/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.fmo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.portfolio.fmo.entities.Educacion;
import com.portfolio.fmo.service.EducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EducacionController {

    @Autowired
    EducacionService service;
    @RequestMapping("/educacion/list")
    public ResponseEntity<List<Educacion>> list() throws JsonProcessingException {
        List<Educacion> estudios = service.list();
        Object educacion = null;
        
        return new ResponseEntity(educacion,HttpStatus.OK);
    }
    
}
