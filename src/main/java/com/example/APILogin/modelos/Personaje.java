package com.example.APILogin.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "personajes")
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer cantidadVida;
    private Integer poderDefensa;
    private String fotografia;
    private LocalDate fechaCreacion;

    public Personaje() {
    }

    public Personaje(Integer id, String name, Integer cantidadVida, Integer poderDefensa, String fotografia, LocalDate fechaCreacion) {
        this.id = id;
        this.name = this.name;
        this.cantidadVida = cantidadVida;
        this.poderDefensa = poderDefensa;
        this.fotografia = fotografia;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = this.name;
    }

    public Integer getCantidadVida() {
        return cantidadVida;
    }

    public void setCantidadVida(Integer cantidadVida) {
        this.cantidadVida = cantidadVida;
    }

    public Integer getPoderDefensa() {
        return poderDefensa;
    }

    public void setPoderDefensa(Integer poderDefensa) {
        this.poderDefensa = poderDefensa;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
