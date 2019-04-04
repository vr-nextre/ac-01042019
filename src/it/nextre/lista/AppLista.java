package it.nextre.lista;

import it.nextre.Persona;

import java.util.Arrays;
import java.util.Random;

public class AppLista {


    public static void main(String[] args) {

        ListaInteger li = new ListaInteger();

        System.out.println(li);
        System.out.println(li.size()); //0
        //System.out.println(li.getAll());

        System.out.println("\naggiungo un valore 5");
        li.add(5);
        System.out.println(li);
        System.out.println(li.size()); //1
        //System.out.println(li.getAll());

        System.out.println("\naggiungo un valore 8");
        li.add(8);
        System.out.println(li);
        System.out.println(li.size()); //2
        //System.out.println(li.getAll());

        System.out.println("\nRecupero in posizione 2 (outOfBound)");
        System.out.println(li.get(2));
        System.out.println("\nRecupero in posizione 1 (valida)");
        System.out.println(li.get(1));


        System.out.println("\naggiungo un valore 13");
        li.add(13);
        System.out.println(li);
        System.out.println(li.size()); //3
        //System.out.println(li.getAll());

        System.out.println("\naggiungo un valore 17");
        li.add(17);
        System.out.println(li);
        System.out.println(li.size()); //4
        //System.out.println(li.getAll());

        System.out.println("\nrimuovo un valore in posizione 1");
        li.remove(1);
        System.out.println(li);
        System.out.println(li.size()); //3
        //System.out.println(li.getAll());

        System.out.println("Aggiungo valori...");
        li.add(1);
        li.add(5);
        li.add(3);
        li.add(10);
        System.out.println(li);

        System.out.println("\nrevese");
        li.reverse();
        System.out.println(li);

        System.out.println("\nordino i valori ASC");
        li.ordina(true);
        System.out.println(li);
        System.out.println("\nordino i valori DESC");
        li.ordina(false);
        System.out.println(li);

        System.out.println("\nConteggio 3: "+li.count(3));
        System.out.println("\nConteggio 5: "+li.count(5));


        System.out.println("\nIndexOf 3: "+li.indexOf(3));
        System.out.println("\nIndexOf 17: "+li.indexOf(17));
        System.out.println("\nIndexOf 1: "+li.indexOf(1));
        System.out.println("\nIndexOf 5: "+li.indexOf(5));
        System.out.println("\nIndexOf 8: "+li.indexOf(8));

        System.out.println("\nValori minori o uguali a 10");
        System.out.println(Arrays.toString(li.getAllValueBefore(10,true)));
        System.out.println("\nValori minori a 10");
        System.out.println(Arrays.toString(li.getAllValueBefore(10,false)));

        System.out.println("\nValori maggiori o uguali a 10");
        System.out.println(Arrays.toString(li.getAllValueAfter(10,true)));
        System.out.println("\nValori maggiori a 10");
        System.out.println(Arrays.toString(li.getAllValueAfter(10,false)));







    }//end main





}//end class


