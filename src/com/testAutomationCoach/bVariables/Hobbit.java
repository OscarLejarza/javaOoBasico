package com.testAutomationCoach.bVariables;

class Hobbit {
    String name;
    Hobbit(String name) {
        this.name = name;
    }


    public static void main(String [] args) {
        Hobbit[] h = new Hobbit[3];
        int z = 0;
        while (z < 3) {
            h[z] = new Hobbit("bilbo");
            if (z == 1) {
                h[z] = new Hobbit("frodo");
            }
            if (z == 2) {
                h[z] = new Hobbit("sam");
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
            z = z + 1;
        }
    }
}

