package org.lesson.java.inheritance;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        Prodotto[] prodotti = new Prodotto[2];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < prodotti.length; i++) {
            // raccolta dati
            System.out.println("Nome del prodotto: ");
            String nomeProdotto = input.nextLine();

            System.out.println("Marchio del prodotto: ");
            String marchioProdotto = input.nextLine();

            System.out.println("Prezzo: ");
            int prezzo = Integer.parseInt(input.nextLine());

            System.out.println("Che tipo di prodotto è? tv, smartphone, cuffie");
            String tipoProdotto = input.nextLine();
            System.out.println(tipoProdotto);

            // verifica casi
            switch (tipoProdotto.toLowerCase()) {
                // caso tv
                case "tv":
                    System.out.println("Grandezza TV in Pollici: ");
                    int polliciTv = Integer.parseInt(input.nextLine());

                    System.out.println("La TV è Smart? (TRUE o FALSE)");
                    boolean smartTv = Boolean.parseBoolean(input.nextLine());

                    Televisore tv = new Televisore(nomeProdotto, marchioProdotto, new BigDecimal(prezzo),
                            polliciTv, smartTv);
                    prodotti[i] = tv;
                    break;
                // caso cuffie
                case "cuffie":
                    System.out.println("Colore: ");
                    String colore = input.nextLine();

                    System.out.println("Sono wireless? (TRUE o FALSE)");
                    boolean wireless = Boolean.parseBoolean(input.nextLine());

                    Cuffie cuffie = new Cuffie(nomeProdotto, marchioProdotto, new BigDecimal(prezzo), colore,
                            wireless);
                    prodotti[i] = cuffie;
                    break;
                // caso smartphone
                case "smartphone":
                    System.out.println("Codice IMEI: ");
                    int imei = Integer.parseInt(input.nextLine());

                    System.out.println("Memoria in GB: ");
                    int gigaMemoria = Integer.parseInt(input.nextLine());

                    Smartphone phone = new Smartphone(nomeProdotto, marchioProdotto, new BigDecimal(prezzo),
                            gigaMemoria, imei);
                    prodotti[i] = phone;
                    break;
            }

            System.out.println("-------------");

        }
        input.close();

        System.out.println("Il tuo carrello:");

        for (int i = 0; i < prodotti.length; i++) {
            System.out.println(prodotti[i]);
            System.out.println("-------------");
        }
    }
}
