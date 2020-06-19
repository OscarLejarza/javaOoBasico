package com.testAutomationCoach.bVariables;

public class ejemploFamososGuitarrista {

    public static void main(String[] args) {
        Guitarrista[] listaGuitarrista = new Guitarrista[5];
        int x = 0;
        listaGuitarrista[0] = new Guitarrista("Jimmy Hendrix", "Solista");
        listaGuitarrista[1] = new Guitarrista("James Hetfield", "Metallica");
        listaGuitarrista[2] = new Guitarrista("Slash", "Guns&Roses");
        listaGuitarrista[3] = new Guitarrista("Dave Mustaine", "Megadeth");
        listaGuitarrista[4] = new Guitarrista("Jimmy Page", "Led Zeppelin");

        GuitarraElectrica g = new GuitarraElectrica("Fender", "Modelo1",'D');
        g.guitarristas = listaGuitarrista;

        Guitarrista tom = new Guitarrista("Slash","Guns&Roses");
       // tom.nombre = "Benito Juarez";
       // listaGuitarrista[2] = tom;

        for (int i = 0; i < g.guitarristas.length; i++) {
            Guitarrista actual = g.guitarristas[i];
            if(actual.nombre.equals(tom.nombre)) {
                System.out.println("El guitarrista " + tom.nombre + " toca la guitarra " + g.tipoGuitarra);
                break;
            }
        }

    }
}
