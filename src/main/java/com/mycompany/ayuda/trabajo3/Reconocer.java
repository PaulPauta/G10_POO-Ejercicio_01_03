/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ayuda.trabajo3;

/**
 *
 * @author Juan Diego Roman
 */
public abstract class Reconocer {

    String nombre;
    private int numerodeHabitantes;

    public abstract String mostrarInfo();

    public String getNombre() {
        return nombre;
    }

    public void setNumerodeHabitantes(int numerodeHabitantes) {
        this.numerodeHabitantes = numerodeHabitantes;
    }

    public int getNumerodeHabitantes() {
        return numerodeHabitantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
