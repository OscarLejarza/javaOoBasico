package com.testAutomationCoach.eHerencia.doctores;

import javax.print.Doc;

public class Doctor extends ProfesionalDeSalud{

    private String especialidad;
    private double salario;

    public Doctor(String nombre, String profesion, String especialidad){
        super(nombre, profesion, 3);
        this.especialidad = especialidad;

    }

    public Doctor(String nombre, String especialidad) {
        super(nombre, "Doctor", 4); // super le pasa los atributos de la clase padre
        this.especialidad = especialidad;
    }

    public Doctor(String nombre) {
        super(nombre, null, 5);

    }

    public Doctor() {
        super();
        this.especialidad = null;
    }

    public void tratarPaciente() {
        System.out.println("Saque la lengua y diga aaah!");
        System.out.println("pegar con el martillo en la rodilla");
    }

    public void prescribirMedicina() { System.out.println("Tome su paracetamol");
    }

    public String getEspecialidad() {
        return null;
    }
}
