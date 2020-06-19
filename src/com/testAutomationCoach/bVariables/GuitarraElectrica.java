package com.testAutomationCoach.bVariables;

public class GuitarraElectrica {

    //Atributos
    Guitarrista[] guitarristas;
    String tipoGuitarra;
    String modeloGuitarra;
    char lateralidad;

    public GuitarraElectrica(String tipoGuitarra, String modeloGuitarra, char lateralidad ) {
        this.tipoGuitarra = tipoGuitarra;
        this.modeloGuitarra = modeloGuitarra;
        this.lateralidad = lateralidad;
        guitarristas = new Guitarrista[10];
    }


    public void afinarGuitarra() {
    }

    public void  tunearGuitarra() {
    }

    //public void

    /*public void Guitarrista[] getGuitarristas() {
        return guitarristas;
    }

    public void setGuitarristas(Guitarrista[] guitarristas) {
        this.guitarristas = guitarristas;
    }

    public void String getTipoGuitarra() {
        return tipoGuitarra;
    }

    public void setTipoGuitarra(String tipoGuitarra){
        this.tipoGuitarra = tipoGuitarra;
    }

    public void String getModeloGuitarra() {
        return modeloGuitarra;
    }

    public void setModeloGuitarra(String modeloGuitarra){
        this.modeloGuitarra = modeloGuitarra;
    }

    public char getLateralidad(){
        return lateralidad;
    }

    public void setLateralidad(char lateralidad) {
        this.lateralidad = lateralidad;
    }*/

}
