package com.testAutomationCoach.eHerencia.doctores;
                        //is-a
public class Pediatra  extends Doctor {

    public void examinarInfantes() { System.out.println("Da paletitas a los niños"); }

    public void tratarPaciente() { System.out.println("Pesa al bebé, le da palmaditas"); }

    public void prescribirMedicina() { System.out.println("Tome su mejoralito, y su motrin y su jarabe que sabe a rayos"); }
}
