package it.nextre.enumerazione;

import java.io.Serializable;

//viene trasformata dal compilatore in una classe che estende java.lang.Enum
//non può essere estesa o estendere altre enumerazioni (final)
//può implementare comportamenti


public enum Ruolo {
    ADMIN(100), SUBSCRIBER(50), PUBLISHER(30), USER(5), GUEST(0){
        @Override
        public String toString2() {
            return "non loggato!";
        }
        public void metodoA(){}
    };

    //private Ruolo(){};
    private  Ruolo(int peso){
        this.peso=peso;
    }
    private int peso;

    public String toString2(){
        return ""+this.ordinal()+" ("+this.peso+")";
    }

    public void metodoA(){
        //metodo ponte per le classi interne
    };

}
