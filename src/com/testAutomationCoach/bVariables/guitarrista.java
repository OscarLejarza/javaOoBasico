package com.testAutomationCoach.bVariables;

public class guitarrista {

    //arreglo de guitarristas
    String nombre;
    String agrupacion;

    public guitarrista (String nombre, String agrupacion)
    {
        this.nombre= nombre;
        this.agrupacion= agrupacion;
    }

    public boolean equals(guitarrista g) {
        boolean x = false;
        return this.nombre.equals(g.nombre) && this.agrupacion.equals(g.agrupacion);
    }

}
