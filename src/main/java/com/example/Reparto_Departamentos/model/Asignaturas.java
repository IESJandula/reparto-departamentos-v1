package com.example.Reparto_Departamentos.model;

import jakarta.persistence.*;

@Entity
public class Asignaturas {

    @Id
    private int idAsignatura;
    private String nombre;
    private String horas_semanales;

    public Asignaturas() {
    }

    public Asignaturas(String nombre, String horas_semanales) {
        this.nombre = nombre;
        this.horas_semanales = horas_semanales;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHoras_semanales() {
        return horas_semanales;
    }

    public void setHoras_semanales(String horas_semanales) {
        this.horas_semanales = horas_semanales;
    }

    @Override
    public String toString() {
        return "Asignaturas{" +
                "idAsignatura=" + idAsignatura +
                ", nombre='" + nombre + '\'' +
                ", horas_semanales='" + horas_semanales + '\'' +
                '}';
    }
}
