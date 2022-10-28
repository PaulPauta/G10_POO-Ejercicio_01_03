/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ayuda.trabajo3;

/**
 *
 * @author Juan Diego Roman
 */
public class AyudaTrabajo3 {

    public static void main(String[] args) {

        var pais1 = new Pais("Guillermo Lasso", "America", 18, "Ecuador");
        var ciudad1 = new Ciudad("Pedro Palacios", 10);
        ciudad1.setNombre("Cuenca");
        var provincia1 = new Provincia(8189);
        provincia1.setNombre("Azuay");

        System.out.println(pais1.mostrarInfo() + ciudad1.mostrarInfo() + provincia1.mostrarInfo());

        var pais2 = new Pais("Wladimir Putin", "Europa", 143, "Rusia");
        var ciudad2 = new Ciudad("Serguei Sobianin", 9000);
        ciudad2.setNombre("Moscu");
        var provincia2 = new Provincia(2511);
        provincia2.setNombre("Niguna");

        System.out.println(pais2.mostrarInfo() + ciudad2.mostrarInfo() + provincia2.mostrarInfo());

        var grupo1 = new Grupo(3, 0335, "Electronica");
        var asignatura1 = new Asignatura("Programacion", 160, 50076);
        var profesor1 = new Profesor("Pedro", "Programacion", 10);

        System.out.println(grupo1.mostrarInfo() + asignatura1.mostrarInfo() + profesor1.mostrarInfo());

        var grupo2 = new Grupo(5, 0445, "Ingenieria Civil");
        var asignatura2 = new Asignatura("Estructuras", 160, 40079);
        var profesor2 = new Profesor("Juan", "Estructuras", 28);

        System.out.println(grupo2.mostrarInfo() + asignatura2.mostrarInfo() + profesor2.mostrarInfo());

        var paisE1 = new Pais2("Ecuador", "America", 32);
        var equipo1 = new Equipo("Cuenca", "Puma", 11);
        var jugador1 = new Jugador("Diego", "Defensa", 18);

        System.out.println(paisE1.mostrarInfo() + equipo1.mostrarInfo() + jugador1.mostrarInfo());

        var paisE2 = new Pais2("Ecuador", "America", 32);
        var equipo2 = new Equipo("Liga", "Adidas", 4);
        var jugador2 = new Jugador("Pepe", "Defensa", 30);

        System.out.println(paisE2.mostrarInfo() + equipo2.mostrarInfo() + jugador2.mostrarInfo());

    }
}
