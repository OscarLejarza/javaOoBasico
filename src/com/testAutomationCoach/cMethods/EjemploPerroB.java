package com.testAutomationCoach.cMethods;

import com.testAutomationCoach.aAbstraccion.Perro;

public class EjemploPerroB {
    public static void main(String[] args) {
        PerroB marmaduke = new PerroB(60.1, "Gran Danes", "Marmaduke");

        marmaduke.ladrar();
        marmaduke.comer();

        PerroB hund = new PerroB(45.3, "Pastor Aleman", "Hund");
//        pastorAleman.tamanio = 45.9;
        hund.ladrar();

        PerroB kleinHund = new PerroB(12.4, "Pug", "Peque");
//        pug.tamanio = 15.0;
        kleinHund.ladrar(10);

     /*   PerroB pastorAleman = new PerroB();
        pastorAleman.tamanio = 45.9;
        pastorAleman.ladrar();

        PerroB pug = new PerroB();
        pug.tamanio = 15.0;
        pug.ladrar();

        pug.ladrar(10);

      */
    }
}
