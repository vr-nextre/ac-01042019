package it.nextre.utils;

import java.util.Scanner;

public class UserInput {
    public static int leggiInteroPositivo(String mex) {
        System.out.println(mex);
        Scanner s = new Scanner(System.in);
        String tmp = s.nextLine();
        String accettati = "0123456789";
        for (char c : tmp.toCharArray()){
            //soluzione top
            /*
            if (!Character.isDigit(c)){
                //errore
            }
            */
            //controllo custom
            if (accettati.indexOf(c)<0){
                //errore
                System.out.println("Valore non valido");
                return leggiInteroPositivo(mex);
            }
        }
        //se tutto è andato bene provo a convertire la stringa in intero
        return Integer.parseInt(tmp);
    }

    public static int leggiIntero(String mex) {
        System.out.println(mex);
        Scanner s = new Scanner(System.in);
        String tmp = s.nextLine();
        String accettati = "0123456789";
        boolean hoSegno=false;
        for (int i = 0; i<tmp.length();i++){
            char c = tmp.charAt(i);
            if(i==0 && (c=='+'||c=='-')){
                hoSegno=true;
                continue;
            }
            //soluzione top
            /*
            if (!Character.isDigit(c)){
                //errore
            }
            */
            //controllo custom
            if (accettati.indexOf(c)<0){
                //errore
                System.out.println("Valore non valido");
                return leggiIntero(mex);
            }
        }
        //se ho il segno devo avere almeno un numero dopo di esso
        if(hoSegno&&tmp.length()>1) {
            //se tutto è andato bene provo a convertire la stringa in intero
            return Integer.parseInt(tmp);
        } else if(!hoSegno) {
            //se tutto è andato bene provo a convertire la stringa in intero
            return Integer.parseInt(tmp);
        }else{
            System.out.println("Valore non valido");
            return leggiIntero(mex);
        }
    }
}//end class
