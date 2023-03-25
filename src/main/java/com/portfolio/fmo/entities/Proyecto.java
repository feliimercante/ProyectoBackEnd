
package com.portfolio.fmo.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    @JoinColumn(name="persona_id", nullable=false)
    private Persona persona;
    private String nombre;
    private String descripcion;
    private String link;
    private LocalDate fecha;
    
    public Proyecto(){
    }

    public Proyecto(String nombre, String descripcion, String link, LocalDate fecha) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
}
