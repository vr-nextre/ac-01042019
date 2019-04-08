package it.nextre.oop;

import it.nextre.oop.animali.Animale;
import it.nextre.oop.animali.vertebrati.Vertebrato;

public class AppOop {

    public static void main(String[] args) {

        /*
        ClasseEsempio.saluta("Bruno");
        ClasseEsempio pinoDeiPalazzi = new ClasseEsempio("Valerio","");
        pinoDeiPalazzi.saluta();
        */

        Animale a = new Animale();
        Vertebrato v = new Vertebrato();

        Animale a2 = new Vertebrato();

        Object o1 = new String("aaa");
        Object o2 = new Integer(34);

        System.out.println(((String)o1).toUpperCase());
        if (o2 instanceof String) {
            ((String) o2).toUpperCase();
        }




        a=v; //commenta
        v.balla();
        if (a instanceof Vertebrato) {
            ((Vertebrato) a).balla();
        }


        System.out.println(a.getId());
        System.out.println(v.getId());


    }//end main
}//end class
