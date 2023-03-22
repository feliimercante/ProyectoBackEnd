package com.portfolio.fmo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.portfolio.fmo.entities.Persona;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.fmo.entities.Proyecto;
import com.portfolio.fmo.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class PersonaController {

   @Autowired
    PersonaService service;
    @RequestMapping("/list")
    public ResponseEntity<List<Proyecto>> list() throws JsonProcessingException {
        List<Persona> personas = service.list();
        
        return new ResponseEntity(personas,HttpStatus.OK);
    }
    @RequestMapping("/Persona")
    public ResponseEntity <Persona> GetByName(@RequestParam String nombre) throws JsonProcessingException {
        Persona persona = service.getByNombre(nombre);
        
        return new ResponseEntity(persona,HttpStatus.OK);
    }
    
    // TO DO: update
}

