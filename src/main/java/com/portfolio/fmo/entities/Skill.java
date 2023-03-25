
package com.portfolio.fmo.entities;

import javax.persistence.*;

@Entity
public class Skill {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    @JoinColumn(name="persona_id", nullable=false)
    private Persona persona;
    private double porcentaje;
    private String nombre;

    public Skill() {
    }

    
    public Skill(double porcentaje, String nombre) {
        this.porcentaje = porcentaje;
        this.nombre = nombre;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
