package it.nextre.lambda;

import it.nextre.Persona;
import it.nextre.rilevazioni.GeneratoreUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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


    }//end main

}//end class
