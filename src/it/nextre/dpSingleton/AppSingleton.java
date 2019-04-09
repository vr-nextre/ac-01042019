package it.nextre.dpSingleton;

public class AppSingleton {
    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s==s1);
        System.out.println(s1==s2);


        CreditCardNumberGeneratorSingleton banca =  CreditCardNumberGeneratorSingleton.getInstance();

        System.out.println(banca.getNumber());
        System.out.println(banca.getNumber());
        System.out.println(banca.getNumber());
        System.out.println(banca.getNumber());
        System.out.println(banca.getNumber());
        System.out.println(banca.getNumber());
        System.out.println(banca.getNumber());
        System.out.println(banca.getNumber());
        System.out.println(banca.getNumber());
        System.out.println(banca.getNumber());
        System.out.println(banca.getNumber());

    }//end main
}//end class
