package it.nextre.lista;

public class ListaInteger {

    Integer[] mem;

    public ListaInteger(){
        this.mem=new Integer[0];
    }

    public Integer[] getAll(){
        return this.mem;
    }

    public Integer get(int idx){
        if(idx>=0 && idx<this.mem.length){
            return this.mem[idx];
        }
        //todo aggiungere exception
        return null;
    }

    public int size(){
        return this.mem.length;
    }

    public void add(int value){
        Integer[] tmp = new Integer[this.mem.length + 1];
        for (int i = 0; i < this.mem.length; i++) {
            tmp[i]=this.mem[i];
        }//end for
        tmp[this.mem.length]=value;
        this.mem=tmp;
    }

    public void remove(int idx){
        Integer[] tmp = new Integer[this.mem.length - 1];
        for (int i = 0; i < this.mem.length; i++) {
            //se l'indice di scorrimento è alla posizione di quello che voglio rimuovere
            if(i==idx){continue;}
            if(i<idx){tmp[i]=this.mem[i];}
            if(i>idx){tmp[i-1]=this.mem[i];}
        }//end for
        this.mem=tmp;
    }
    public Integer getMinValue(){
        if (this.mem.length==0)return null;
        Integer tmp = this.mem[0];
        for (int i = 0; i < this.mem.length; i++) {
            if (tmp>this.mem[i])
                tmp=this.mem[i];
        }//end for
        return tmp;
    }

    public Integer getMaxValue(){
        if (this.mem.length==0)return null;
        Integer tmp = this.mem[0];
        for (int i = 0; i < this.mem.length; i++) {
            if (tmp<this.mem[i])
                tmp=this.mem[i];
        }//end for
        return tmp;
    }

    //ordina valori crescente/decrescente
    public void ordina(boolean ASC){
        Integer[] tmp = new Integer[this.mem.length];
        boolean trovato=true;
        order:while(trovato) {
            for (int i = 0; i < this.mem.length; i++) {
                if (i == 0) continue;
                if (ASC && this.mem[i-1]>this.mem[i]){
                    trovato=true;
                    int val = this.mem[i-1];
                    this.mem[i-1]=this.mem[i];
                    this.mem[i]=val;
                    continue order;
                }
                if (!ASC && this.mem[i-1]<this.mem[i]){
                    trovato=true;
                    int val = this.mem[i-1];
                    this.mem[i-1]=this.mem[i];
                    this.mem[i]=val;
                    continue order;
                }
            }//end for
            trovato=false;
        }
    }

    //conta occorrenze valore
    public int count(int value){
        int conteggio=0;
        for (int tmp: this.mem) {
            if (tmp==value)conteggio++;
        }//end for
        return conteggio;
    }

    //indexOf prima occorenza
    public int indexOf(int value){
        for (int i = 0; i < this.mem.length; i++) {
            if (this.mem[i]==value)return i;
        }//end for
        return -1;
    }

    //array in ordine inverso
    public void reverse(){
        Integer[] swap = new Integer[this.mem.length];
        for (int i = this.mem.length-1; i >=0 ; i--) {
            swap[this.mem.length-i-1]=this.mem[i];
        }//end for
        this.mem=swap;
    }

    //valori sotto la soglia(booleano con soglia o no)
    public Integer[] getAllValueBefore(int value, boolean WithThreshold){
        ListaInteger tmp = new ListaInteger();
        for (int i = 0; i < this.mem.length; i++) {
            if (WithThreshold && this.mem[i]<=value){tmp.add(this.mem[i]);}
            if (!WithThreshold && this.mem[i]<value){tmp.add(this.mem[i]);}
        }//end for
        tmp.ordina(true);
        return tmp.getAll();
    }

    //valori sopra la soglia(booleano con soglia o no)
    public Integer[] getAllValueAfter(int value, boolean WithThreshold){
        ListaInteger tmp = new ListaInteger();
        for (int i = 0; i < this.mem.length; i++) {
            if (WithThreshold && this.mem[i]>=value){tmp.add(this.mem[i]);}
            if (!WithThreshold && this.mem[i]>value){tmp.add(this.mem[i]);}
        }//end for
        tmp.ordina(true);
        return tmp.getAll();
    }

    //ListaInteger[0,5,7,8,14,1]
    @Override
    public String toString() {
        String out="ListaInteger[";
        for (int i = 0; i < this.mem.length; i++) {
            out+=this.mem[i];//+(i==this.mem.length-1?"":",");
            if(i!=this.mem.length-1){out+=",";}
        }//end for
        out+="]";
        return out;
    }
}//end class
