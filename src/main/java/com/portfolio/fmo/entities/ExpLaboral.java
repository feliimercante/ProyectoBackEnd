/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.fmo.entities;

/**
 *
 * @author Andrea
 */

import javax.persistence.*;
import java.util.Date;


@Entity
public class ExpLaboral {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    @JoinColumn(name="persona_id", nullable=false)
    private Persona persona;
    private String descripcion;
    private String titulo;
    private Date FechaInicio;
    private Date FechaFin;

    public ExpLaboral(Integer id, Persona persona, String descripcion, String titulo, Date FechaInicio, Date FechaFin) {
        this.id = id;
        this.persona = persona;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
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
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }

}
    