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

    public static int leggiInteroV2(String mex) {
        System.out.println(mex);
        Scanner s = new Scanner(System.in);
        try {
            return Integer.parseInt(s.nextLine().trim());
        }catch (NumberFormatException e){
            System.out.println("Valore non valido");
        }
        return leggiInteroV2(mex);
    }


    public static int leggiInteroPositivoV2(String mex) {
        System.out.println(mex);
        Scanner s = new Scanner(System.in);
        try {
            int tmp = Integer.parseInt(s.nextLine().trim());
            if (tmp<0)throw new NumberFormatException();
            return tmp;
        }catch (NumberFormatException e){
            System.out.println("Valore non valido, inserire un numero positivo");
        }
        return leggiInteroPositivoV2(mex);
    }

    public static int leggiInteroPositivoV3(String mex) {
        //sfruttare leggiInteroV2()
        try {
            int tmp = leggiInteroV2(mex);
            if (tmp<0)throw new NumberFormatException();
            return tmp;
        }catch (NumberFormatException e){
            System.out.println("Valore non valido, inserire un numero positivo");
        }
        return leggiInteroPositivoV3(mex);
    }

}//end class
