package com.testAutomationCoach.eHerencia.doctores;

public class ProfesionalDeSalud {


    protected String nombre;
    protected String profesion;
    public int x;

    public ProfesionalDeSalud(String nombre, String profesion, int x) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.x = x;
    }

    public ProfesionalDeSalud() {
        this.nombre = null;
        this.profesion = null;
    }

    public void tratarPaciente() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }


}
