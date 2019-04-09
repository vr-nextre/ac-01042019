package it.nextre.mappa;

import it.nextre.lista.ListaInteger;

/**
 * Modellare una struttura dati in grado di memorizzare dati sui prodotti
 * K : String , V : String
 * */

public class Mappa {

    private String[][] mem;

    public Mappa(){
        this.mem = new String[0][2];
    }

    public void add(String K, String V){
        //controllo se la K esiste già in memoria
        //in caso positivo, aggiorno il valore
        //in caso negativo dovrò aggiungere una riga
        for(String[] tmp : this.mem){
            if (tmp[0].equals(K)){
                //esiste!
                tmp[1] = V;
                return;
            }
        }
        //se non entra nel caso esistente non si interrompe, quindi non esiste e devo aggiungerla
        String[][] tmp = new String[this.mem.length+1][2];
        for(int i = 0; i< this.mem.length; i++){
            //tmp[i]=this.mem[i];
            //tmp[i]=new String[2];
            tmp[i][0]=this.mem[i][0];
            tmp[i][1]=this.mem[i][1];
        }
        tmp[this.mem.length][0]=K;
        tmp[this.mem.length][1]=V;
        this.mem=tmp;
    }



    public boolean contains(String K) {
        for (String[] tmp : this.mem) {
            if (tmp[0].equals(K)) {
                //esiste!
                return true;
            }
        }
        return false;
    }



    public String[] getKeys() {
        String[] keys = new String[this.size()];
        for (int i = 0; i < this.size() ; i++) {
            keys[i]=this.mem[i][0];
        }//end for
        return keys;
    }



    public String getValue(String K) {
        for (String[] tmp : this.mem) {
            if (tmp[0].equals(K)) {
                //esiste!
                return tmp[1];
            }
        }
        return null;
    }


    public void remove(String K){
        if(K != null && this.contains(K)){
            String[][] tmp = new String[this.mem.length - 1][2];
            int pos = 0;
            for (int i = 0; i<this.mem.length; i++ ){
                if(!this.mem[i][0].equals(K)){
                    tmp[i-pos][0]=this.mem[i][0];
                    tmp[i-pos][1]=this.mem[i][1];
                }else{
                    pos++;
                }
            }
            this.mem=tmp;
        }
    }


    public int size(){
        return this.mem.length;
    }


    //todo fixare tutti i metodi per non accettare valori nulli


    @Override
    public String toString() {
        String tmp="";
        for(String[] x:this.mem){
            tmp+="[K="+String.format("%-15s", "'"+x[0]+"'")+", V="+String.format("%-15s", "'"+x[1]+"'")+"]\n";
        }
        return tmp.length()==0?"Empty map":tmp.trim();
    }
}//end class
