package com.testAutomationCoach.bVariables;

class Book {
    String title;
    String author;
    public Book(String title, String author){ //La clase estaba mal definida. Le hacia falta agregar el orden de los valores asignados
        this.title = title;
        this.author = author;
    }
}
//debuguear

class BookTestDrive {
    public static void main(String [] args) {


        Book [] myBooks = new Book[3]; //arreglo de libros, hasta 3 posiciones de memoria
        int x = 0; //inicializa x en cero
        myBooks[0] = new Book("The Grapes of Java","John Steinbeck");
        myBooks[1] = new Book("The Java Gatsby","Scott Fitzgerald");
        myBooks[2] = new Book("The Java Cookbook","Ian Darwin");
        /*myBook[0].title = "The Grapes of Java"; //Asignacion estaba mal hecha porque no esta escrito el constructor
        myBook[0].title = "The Java Gatsby";
        myBook[0].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian"; */


        while (x < 3) {//mientras x sea menor a 3, entra
            System.out.print(myBooks[x].title);//  imprime el titulo del libro en la posicion de x
            System.out.print(" by ");
            System.out.println(myBooks[x].author); //imprime el autor del libro en la posicion de x
            x = x + 1; //le suma 1 a x
        }
    }
}
