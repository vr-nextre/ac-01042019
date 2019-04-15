package it.nextre.interfacce;



/*
* INTERFACCIA FUNZIONALE HA UN SOLO METODO ASTRATTO!
* di default posso averna quanti ne voglio, ma uno e solo uno dovrà essere astratto!
* */
@FunctionalInterface
public interface Lanciabile {

    //JAVA 8 tutto è public

    //public final int num=4;  //COSTANTI

    //METODI DI DEFAULT
    public default int rilancia(){ return lancia();}

    int lancia();
    //int lancia2(); //NON possibile in un'interfaccia funzionale

    //metodi privati solo da java9 in poi
    //private int java=9;

}
