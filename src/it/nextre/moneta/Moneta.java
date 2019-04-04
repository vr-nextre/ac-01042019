package it.nextre.moneta;

import java.util.Random;

public class Moneta {

    //variabili
    public boolean testa;   //rappresenta lo stato della moneta

    //costruttori
    public Moneta(){}
    public Moneta(boolean stato){
        this.setStato(stato);
    }

    //metodi
    public boolean getStato(){
        return this.testa;
    }

    public void setStato(boolean stato){
        this.testa=stato;
    }

    public boolean lancia(){
        //generare automaticamente un booleano randomico
        //testa=Math.random()<0.5;
        Random r = new Random();
        this.testa=r.nextBoolean();
        return this.testa;
    }

    @Override
    public String toString() {
        return this.getStato()?"testa":"croce";
    }
}//end class
