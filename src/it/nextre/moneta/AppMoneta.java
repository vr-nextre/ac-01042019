package it.nextre.moneta;

import it.nextre.utils.UserInput;

public class AppMoneta {

    //variabile num lanci
    public static int N_LANCI = 30000;

    public static void main(String[] args) {

        if (args.length>0 && args[0]!=null ){
            N_LANCI=Integer.parseInt(args[0]);
        }else{
            //chiediamo all'utente quanti lanci vuole fare
            N_LANCI = UserInput.leggiInteroPositivo("Quanti lanci vuoi simulare?");
        }

        //avere una moneta
        Moneta m = new Moneta();

        //variabile conteggio testa
        int testa = 0;

        //fare un ciclo che per il numero di lanci lancia la moneta
        for (int lanci = 0; lanci < N_LANCI; lanci++) {
            //lancio la moneta e controllo il risultato
            if (m.lancia()) {
                testa++;
            }
            //System.out.println("DEBUG: " + m);
        }

        //dopo il ciclo dovrò calcolare le percentuali e stampare il risultato
        if(N_LANCI>0) {
            //testa:N_LANCI=x:100%  =>  (100*testa)/N_LANCI
            double percTesta = (100.0 * testa) / N_LANCI;
            double percCroce = 100 - percTesta;

            System.out.println("Numero di lanci: " + N_LANCI);
            //System.out.println("\tTESTA: "+percTesta+"%");
            //System.out.println("\tCROCE: "+percCroce+"%");
            System.out.printf("\tTESTA %.3f%s%n", percTesta, "%");
            System.out.printf("\tCROCE %.3f%%", percCroce);
        }else{
            System.err.println("NUMERO LANCI NON VALIDO");
        }


    }//end main

}//end class
