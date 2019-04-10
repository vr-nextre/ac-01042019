package it.nextre.ricorsione;

import it.nextre.lista.ListaInteger;
import it.nextre.utils.UserInput;

public class Fibonacci {

    public static void main(String[] args) {

        //int n = UserInput.leggiInteroPositivo("Quale posizione della serie di Fibonacci vuoi?");

        long start1 = System.nanoTime();
        assert fibo(0)==0 : "Errore 0";
        assert fibo(1)==1 : "Errore 1";
        assert fibo(2)==1 : "Errore 2";
        assert fibo(3)==2 : "Errore 3";
        assert fibo(4)==3 : "Errore 4";
        assert fibo(5)==5 : "Errore 5";
        assert fibo(6)==8 : "Errore 6";
        assert fibo(7)==13 : "Errore 7";
        assert fibo(8)==21 : "Errore 8";
        assert fibo(9)==34 : "Errore 9";
        fibo(50);
        long end1 = System.nanoTime();

        System.out.println("VERSIONE 2 (array)");

        long start2 = System.nanoTime();
        assert fiboArray(0)==0 : "Errore 0";
        assert fiboArray(1)==1 : "Errore 1";
        assert fiboArray(2)==1 : "Errore 2";
        assert fiboArray(3)==2 : "Errore 3";
        assert fiboArray(4)==3 : "Errore 4";
        assert fiboArray(5)==5 : "Errore 5";
        assert fiboArray(6)==8 : "Errore 6";
        assert fiboArray(7)==13 : "Errore 7";
        assert fiboArray(8)==21 : "Errore 8";
        assert fiboArray(9)==34 : "Errore 9";
        fiboArray(50);
        long end2 = System.nanoTime();



        System.out.println("VERSIONE 3 (arrayPrimitivo)");

        long start3 = System.nanoTime();
        assert fiboArrayPrim(0)==0 : "Errore 0";
        assert fiboArrayPrim(1)==1 : "Errore 1";
        assert fiboArrayPrim(2)==1 : "Errore 2";
        assert fiboArrayPrim(3)==2 : "Errore 3";
        assert fiboArrayPrim(4)==3 : "Errore 4";
        assert fiboArrayPrim(5)==5 : "Errore 5";
        assert fiboArrayPrim(6)==8 : "Errore 6";
        assert fiboArrayPrim(7)==13 : "Errore 7";
        assert fiboArrayPrim(8)==21 : "Errore 8";
        assert fiboArrayPrim(9)==34 : "Errore 9";
        fiboArrayPrim(50);
        long end3 = System.nanoTime();


        System.out.println("VERSIONE 4 (ricorsione)");

        long start4 = System.nanoTime();
//        assert fiboArrayRic(0)==0 : "Errore 0";
//        assert fiboArrayRic(1)==1 : "Errore 1";
//        assert fiboArrayRic(2)==1 : "Errore 2";
//        assert fiboArrayRic(3)==2 : "Errore 3";
//        assert fiboArrayRic(4)==3 : "Errore 4";
//        assert fiboArrayRic(5)==5 : "Errore 5";
//        assert fiboArrayRic(6)==8 : "Errore 6";
//        assert fiboArrayRic(7)==13 : "Errore 7";
//        assert fiboArrayRic(8)==21 : "Errore 8";
//        assert fiboArrayRic(9)==34 : "Errore 9";

        System.out.println(fiboArrayRic(0) );
        System.out.println(fiboArrayRic(1) );
        System.out.println(fiboArrayRic(2) );
        System.out.println(fiboArrayRic(3) );
        System.out.println(fiboArrayRic(4) );
        System.out.println(fiboArrayRic(5) );
        System.out.println(fiboArrayRic(6) );
        System.out.println(fiboArrayRic(7) );
        System.out.println(fiboArrayRic(8) );
        System.out.println(fiboArrayRic(9) );
        System.out.println(fiboArrayRic(50));
        long end4 = System.nanoTime();

/*
        System.out.println(start1);
        System.out.println(end1);
        System.out.println(start2);
        System.out.println(end2);
        System.out.println(start3);
        System.out.println(end3);
        System.out.println(start4);
        System.out.println(end4);
*/


        System.out.println("---Timing---");
        System.out.println("v1 (for e swap) : " + (end1-start1) );
        System.out.println("v2 (for e array): " + (end2-start2) );
        System.out.println("v3 (for e prim) : " + (end3-start3) );
        System.out.println("v4 (ricorsione) : " + (end4-start4) );


    }//end main


    public static double fibo(int n){
        int fn=0;
        int n1=0;
        int n2=1;
        // 1 2 3 4 5 6 7 8 9 .
        // 0 1 1 2 3 5 8 13 21 34 55 89 144
        for (int i=0;i<n+1;i++){
            if (i==0){fn=0; continue;}
            if (i==1){fn=1; continue;}
            fn=n1+n2;
            n1=n2;
            n2=fn;
        }
        System.out.println("Il numero "+n+" della serie di Fibonacci è: "+fn);
        return fn;
    }


    public static double fiboArray(int n){
        int fn=0;
        ListaInteger ls = new ListaInteger();
        // 1 2 3 4 5 6 7 8 9 .
        // 0 1 1 2 3 5 8 13 21 34 55 89 144
        for (int i=0;i<n+1;i++){
            if (i==0){ls.add(0); continue;}
            if (i==1){ls.add(1); continue;}
            fn = ls.get(ls.size()-1) + ls.get(ls.size()-2);
            ls.add(fn);
        }
        System.out.println("Il numero "+n+" della serie di Fibonacci è: "+ls.get(ls.size()-1));
        return ls.get(ls.size()-1);
    }


    public static double fiboArrayPrim(int n){
        int fn=0;
        if(n==0){
            System.out.println("Il numero "+n+" della serie di Fibonacci è: 0");
            return fn;
        }
        int[] ls = new int[n+1];


        // 1 2 3 4 5 6 7 8 9 .
        // 0 1 1 2 3 5 8 13 21 34 55 89 144
        for (int i=0;i<n+1;i++){
            if (i==0){ls[i]=0; continue;}
            if (i==1){ls[i]=1; continue;}
            fn = ls[i-1] + ls[i-2];
            ls[i]=fn;
        }
        System.out.println("Il numero "+n+" della serie di Fibonacci è: "+ls[ls.length-1]);
        return ls[ls.length-1];
    }



    public static double fiboArrayRic(int n){
        if (n==0){
            //System.out.println("Il numero "+n+" della serie di Fibonacci è: 0");
            return 0;}
        if (n==1){
            //System.out.println("Il numero "+n+" della serie di Fibonacci è: 1");
            return 1;
        }
        //System.out.println("Il numero "+n+" della serie di Fibonacci è: "+(fiboArray(n-1)+fiboArray(n-2)));
        return (fiboArrayRic(n-1)+fiboArrayRic(n-2));
    }

}//end class
