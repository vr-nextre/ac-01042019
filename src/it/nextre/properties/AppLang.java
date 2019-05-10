package it.nextre.properties;

import java.util.*;

public class AppLang {

    public static void main(String[] args) {
        Locale.setDefault(Locale.FRANCE);
        //ResourceBundle rb = ResourceBundle.getBundle("translate");
        //ResourceBundle rb = ResourceBundle.getBundle("translate", Locale.forLanguageTag("es"));
        ResourceBundle rb = ResourceBundle.getBundle("translate", Locale.GERMANY);
        System.out.println(rb.getString("text.privacy"));







    }//end main

}//end class
