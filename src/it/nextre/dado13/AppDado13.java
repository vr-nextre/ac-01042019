package it.nextre.dado13;

import it.nextre.interfacce.Lanciabile;

public class AppDado13 {


    public static final boolean DEBUG=false;

    public double CREDIT = 10.0; //credito iniziale
    public double BET = 1.0;
    public double WINS = 10.0;  //vinco n volte il bet



    public static void main(String[] args) {

        AppDado13 game = new AppDado13();

        int manche = 0; //conteggio il numero di partite
        double maxCredit=game.CREDIT;
        int mancheOk = 0; //conteggio vittorie
        //Dado d1 = new Dado();
//        Dado d2 = new Dado();
//        Dado d3 = new Dado();

        Lanciabile d1 = new Dado();

        Lanciabile dl = ()->{return 5;};
        dl.lancia();



        while(game.CREDIT >= game.BET) {
            game.CREDIT-=game.BET;
            manche++;
//            int lancio=d1.lancia()+d2.lancia()+d3.lancia();
            int lancio=d1.lancia()+d1.lancia()+d1.lancia();
            if(lancio == 13){
                //vinco
                if(DEBUG)
                System.out.println("Ho Fatto 13! YEAAAHHHHH!");
                game.CREDIT+=(game.BET*game.WINS);
                mancheOk++;
            }else{
                if(DEBUG)
                System.out.println("ho perso con "+lancio);
            }
            //aggiorno la traccia del massimo valore accumulato
            if(game.CREDIT>maxCredit){
                maxCredit=game.CREDIT;
            }
        }//end while
        System.out.println("Hai giocato " + manche + " manche, hai fatto 13: "+mancheOk+" volte, potevi vincere al massimo " + maxCredit+"€");


    }//end main
}//end class
