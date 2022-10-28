/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ayuda.trabajo3;

/**
 *
 * @author Juan Diego Roman
 */
public class Provincia extends Reconocer {

    private int territorio;
    

    public Provincia(int territorio) {
        this.territorio = territorio;
        
    }

    public int getTerritorio() {
        return territorio;
    }



    @Override
    public String mostrarInfo() {
        return ("; la provincia " + this.getNombre() + " tiene una extencion de terreno de " + this.getTerritorio() + " metros cuadrados");
    }
}
