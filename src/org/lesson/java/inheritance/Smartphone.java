package org.lesson.java.inheritance;

import java.math.BigDecimal;


public class Smartphone extends Prodotto{
    // attributi classe specifici
    protected int imei;
    protected int grandezzaMemoria;

    //costruttore 
    public Smartphone(String nome, String marca, BigDecimal prezzo, int grandezzaMemoria, int imei){
        super(nome, marca, prezzo);
        this.imei = imei;
        this.grandezzaMemoria = grandezzaMemoria;

        }

        //getter e setter codice IMEI
        public int getCodiceIMEI(){
            return this.imei;
        }

        public void setCodiceIMEI(int imei){
            this.imei = imei;
        }

        //getter e setter grandezza nemoria

        public int getGrandezzaMemoria(){
            return this.grandezzaMemoria;
        }

        public void setGrandezzaMemoria(int grandezzaMemoria){
            this.grandezzaMemoria = grandezzaMemoria;
        }

        //metodo calcolo sconto
        @Override
        public BigDecimal getSconto(){
             if (grandezzaMemoria < 32) {
                return
                getPrezzo().subtract(getPrezzo().multiply(new BigDecimal(0.05)));
            } else {
                return getSconto();
            }
        }
        // metodo smartphone info
        @Override
        public String toString(){
            return "Smartphone:" + super.toString() + "\n" + grandezzaMemoria + "GB" + "\n" + "CodiceIMEI-" + imei;
        }
    }



