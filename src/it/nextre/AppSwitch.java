package it.nextre;

public class AppSwitch {
    public static void main(String[] args) {

        int x = 0;
        switch (x){
            default: {
                System.out.println("valore non valido");
                break;
            }
            case 1:
            case 2:
            case 3:{
                System.out.println("Inizia la partita");
                break;
            }
            case 4:{
                System.out.println("partita in corso");
                break;
            }
            case 7:{
                System.out.println("partita finita");
                break;
            }
            case 8:{
                System.out.println("Stampa classifica");
                break;
            }
        }



        char c = 'A';
        switch (c){
            case 'A': {
                System.out.println("Carattere rilevato: "+c); break;}
            case 'B': {
                System.out.println("Carattere rilevato: "+c); break;}
            case 'C': {
                System.out.println("Carattere rilevato: "+c); break;}
            case 'D': {
                System.out.println("Carattere rilevato: "+c); break;}
            case 'E': {
                System.out.println("Carattere rilevato: "+c); break;}
            case 'F': {
                System.out.println("Carattere rilevato: "+c); break;}
            case 71: {
                System.out.println("Carattere rilevato: "+c); break;}
        }














    }//end main
}//end class
