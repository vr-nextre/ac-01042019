package it.nextre.anonime;

import it.nextre.es_savana.Animale;
import it.nextre.es_savana.Corridore;

public class AppAnonime {


    private String codice="ABCDE";

    public static void main(String[] args) {
        AppAnonime app = new AppAnonime();
        app.anonim();
    }//end main


    public void anonim(){

        String codice = "codice metodo";

        Animale criceto = new Animale() {
            String codice="adasdas";
            @Override
            public double corri() {
                saluta();
                System.out.println(this.codice);
                return 6; //m/s
            }

            public void saluta() {
            }

            public void m1() {
            }
        };
        Corridore anziano = () -> {
            System.out.println(this.codice);
            return 0.52;
        };

        criceto.corri();
        anziano.corri();


    }



}//end class
