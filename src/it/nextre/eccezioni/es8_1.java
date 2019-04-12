package it.nextre.eccezioni;

import it.nextre.utils.UserInput;

public class es8_1 {
    public static void main(String[] args) {
        int a = UserInput.leggiInteroV2("Inserisci il dividendo");
        try{
            int ris=a/0;
            System.out.println(ris);  //andrà sempre in eccezione al passo precedente
        }catch (ArithmeticException ex){
            System.out.println("Infinity");
        }

        System.out.println("Programma terminato correttamente");
    }//end main
}//end class


