package it.nextre.enumerazione;

import java.util.Random;

public class AppCancello {


    private static boolean debug = false;

    static int stato; //unità percentuali
    static final int passo = 1; //singola unità di spostamento

    public static void main(String[] args) throws InterruptedException {

        Cancello c = getStatoCancelloRandom();
        stato=c.getValore();
        System.out.println("Il cancello è: " + c);
        c.stampaStato();

        //estrazione posizione impostata dall'utente
        Cancello pos_scelta = getStatoCancelloRandom();
        System.out.println("Utente imposta il cancello a: " + pos_scelta);
        pos_scelta.stampaStato();

        Thread.sleep(1500);

        System.out.println("\n\nMovimento in corso");

        while(stato!=pos_scelta.getValore()){
            //capire la direzione di spostamento
            if (stato < pos_scelta.getValore() ){
                //aprire
                apri();
            }else{
                //chiudere
                chiudi();
            }
            if(debug) {
                System.out.println("cancello a: "+stato + " , pos_scelta: "+pos_scelta.getValore());
            }

            if(stato%5==0) {
                stampaStato();
            }
            Thread.sleep(80);
        }

        System.out.println("Movimento completato");

    }//end main

    private static void stampaStato() {
        String out="|";
        int conteggio=0;
        while(conteggio<stato){
            if(conteggio%5==0){
                out+="_";
            }
            conteggio++;
        }
        while(conteggio<100){
            if(conteggio%5==0){
                out+="#";
            }
            conteggio++;
        }
        out+="|";
        System.out.println(out);
    }

    private static void apri() {
        if (stato < 100){
            stato++;
        }else{
            System.out.println("Apertura non concessa");
        }
    }

    private static void chiudi() {
        if (stato > 0 ){
            stato--;
        }else{
            System.out.println("Chiusura non concessa");
        }
    }

    private static Cancello getStatoCancelloRandom() {
        Random r = new Random();
        Cancello[] stati = Cancello.values();
        return stati[r.nextInt(stati.length)];
    }


}//end class
