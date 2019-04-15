package it.nextre.dado13;

import it.nextre.interfacce.Lanciabile;

import java.util.Random;

public class Dado implements Lanciabile {
    private Random r;
    private int N_FACCE;
    public Dado(){
        this(6);
    }
    public Dado(int facce){
        r=new Random();
        this.N_FACCE = facce;
    }
    public int lancia(){
        return 1+r.nextInt(N_FACCE);
    }
}//end class
