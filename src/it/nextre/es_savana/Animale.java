package it.nextre.es_savana;

/*
* Per noi tutti gli animali possono correre, ma ognuno corre a modo suo
* */

import java.util.Random;

public abstract class Animale implements Corridore {
    private String razza;
    protected double runSpeed;  //Km/h

    protected Random r;
    private double distanzaPercorsa;
    public abstract double corri();

    protected Animale(){
        r=new Random();
        razza="undefined";
        distanzaPercorsa=0;
    }

    public String getRazza() {
        return razza;
    }

    protected void setRazza(String razza) {
        this.razza = razza;
    }

    public double getDistanzaPercorsa() {
        return distanzaPercorsa;
    }

    public void addDistanzaPercorsa(double distanzaPercorsa) {
        //anche se retrocedo percorro una distanza
        this.distanzaPercorsa += Math.abs(distanzaPercorsa);
    }
}//end class
