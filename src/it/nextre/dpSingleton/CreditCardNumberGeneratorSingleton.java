package it.nextre.dpSingleton;

import it.nextre.mappa.Mappa;

public class CreditCardNumberGeneratorSingleton {

    private static CreditCardNumberGeneratorSingleton instance;
    private Mappa generated;


    private CreditCardNumberGeneratorSingleton(){
        generated = new Mappa();
    }

    public synchronized static CreditCardNumberGeneratorSingleton getInstance(){
        if (instance==null)
            instance=new CreditCardNumberGeneratorSingleton();
        return instance;
    }

    public String getNumber(){
        String tmp="";
        for (int i = 0; i < 16; i++) { //todo rimettere a 16
            if (i>0 && i%4==0)tmp+=" ";
            tmp+=(int)(Math.random()*10);
        }//end for
        //se esiste rifaccio una nuova invocazione per generarne una nuova randomicamente
        if(generated.contains(tmp)){
            System.out.println("Trovata doppia la carta n: " + tmp);
            return getNumber();
        }
        //se non esiste, salvo questa carta e la ritorno
        generated.add(tmp,"undefined");
        return tmp;
    }


    public String getCVV(){
        String tmp="";
        for (int i = 0; i < 3; i++) {
            tmp+=(int)(Math.random()*10);
        }
        return tmp;
    }

}//end class
