package it.nextre.rilevazioni;

import java.util.Arrays;

public class Misurazione {

    private Double[] mem;
    private int pos=0;

    protected String precisione;

    //inizializzatore di istanza (non static)
    {
        System.out.println("Sto preparando un oggetto misurazione");
    }

    //inizializzatore di classe / statico
    static {
        System.out.println("Carico Misurazione");
        System.out.println("Caricamento completato");
    }



    public Misurazione(int numeroDiMisurazioni){
        mem = new Double[numeroDiMisurazioni];
    }

    public Double[] getValori(){
        return mem;
    }

    public void addValore(double valore){
        if (pos<mem.length){
            mem[pos]=valore;
            pos++; //per il prox valore
            return;
        }
        System.out.println("Memoria piena, valore "+valore+ " non salvato");
    }

    public void stampaValori(){
        for(int i = 0; i<mem.length; i++)
            System.out.println("["+i+"] "+mem[i]);
    }


    public double getMedia(){
        double somma=0;
        int cont=0;
        for(int i = 0; i<mem.length; i++)
            if(mem[i]!=null){somma+=mem[i]; cont++;}
        return somma/cont;
    }

    @Override
    public String toString() {
        return Arrays.toString(mem);
    }
}//end class
