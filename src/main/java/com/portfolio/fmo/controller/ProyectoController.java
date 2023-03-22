package com.portfolio.fmo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.fmo.entities.Proyecto;
import com.portfolio.fmo.service.ProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class ProyectoController {

    @Autowired
    ProyectoService service;
    @RequestMapping("/proyecto/list")
    public ResponseEntity<List<Proyecto>> list() throws JsonProcessingException {
        List<Proyecto> proyectos = service.list();
        
        return new ResponseEntity(proyectos,HttpStatus.OK);
    }
    
}
