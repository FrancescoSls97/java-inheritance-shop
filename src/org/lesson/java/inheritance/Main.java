package org.lesson.java.inheritance;

public class Main {
 public static void main(String[] args) {

    // test superclasse prodotto
    Prodotto play = new Prodotto("PlayStation 5", "Sony", 500, 22);
    System.out.println(play.getInfo());
    Prodotto xbox = new Prodotto("XboxOne SeriesX", "Microsoft", 450, 22);
    System.out.println(xbox.getInfo());

    //sottoclasse smartphone
    Smarthphone realMe = new Smarthphone("GT Neo", "RealMe", 650, 22, 520);
    System.out.println(realMe.getSmartphoneInfo());
    Smarthphone iPhone = new Smarthphone("iPhone 16", "Apple", 850, 22, 128);
    System.out.println(iPhone.getSmartphoneInfo());

    //sottoclase televisore
    Televisore samsung = new Televisore("UltraSmartFireTV", "Samsung", 1300, 22, 55, true);
    System.out.println(samsung.getTeleInfo());
    Televisore philips = new Televisore("SimpleTV", "Philips", 450, 22, 55, false);
    System.out.println(philips.getTeleInfo());

    //sottoclasse cuffie
    Cuffie razer = new Cuffie("PhytonX3500", "Razer", 140, 22, "Verde/Nero", true);
    System.out.println(razer.getInfoCuffie());
    Cuffie logitech = new Cuffie("G750", "Logitech", 35, 22, "Bianco/Blu", false);
    System.out.println(logitech.getInfoCuffie());
 }
}
