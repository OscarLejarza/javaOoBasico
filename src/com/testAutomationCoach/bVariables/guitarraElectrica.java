package com.testAutomationCoach.bVariables;

public class guitarraElectrica {

    String nombre;
    String modelo;
    String color;
    guitarrista[] famoso;

    public guitarraElectrica(String nombre, String modelo, String color) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.color = color;
        famoso = new guitarrista[5];
    }

    public void afinarGuitarra() {
    }

    public void tunearGuitarra() {
    }

 /*   public boolean puedoAgregar(){
        for (int i = 0; i < famosos.length; i++){
            if (famosos[i] == null)
                return true;
        }
        return false;

        public void agregarGuitarrista(guitarrista x){
            if (puedoAgregar()){

                famosos[4] = x;
                else{
                    guitarrista[] nuevo = new guitarrista[famosos.length * 2];
                    for (int i = 0; i < famosos.length; i++){
                        nuevo[i] == famosos[i];
                    }
                    nuevo[famosos.length] = x;
                    famosos = nuevo
                }
            }

            public boolean famosoTocaEstaGuitarra(guitarrista x)

        }

    //Marca, arreglo guitarrista

    public GuitarraElectrica(String nombre, String modelo, String color){

            this.nombre = nombre;
            this.modelo = modelo;
            this.color = color;
        }
    }*/


}
