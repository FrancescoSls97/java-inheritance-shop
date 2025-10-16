package org.lesson.java.inheritance;

import java.util.Random;

public class Smarthphone extends Prodotto{
    // attributi classe specifici
    protected int codiceIMEI;
    protected int grandezzaMemoria;

    //costruttore 
    public Smarthphone(String nome, String marca, double prezzo, int iva, int grandezzaMemoria){
        super(nome, marca, prezzo, iva);
        Random random = new Random();
        this.codiceIMEI = random.nextInt(99999);
        this.grandezzaMemoria = grandezzaMemoria;

        }

        //getter e setter codice IMEI
        public int getCodiceIMEI(){
            return this.codiceIMEI;
        }

        public void setCodiceIMEI(int codiceIMEI){
            this.codiceIMEI = codiceIMEI;
        }

        //getter e setter grandezza nemoria

        public int getGrandezzaMemoria(){
            return this.grandezzaMemoria;
        }

        public void setGrandezzaMemoria(int grandezzaMemoria){
            this.grandezzaMemoria = grandezzaMemoria;
        }
    
        // metodo smartphone unfo
        public String getSmartphoneInfo(){
            return "Smartphone:" + getInfo() + " " + grandezzaMemoria + "GB" + " " + "CodiceIMEI-" + codiceIMEI;
        }
    }



