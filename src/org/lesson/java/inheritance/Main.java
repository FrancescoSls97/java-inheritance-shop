package org.lesson.java.inheritance;

import java.math.BigDecimal;

public class Main {
 public static void main(String[] args) {

    // test superclasse prodotto
    Prodotto play = new Prodotto("PlayStation 5", "Sony", new BigDecimal(500));
    System.out.println(play.toString());
    Prodotto xbox = new Prodotto("XboxOne SeriesX", "Microsoft", new BigDecimal(480));
    System.out.println(xbox.toString());

    //sottoclasse smartphone
    Smartphone realMe = new Smartphone("GT Neo", "RealMe", new BigDecimal(700), 520, 11111);
    System.out.println(realMe.toString());
    Smartphone iPhone = new Smartphone("iPhone 16", "Apple", new BigDecimal(900), 128, 22222);
    System.out.println(iPhone.toString());

    //sottoclase televisore
    Televisore samsung = new Televisore("UltraSmartFireTV", "Samsung", new BigDecimal(1300), 55, true);
    System.out.println(samsung.toString());
    Televisore philips = new Televisore("SimpleTV", "Philips", new BigDecimal(400), 55, false);
    System.out.println(philips.toString());

    //sottoclasse cuffie
    Cuffie razer = new Cuffie("PhytonX3500", "Razer", new BigDecimal(180), "Verde/Nero", true);
    System.out.println(razer.toString());
    Cuffie logitech = new Cuffie("G750", "Logitech", new BigDecimal(50), "Bianco/Blu", false);
    System.out.println(logitech.toString());
 }
}
