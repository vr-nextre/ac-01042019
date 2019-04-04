package it.nextre.matrici;

public class AppMatrix {

    public static void main(String[] args) {

        Matriciabile mat = new MatriceBiArrayFixed(5,3);

        mat.put("A",0,0);
        mat.put("B",1,0);
        mat.put("C",2,2);
        mat.put("D",4,2);
        mat.put("D",7,39);

        System.out.println(mat.get(0,0));
        System.out.println(mat.get(1,0));
        System.out.println(mat.get(2,2));
        System.out.println(mat.get(4,2));


        System.out.println(mat);

    }//end main

}//end class
