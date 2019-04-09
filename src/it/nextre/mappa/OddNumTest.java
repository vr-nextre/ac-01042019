package it.nextre.mappa;

import java.util.Arrays;

public class OddNumTest {
    public static void main(String[] args) {

        //4 array di test per verificare se la mia implementazione sarà valida
        int[] a1 = {1,5,3,3,6,7,2,5,1}; //odd 6,7,2
        int[] a2 = {};
        int[] a3 = {3,4,5,3,4,5}; //odd
        int[] a4 = {1,2,3,4,5,6,7,8,9,0};

        ContaNumDispari c = new ContaNumDispari();

        int[] r1 = c.extractConteggioDispari(a1);
        //assert r1==new int[]{6,7,2}; //ERRORE indirizzi di memoria e non contenuto effettivo
        assert Arrays.equals(r1,new int[]{6,7,2}) : "Errore caso 1";

        int[] r2 = c.extractConteggioDispari(a2);
        assert Arrays.equals(r2,new int[]{}) : "Errore caso 2";

        int[] r3 = c.extractConteggioDispari(a3);
        assert Arrays.equals(r3,new int[]{}) : "Errore caso 3";

        int[] r4 = c.extractConteggioDispari(a4);
        assert r4.length==10 : "Errore caso 4";
        assert Arrays.equals(r4, new int[]{1,2,3,4,5,6,7,8,9,0}) : "Errore caso 4";

        System.out.println("TEST COMPLETATO CON SUCCESSO");

    }//end main
}//end class
