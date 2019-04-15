package it.nextre.interfacce;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppLista {

    public static void main(String[] args) {
        //ArrayList<String> spam = new ArrayList<>();
        List<String> spam = new ArrayList<>();
        spam.add("a@spam.me");
        spam.add("b@spam.me");
        spam.add("c@spam.me");
        spam.add("d@spam.me");

        //LinkedList<String> valid = new LinkedList<>();
        List<String> valid = new LinkedList<>();
        valid.add("a@testa.mi");
        valid.add("b@testa.mi");
        valid.add("c@testa.mi");
        valid.add("d@testa.mi");

        List<String> dest = new LinkedList<>(valid);
        dest.addAll(spam);

        System.out.println(dest.size());
        System.out.println(dest);

        String HTMLmail = "todo email";

        inviaMail(HTMLmail, spam);
    }//end main

    private static void inviaMail(String html, List<String> dest) {
        System.out.println(dest.size()+" indirizzi: invio in corso...");
    }

}//end class
