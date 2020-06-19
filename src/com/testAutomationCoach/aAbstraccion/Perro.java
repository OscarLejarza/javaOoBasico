package com.testAutomationCoach.aAbstraccion;

public class Perro {
    //variables de instancia, tamano, raza, nombre
    public double tamanio;
    public String raza;
    public String nombre;

    //constructor

    public Perro(double tamanioPerro, String razaPerro, String nombrePerro){
        this.tamanio = tamanioPerro;
        this.raza = razaPerro;
        this.nombre = nombrePerro;

    }


    //comportamiento: ladrar, juguetear, comer, etc.

    public void ladrar() {
        System.out.println("guau guau");
    }
    public void correr() {}
    public void comer() {}
}
