package org.lesson.java.inheritance;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

// superclasse prodotto
public class Prodotto {

   // attributi di classe
   private int codiceProdotto;
   private String nome;
   private String marca;
   private BigDecimal prezzo;
   private BigDecimal iva;

   // costruttore
   public Prodotto(String nome, String marca, BigDecimal prezzo) {
      Random random = new Random();
      this.codiceProdotto = random.nextInt(99999);
      this.nome = nome;
      this.marca = marca;
      this.prezzo = prezzo;
      this.iva = new BigDecimal(0.22);
   }

   // getter e setter codice

   public int getCodiceProdotto() {
      return this.codiceProdotto;
   }

   // getter e setter nome

   public String getNome() {
      return this.nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   // getter e setter marca

   public String getMarca() {
      return this.marca;
   }

   public void setMarca(String marca) {
      this.marca = marca;
   }

   // getter e setter prezzo

   public BigDecimal getPrezzo() {
      return this.prezzo;
   }

   public void setPrezzo(BigDecimal prezzo) {
      this.prezzo = prezzo;
   }

   // getter iva
   public BigDecimal getIva() {
      return this.iva;
   }

   // metodo calcolo prezzo
   public BigDecimal getPrezzoTotale() {
      if (prezzo != null && iva != null ){
         return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
         }
      return null;
   }

   //metodo calcolo sconto
   public BigDecimal getSconto(){
      //sconto minimo del 2%
      return prezzo.subtract(prezzo.multiply(new BigDecimal("0.02")));

   }

   // metodo info prodotto
   @Override
   public String toString() {
      return "Codice Prodotto-"
            + codiceProdotto + " " + nome + "\n" + marca + "\n" + getPrezzoTotale() + "$";
   }
}
