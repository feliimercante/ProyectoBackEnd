package com.portfolio.fmo.entities;

import java.util.ArrayList;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Persona {

    @Id
    @GeneratedValue
    private Integer id;
    private String nombre;
    private String titulo;
    private String descripcion;
    @OneToMany(mappedBy = "persona")
    private Set<Skill> skills;
    @OneToMany(mappedBy = "persona")
    private Set<Proyecto> proyecto;
    @OneToMany(mappedBy = "persona")
    private Set<ExpLaboral> expLaboral;
    @OneToMany(mappedBy = "persona")
    private Set<Educacion> educacion;

    public Persona() {
    }

    public Persona(Integer id, String nombre, String titulo, String descripcion, Set<Skill> skills, Set<Proyecto> proyecto, Set<ExpLaboral> expLaboral, Set<Educacion> educacion) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.skills = skills;
        this.proyecto = proyecto;
        this.expLaboral = expLaboral;
        this.educacion = educacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public Set<Proyecto> getProyecto() {
        return proyecto;
    }

    public void setProyecto(Set<Proyecto> proyecto) {
        this.proyecto = proyecto;
    }

    public Set<ExpLaboral> getExpLaboral() {
        return expLaboral;
    }

    public void setExpLaboral(Set<ExpLaboral> expLaboral) {
        this.expLaboral = expLaboral;
    }

    public Set<Educacion> getEducacion() {
        return educacion;
    }

    public void setEducacion(Set<Educacion> educacion) {
        this.educacion = educacion;
    }

    

}
