package org.lesson.java.inheritance;

public class Main {
 public static void main(String[] args) {
    // test superclasse prodotto
    Prodotto play = new Prodotto("PlayStation 5", "Sony", 500, 22);

    System.out.println(play.getInfo());
 }
}
