package com.gustavo.gestion_citas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "servicios")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private Integer duracionMinima;

    @Column(nullable = false)
    private Integer duracionMaxima;

    public Servicio() {
    }

    public Servicio(String nombre, String descripcion, Integer duracionMinima, Integer duracionMaxima) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracionMinima = duracionMinima;
        this.duracionMaxima = duracionMaxima;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getDuracionMinima() {
        return duracionMinima;
    }

    public void setDuracionMinima(Integer duracionMinima) {
        this.duracionMinima = duracionMinima;
    }

    public Integer getDuracionMaxima() {
        return duracionMaxima;
    }

    public void setDuracionMaxima(Integer duracionMaxima) {
        this.duracionMaxima = duracionMaxima;
    }
}
