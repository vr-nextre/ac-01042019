package it.nextre.mappa;

import it.nextre.lista.ListaInteger;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class ContaNumDispari {

    //tornare un array di interi che contenga soltanto gli interi conteggiati un numero dispari di volte nell'array passato come argomento
    public int[] extractConteggioDispari(int[] arr) {
        //se arr è vuoto nessuno corrisponderà
        if (arr.length==0)return new int[0];

        //altrimenti ciclo tutto l'arr
        Mappa m = new Mappa();
        for (int i = 0; i<arr.length; i++){
            //se la mappa non contiene questo valore come chiave la aggiungo e la conto una volta, altrimenti se è presente aggiorno il contatore (value)
            if(m.contains(""+arr[i])){
                //aggiorno il contatore
                String tmp = m.getValue(""+arr[i]);
                m.add(""+arr[i], ""+(Integer.parseInt(tmp)+1)  );
                //m.add(""+arr[i], tmp+"*");
            }else{
                //inserirla nella mappa con conteggio a 1
                m.add(""+arr[i],"1"); //valutare miglioria
                //m.add(""+arr[i],"*");// concatenamento n caratteri
            }
        }

        //System.out.println(m);


        //v1 doppia verifica, prima scopro quanto è grande l'array in uscita e dopo lo riempio
        //v2 al primo ciclo scopro il valore da aggiungere in una lista dinamica

        String[] keys = m.getKeys();
        //qta e pos per v1
        int qta=0;
        //per v2
        ListaInteger l = new ListaInteger();

        //v1 scopro la grandezza in uscita
        //v2 trovo i candidati e li aggiungo all'array in uscita
        for(String k : keys){
            //vedo se il valore è dispari
            if (Integer.parseInt(m.getValue(k))%2==1  ){
                //System.out.println(k + " è conteggiato n dispari di volte");  //debug
                qta++;  //v1
                l.add(Integer.parseInt(k)); //v2
            }
        }
        /*
        //v1 riempio
        int[] out = new int[qta];
        int pos=0;
        for(String k : keys){
            //vedo se il valore è dispari
            if (Integer.parseInt(m.getValue(k))%2==1  ){
                out[pos]=Integer.parseInt(k);
                pos++;
            }
        }

         */

        //v2 conversione di Integer[] in int[]
        int[] out = new int[l.size()];
        for (int i = 0; i <l.size(); i++) {
            out[i]=l.get(i);
        }//end for


        //ritorno i valori
        return out;
    }
}//end class
