package it.nextre.generici;

import java.util.Random;

public class Urna<T> {

    T[] mem;

    public Urna(){
        this.mem = (T[])new Object[0];;
    }

    /*
    public T[] getAll(){
        return this.mem;
    }
    */


    public T get(){
        if(this.mem.length>0){
            Random r = new Random();
            int pos = r.nextInt(this.mem.length);
            T tmp = this.mem[pos];
            this.remove(pos);
            return tmp;
        }
        //todo aggiungere exception
        return null;
    }

    public int size(){
        return this.mem.length;
    }

    public void add(T value){
        T[] tmp = (T[])new Object[this.mem.length + 1];
        for (int i = 0; i < this.mem.length; i++) {
            tmp[i]=this.mem[i];
        }//end for
        tmp[this.mem.length]=value;
        this.mem=tmp;
    }


    private void remove(int idx){
        T[] tmp = (T[])new Object[this.mem.length - 1];
        for (int i = 0; i < this.mem.length; i++) {
            //se l'indice di scorrimento è alla posizione di quello che voglio rimuovere
            if(i==idx){continue;}
            if(i<idx){tmp[i]=this.mem[i];}
            if(i>idx){tmp[i-1]=this.mem[i];}
        }//end for
        this.mem=tmp;
    }


    @Override
    public String toString() {
        String out="Urna[";
        for (int i = 0; i < this.mem.length; i++) {
            out+=this.mem[i];
            if(i!=this.mem.length-1){out+=",";}
        }//end for
        out+="]";
        return out;
    }



}//end class
