package it.nextre.banca;

import it.nextre.dpSingleton.CreditCardNumberGeneratorSingleton;

public class AppBanca {
    public static void main(String[] args) {

        //Singleton
        CreditCardNumberGeneratorSingleton gen = CreditCardNumberGeneratorSingleton.getInstance();

        //Polimorfismo
        Carta c1 = new Visa(gen.getNumber(),gen.getCVV(),"04/22","Mario Rossi");

        //Invocazione virtuale a metodo (toString)
        System.out.println(c1);


    }//end main
}//end class
