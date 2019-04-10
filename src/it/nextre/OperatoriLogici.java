package it.nextre;

public class OperatoriLogici {

    public static void main(String[] args) {

        int a=0;
        int b=5;
        boolean t = true;
        boolean f = false;


        System.out.println("a: "+a+" b: "+b+" t: "+t+" f: "+f);

        if (f && a++>0 | b++>0 ){
            System.out.println("VERO");
        }else{
            System.out.println("FALSO");
        }

        System.out.println("a: "+a+" b: "+b+" t: "+t+" f: "+f);


    }//end main

}//end class
