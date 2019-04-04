package it.nextre.gioco1;

public class AppGioco1 {

    public static final int N_GIOCATORI=5;

    public static void main(String[] args) {

        Giocatore[] players = new Giocatore[N_GIOCATORI];
        for (int i = 0; i < N_GIOCATORI; i++) {
            players[i]=new Giocatore("Tiratore " + (i+1) );
            boolean colpito = false;
            while(!colpito){
                colpito=players[i].spara();
            }
        }//end for



        Giocatore best=players[0];
        for(Giocatore tmp:players){
            if(best.getColpi()>tmp.getColpi()){
                best=tmp;
            }
            System.out.println(tmp);
        }

        //scopro quanti hanno fatto il punteggio più basso
        int vincitori=0;
        for(Giocatore tmp:players){
            if (tmp.getColpi()==best.getColpi())
                vincitori++;
        }
        System.out.println("\nVince: ");
        Giocatore[] vincenti = new Giocatore[vincitori];
        for(int i =0,k=0;i<players.length;i++){
            if (players[i].getColpi()==best.getColpi()) {
                vincenti[k] = players[i];
                System.out.println(vincenti[k]);
                k++;
            }
        }


    }//end main
}//end class
