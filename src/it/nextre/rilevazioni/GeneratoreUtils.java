package it.nextre.rilevazioni;

import java.util.Random;

public class GeneratoreUtils {

    public static double getTemperatura(String momento){
        double temperature=0;
        switch (momento){
            case "mattino": {
                temperature=17; break;
            }
            case "pomeriggio": {
                temperature=20; break;
            }
            case "sera": {
                temperature=16; break;
            }
            case "notte": {
                temperature=14; break;
            }
            default: return 0;
        }
        double delta = Math.random(); //estrae un valore da 0 a 1(escluso) grado;
        Random r = new Random();
        if (r.nextBoolean())
            temperature+=delta;
        else
            temperature-=delta;

        return temperature;
    }


}//end class
