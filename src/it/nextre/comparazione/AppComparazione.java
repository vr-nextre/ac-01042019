package it.nextre.comparazione;

import it.nextre.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class AppComparazione {

    public static void main(String[] args) {

        Comparable<Persona> comparable;  //--> compareTo(T t)
        Comparator<Persona> comparator;  //--> compare(T t1, T t2)

        List<Persona> iscritti = new ArrayList<>();

        Persona p1 = new Persona("Valerio","Verdi",1,21000,null,"v.verdi@gmail.com");
        Persona p2 = new Persona("Simona","Neri",2,24000,p1,"s.neri@gmail.com" );
        Persona p3 = new Persona("Claudia","Rossi",3,26000,null,"c.rossi@libero.it");
        Persona p4 = new Persona("Marco","Celeste",3,20000,null,"m.celeste@libero.it");
        Persona p5 = new Persona("Giuseppe","Verdi",1,19000,null, "g.verdi@nextre.it");
        Persona p6 = new Persona("Sonia","Bianchi",2,42000,p4,"s.bianchi@hotmail.it");

        p1.setConiuge(p2);
        p4.setConiuge(p6);

        iscritti.add(p1);
        iscritti.add(p2);
        iscritti.add(p3);
        iscritti.add(p4);
        iscritti.add(p5);
        iscritti.add(p6);

        System.out.println("Iscritti all'evento: "+iscritti.size() );

        //stampa la lista
        /*
        for (int i = 0; i < iscritti.size(); i++) {
            System.out.println(iscritti.get(i));
        }//end for
        */
        iscritti.forEach(System.out::println);


        /*
        //From Anonim class to Lamba Hero


        //step 1
        iscritti.stream().forEach(new Consumer<Persona>() {
            @Override
            public void accept(Persona persona) {
                System.out.println(persona);
            }
        });

        //step2
        iscritti.stream().forEach((Persona persona)->{
                System.out.println(persona);
            }
        );

        //step3
        iscritti
                .stream()
                .forEach((Persona persona)->System.out.println(persona));

        //step4
        iscritti
                .stream()
                .forEach( p -> System.out.println(p) );

        //step5
        iscritti
                .forEach((p)->System.out.println(p));

        //step6
        iscritti.forEach(System.out::println);

*/
        System.out.println("\n\n----> Ordino per salario <----");
        Comparator<Persona> salarioASC = new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return (int)(p1.getSalario()-p2.getSalario());
            }
        };
        iscritti.sort(salarioASC);
        //Collections.sort(iscritti,salarioASC);
        //Collections.sort(iscritti,salarioASC.reversed());  //DESC

        iscritti.forEach(System.out::println);



        System.out.println("\n\n----> Ordino per lunghezza <----");
        iscritti.sort((o1, o2)->o1.getNome().length()-o2.getNome().length());
        iscritti.forEach(System.out::println);


        System.out.println("\n\n----> Ordino per finisce per 'a' <----");
        iscritti.sort((o1, o2)->{
            if (o1.getNome().toLowerCase().endsWith("a") && !o2.getNome().toLowerCase().endsWith("a")){
                return -1;
            }else if (o2.getNome().toLowerCase().endsWith("a") && !o1.getNome().toLowerCase().endsWith("a")){
                return 1;
            }else{return 0;}
        });
        iscritti.forEach(System.out::println);













        System.out.println("\n\n----> Ordino per dominio della mail <----");
        //todo ..esercizio min 20
        Comparator<Persona> emailDominio = new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                String tmp1 = p1.getEmail();
                String tmp2 = p2.getEmail();
                return 0;
            }
        };
        iscritti.sort(emailDominio);
        iscritti.forEach(System.out::println);



    }//end main

}//end class
