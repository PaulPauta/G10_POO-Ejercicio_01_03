/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ayuda.trabajo3;

/**
 *
 * @author Juan Diego Roman
 */
public class Ciudad extends Reconocer {

    private String nombreAlcalde;
    private int numeroDeHospitales;
    private Ciudad pais;

    public Ciudad(String nombreAlcade, int numeroDeHospitales) {

        this.nombreAlcalde = nombreAlcade;
        this.numeroDeHospitales = numeroDeHospitales;
    }

    public String getNombreAlcalde() {
        return nombreAlcalde;
    }

    public int getNumeroDeHospitales() {
        return numeroDeHospitales;
    }

    public void setNombreAlcalde(String nombreAlcalde) {
        this.nombreAlcalde = nombreAlcalde;
    }

    public void setNumeroDeHospitales(int numeroDeHospitales) {
        this.numeroDeHospitales = numeroDeHospitales;
    }

    public Ciudad getpais() {
        return pais;
    }

    public void setpais(Ciudad pais) {
        this.pais = pais;
    }

    @Override
    public String mostrarInfo() {
        return ("; La ciudad es " + this.getNombre() + ", el alcalde es "
                + this.getNombreAlcalde() + " la ciudad cuenta con "
                + this.getNumeroDeHospitales() + " hospitales");
    }

}
