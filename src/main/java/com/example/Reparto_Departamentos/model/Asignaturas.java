package com.example.Reparto_Departamentos.model;

import jakarta.persistence.Entity;

@Entity
public class Asignaturas {
    private int idAsignatura;
    private String nombre;
    private String horas_semanales;

    public Asignaturas() {
    }

    public Asignaturas(String nombre, String horas_semanales) {
        this.nombre = nombre;
        this.horas_semanales = horas_semanales;
    }


}
