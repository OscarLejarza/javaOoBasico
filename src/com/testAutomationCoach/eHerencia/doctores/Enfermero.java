package com.testAutomationCoach.eHerencia.doctores;

public class Enfermero extends ProfesionalDeSalud {

    public void cuidarPaciente() {
        System.out.println("Bañar paciente");
    }

    public void administrarMedicinas() {
        System.out.println("Inyectar medicamento");
        System.out.println("dar pastillas");
        System.out.println("Dar cucharada de jarabe");
    }
}
