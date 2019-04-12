package it.nextre.eccezioni;

import it.nextre.Persona;
import it.nextre.utils.UserInput;

public class es8_3 {
    public static void main(String[] args) {

        try {
            dividi();
        } catch (InvalidDivisoreException e) {
            System.out.println("Eccezione catturata fuori dal metodo che l'ha generata");
            System.out.println(e.getMessage());
        }

        System.out.println("Programma terminato correttamente");
    }//end main

    private static void dividi() throws InvalidDivisoreException {
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
            throw ex;  //rilancio la stesso, o una nuova
            //throw new InvalidDivisoreException(ex.getMessage());
        }
    }
}//end class


