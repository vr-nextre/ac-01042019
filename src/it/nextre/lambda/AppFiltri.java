package it.nextre.lambda;

import it.nextre.Persona;
import it.nextre.rilevazioni.GeneratoreUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class AppFiltri {

    private static final int NUM_PERSONE = 10;
    public static final Random r = new Random();

    public static void main(String[] args) {

        List<Persona> pers = new ArrayList<>();

        for (int i =0; i< NUM_PERSONE; i++) {
            String nome = GeneratoreUtils.getNome();
            String cognome = GeneratoreUtils.getCognome();
            String email = GeneratoreUtils.getEmail(nome, cognome);
            Persona tmp = new Persona(
                    nome,
                    cognome,
                    r.nextInt(3),
                    r.nextDouble() * 2500,
                    null,
                    email
            );
            pers.add(tmp);
        }

        System.out.println("Persone: ");
        pers.forEach(System.out::println);


        System.out.println("conteggio @gmail: "+
                pers
                        .stream()
                        .filter(item->item.getEmail().endsWith("@gmail.com"))
                .count()
        );


        System.out.println("conteggio stipendio sopra 1000: "+
                pers
                        .stream()
                        .filter(item->item.getSalario()>1000)
                        .count()
        );


        System.out.println();
        Map<String, List<Persona>> ppp = pers.stream()
                .collect(
                        Collectors.groupingBy(el->el.getEmail().substring(el.getEmail().indexOf("@")), Collectors.toList() ));

        System.out.println(ppp);

    }//end main

}//end class
