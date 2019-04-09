package it.nextre.banca;

import it.nextre.dpSingleton.CreditCardNumberGeneratorSingleton;

public class AppBanca {
    public static void main(String[] args) {

        //Singleton
        CreditCardNumberGeneratorSingleton gen = CreditCardNumberGeneratorSingleton.getInstance();

        //Polimorfismo
        Carta c1 = new Visa(gen.getNumber(),gen.getCVV(),"04/22","Mario Rossi");
        Carta c2 = new Mastercard(gen.getNumber(),gen.getCVV(),"08/23","Marco Conti");

        //Invocazione virtuale a metodo (toString)
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("----------------");
        System.out.println(c1.getCvv()); //la variabile non è soggetta a sovrascrittura (Override)
        System.out.println( ((Visa)c1).cvv);

        System.out.println(c1);
        System.out.println( ((Visa)c1) );




    }//end main
}//end class
