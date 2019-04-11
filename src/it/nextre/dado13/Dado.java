package it.nextre.dado13;

import java.util.Random;

public class Dado {
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
