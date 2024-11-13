package com.example.Reparto_Departamentos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Departamentos {

    @Id
    private String nombre;


    public Departamentos() {

    }
    public Departamentos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Departamentos{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
