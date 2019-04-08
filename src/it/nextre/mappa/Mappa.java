package it.nextre.mappa;

import it.nextre.lista.ListaInteger;

/**
 * Modellare una struttura dati in grado di memorizzare dati sui prodotti
 * K : String , V : String
 * */

public class Mappa {

    private String[][] mem;

    public Mappa(){
        mem = new String[0][2];
    }

    public void add(String K, String V){
        //controllo se la K esiste già in memoria
        //in caso positivo, aggiorno il valore
        //in caso negativo dovrò aggiungere una riga
        for(String[] tmp : mem){
            if (tmp[0].equals(K)){
                //esiste!
                tmp[1] = V;
                return;
            }
        }
        //se non entra nel caso esistente non si interrompe, quindi non esiste e devo aggiungerla
        String[][] tmp = new String[mem.length+1][2];
        for(int i = 0; i< mem.length; i++){
            //tmp[i]=mem[i];
            //tmp[i]=new String[2];
            tmp[i][0]=mem[i][0];
            tmp[i][1]=mem[i][1];
        }
        tmp[mem.length][0]=K;
        tmp[mem.length][1]=V;
        this.mem=tmp;
    }

    @Override
    public String toString() {
        String tmp="";
        for(String[] x:mem){
            tmp+="[K="+String.format("%-15s", "'"+x[0]+"'")+", V="+String.format("%-15s", "'"+x[1]+"'")+"]\n";
        }
        return tmp;
    }
}//end class
