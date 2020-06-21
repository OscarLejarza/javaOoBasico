package com.testAutomationCoach.eHerencia.animals;

public class Gato extends Felino {

    //override - especializacion
    public void hacerRuido() {
        System.out.println("Miau");
    }

    //overload
    public void hacerRuido(String humor) {}

    public void comer() {
        System.out.println("Como Whiskas y Pajaritos");
    }

}
