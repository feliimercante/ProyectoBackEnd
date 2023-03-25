/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.fmo.controller;

/**
 *
 * @author Andrea
 */
import com.fasterxml.jackson.core.JsonProcessingException;
import com.portfolio.fmo.entities.ExpLaboral;
import com.portfolio.fmo.service.ExpLaboralService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExpLaboralController {

    @Autowired
    ExpLaboralService service;
    @RequestMapping("/expLaboral/list")
    public ResponseEntity<List<ExpLaboral>> list() throws JsonProcessingException {
        List<ExpLaboral> ExpLaborales = service.list();
        Object expLaboral = null;
        
        return new ResponseEntity(expLaboral,HttpStatus.OK);
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<ExpLaboral> getById(@PathVariable("id") int id){

        if(!service.existsById(id))

            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);

        ExpLaboral expLaboral = service.getOne(id).get();

        return new ResponseEntity(expLaboral, HttpStatus.OK);

    }
}
