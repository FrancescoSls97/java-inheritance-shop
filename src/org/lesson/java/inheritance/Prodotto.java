package org.lesson.java.inheritance;

// superclasse prodotto
public class Prodotto {

    //attributi di classe
    protected int codice;
    protected String nome;
    protected String marca;
    protected double prezzo;
    protected int iva;

    //costruttore
    public Prodotto (int codice, String nome, String marca, double prezzo, int iva){
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

   

}
