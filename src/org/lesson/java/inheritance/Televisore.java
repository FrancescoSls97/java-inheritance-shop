package org.lesson.java.inheritance;

public class Televisore extends Prodotto {
    // attributi specifici di classe
    protected int pollici;
    protected boolean smart;

    public Televisore(String nome, String marca, double prezzo, int iva, int pollici, boolean smart) {
        super(nome, marca, prezzo, iva);
        this.pollici = pollici;
        this.smart = smart;

    }

    // getter e setter pollici

    public int getPollici() {
        return this.pollici;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    // getter e setter smart
    public boolean getSmart() {
        return this.smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    //metodo per dire se la tv sia Smart
    public String getSmartText() {
    return this.smart ? "Si" : "No";
}



    // metodo info televisore
    @Override
    public String toString() {
        return "TV: " + super.toString() + " " + getPollici() + "pollici " + "SmartTV:" + getSmartText();
    }
}
