/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.fmo.entities;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Educacion {
    @Id
    @GeneratedValue
    private Integer id;
    private String descripcion;
    private String titulo;
    private Date fechaInicio;
    private Date fechaFin;

    public Educacion() {
    }

    public Educacion( String descripcion, String titulo, Date fechaInicio, Date fechaFin) {
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.fechaInicio = FechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.fechaFin = FechaFin;
    }

}
    

    

    
    
    
