package org.lesson.java.inheritance;

import java.util.Random;

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
        Random random = new Random(99999);
        this.codice = random.nextInt();
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

   // getter e setter codice

   public int getCodice(){
    return this.codice;
   }

   private void setCodice(int codice){
    this.codice = codice;
   }

   // getter e setter nome

   public String getNome(){
    return this.nome;
   }

   public void setNome(String nome){
    this.nome = nome;
   }

   // getter e setter marca

      public String getMarca(){
    return this.marca;
   }

   public void setMarca(String marca){
    this.marca = marca;
   }

   // getter e setter prezzo

      public double getPrezzo(){
    return this.prezzo;
   }

   public void setPrezzo(double prezzo){
    this.prezzo = prezzo;
   }

   // getter e setter iva
      public int getIva(){
    return this.iva;
   }

   public void setIva(int iva){
    this.iva = iva;
   }


}
