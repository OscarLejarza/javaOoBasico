package com.testAutomationCoach.aAbstraccion;

public class EjemploPerro {
    static Perro firulais; // Una variable estatica depende si la accede el main
    public static void main(String[] args) {
        int edad;
          edad = 44;
        String nombre;
        Perro fido;
        fido = new Perro(); //instanciación porque la clase perro tiene muchas variables
        fido.nombre = "Fido";
        fido.raza = "Gran Danes";
        fido.tamanio = 45.0;

        fido.ladrar();
        fido.correr();
        fido.comer();

        Perro solovino = new Perro(34.5, "Chihuahua", "Solovino");
        System.out.println("Nombre " + solovino.nombre);

      //  Perro solovino = new perro(tamanioPerro: 34.5, razaPerro: "Corriente", nombrePerro: "Solovino")

        libs.Input.print("Nombre " + fido.nombre + "\n");
        libs.Input.print("Raza " +fido.raza + "\n");
        libs.Input.print("Tamaño " + fido.tamanio + "\n");
        firulais = fido; // esta asignando la referencia fido a firulais
        firulais.ladrar();

    }


    }