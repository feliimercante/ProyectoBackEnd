/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.fmo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.portfolio.fmo.entities.Skill;
import com.portfolio.fmo.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SkillController {

    @Autowired
    SkillService service;
    @RequestMapping("/skill/list")
    public ResponseEntity<List<Skill>> list() throws JsonProcessingException {
        List<Skill> skills = service.list();
        
        return new ResponseEntity(skills,HttpStatus.OK);
    }
    
}

