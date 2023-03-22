/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.fmo.dto;

import java.time.LocalDate;

/**
 *
 * @author Andrea
 */
public class ProyectoDto {
    private String nombre;
    private String descripcion;
    private String link;
    private LocalDate fecha;

    public ProyectoDto(String nombre, String descripcion, String link, LocalDate fecha) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.link = link;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
    
}
