package it.nextre.eccezioni;

import it.nextre.utils.UserInput;

public class es8_2 {
    public static void main(String[] args) {
        int a = UserInput.leggiInteroV2("Inserisci il dividendo");
        int b = UserInput.leggiInteroV2("Inserisci il divisore");
        try{
            if(b==0) throw new InvalidDivisoreException("Il divisore non può essere 0!");
            double ris= 1.0*a/b;
            System.out.println(ris);
        }catch (ArithmeticException ex){
            System.out.println("Infinity");
        }catch(InvalidDivisoreException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Programma terminato correttamente");
    }//end main
}//end class


