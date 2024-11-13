package com.example.Reparto_Departamentos.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Profesores {

    private String nombre;
    @Id
    private String email;
    private int horas_lectivas;

    public Profesores() {
    }
    public Profesores(String nombre, String email, int horas_lectivas) {
        this.nombre = nombre;
        this.email = email;
        this.horas_lectivas = 18;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getHoras_lectivas() {
        return horas_lectivas;
    }

    public void setHoras_lectivas(int horas_lectivas) {
        this.horas_lectivas = horas_lectivas;
    }

    @Override
    public String toString() {
        return "Profesores{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", horas_lectivas=" + horas_lectivas +
                '}';
    }

    /*defino las relaciones
    * Profesores asignaturas M:N
    * Asignaturas Departamentos 1:N
    *
    *
    * */
}
