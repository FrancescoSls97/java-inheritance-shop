package org.lesson.java.inheritance;

public class Cuffie extends Prodotto {

    // attributi di classe
    protected String colore;
    protected boolean wireless;

    public Cuffie(String nome, String marca, double prezzo, int iva, String colore, boolean wireless) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    // getter e setter colore

    public String getColore() {
        return this.colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    // getter e setter wireless
    public boolean getWireless() {
        return this.wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    // metodo per dire se le cuffie sono wireless o no
    public String getWirelessText() {
        return this.wireless ? "Wireless" : "Cablato";
    }

    // metodo info cuffie
    @Override
    public String toString() {
        return "Cuffie: " + super.toString() + " Colore:" + getColore() + " Modello:" + getWirelessText();
    }
}
