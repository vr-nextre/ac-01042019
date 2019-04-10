package it.nextre.generici;

import it.nextre.Persona;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppGenerici {

    public static void main(String[] args) {
        //l1 BAD non è tipizzata! sono tutti Object

        Persona p1 = new Persona();
        p1.getNome();

        ListaGenerica l1 = new ListaGenerica();
        l1.add(2);
        l1.add("Stringa");
        l1.add(3.14);
        l1.add(p1);

        System.out.println(l1.get(3)); //non posso fare getNome su Object!
        if(l1.get(3) instanceof  Persona){
            ((Persona)l1.get(3)).getNome(); //solo sotto cast controllato potrò castare e riusare un Object come vero tipo di oggetto originale.
        }


        ListaGenerica<Persona> l2 = new ListaGenerica<>();
        //l2.add(2);
        //l2.add("Stringa");
        //l2.add(3.14);
        l2.add(p1);

        l2.get(0).getNome();    //questa volta il dato torna tipizzato

        ListaGenerica<Integer> l3 = new ListaGenerica<>();
        ListaGenerica<Integer> l4 = new ListaGenerica<>();


        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);



    }//end main

}//end class
