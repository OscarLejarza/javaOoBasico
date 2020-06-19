package com.testAutomationCoach.bVariables;

public class Guitarrista {

    //arreglo de guitarristas
    String nombre;
    String banda;


    //se crea el constructor
    public Guitarrista(String nombre, String banda) {
        this.nombre = nombre;
        this.banda = banda;
    }

    public boolean equals(Guitarrista g) {
        boolean x = false;
        return this.nombre.equals(g.nombre) && this.banda.equals(g.banda);
    }
}
