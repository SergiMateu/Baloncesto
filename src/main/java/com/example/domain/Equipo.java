package com.example.domain;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by Sergi M on 21/10/2016.
 */
@Entity
public class Equipo {


@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String localidad;
    private LocalDate creación;



    public Equipo(){


    }

    public Equipo(String nombre, String localidad, LocalDate creación) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.creación = creación;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getCreación() {
        return creación;
    }

    public void setCreación(LocalDate creación) {
        this.creación = creación;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", creación=" + creación +
                '}';
    }
}
