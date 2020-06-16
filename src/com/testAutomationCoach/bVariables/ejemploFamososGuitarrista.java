package com.testAutomationCoach.bVariables;

public class ejemploFamososGuitarrista {

    public static void main(String[] args) {
        guitarrista[] listaGuitarrista = new guitarrista[5];
        int x = 0;
        listaGuitarrista[0] = new guitarrista("Jimmy Hendrix", "Solista");
        listaGuitarrista[1] = new guitarrista("James Hetfield", "Metallica");
        listaGuitarrista[2] = new guitarrista("Slash", "Guns&Roses");
        listaGuitarrista[3] = new guitarrista("Dave Mustaine", "Megadeth");
        listaGuitarrista[4] = new guitarrista("Jimmy Page", "Led Zeppelin");

        guitarraElectrica g = new guitarraElectrica("Fender", "Modelo1", "bicolor");
        g.famoso = listaGuitarrista;



        guitarrista peter  = new guitarrista("Slash", "Guns&Roses");
        // peter.nombre = "BenitoJuarez";
        // listaGuitarrista[2] = peter;

        for(int i = 0; i < g.famoso.length; i++) {
            guitarrista actual = g.famoso[i];
            if(actual.nombre.equals(peter.nombre)) {
                System.out.println("el guitarrista " + peter.nombre + " toca la guitarra " + g.nombre);
                break;
            }

        }


    }
}
