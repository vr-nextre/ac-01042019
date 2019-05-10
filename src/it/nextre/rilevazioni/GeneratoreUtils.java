package it.nextre.rilevazioni;

import java.util.Random;

public class GeneratoreUtils {


    private static Random r = new Random();

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
        if (r.nextBoolean())
            temperature+=delta;
        else
            temperature-=delta;

        return temperature;
    }




    public static String getNome() {
        String[] listaNomi = {
                "Francesco", "Leonardo", "Alessandro", "Lorenzo", "Mattia", "Andrea", "Gabriele", "Riccardo", "Matteo", "Tommaso", "Edoardo", "Federico", "Giuseppe", "Antonio", "Diego", "Davide", "Christian", "Nicolo", "Giovanni", "Samuele", "Sofia", "Giulia", "Aurora", "Alice", "Ginevra", "Emma", "Giorgia", "Greta", "Martina", "Beatrice", "Anna", "Chiara", "Sara", "Nicole", "Ludovica", "Gaia", "Matilde", "Vittoria", "Noemi", "Francesca"};
        return listaNomi[r.nextInt(listaNomi.length)];
    }

    public static String getCognome() {
        String[] listaCognomi = {
                "Rossi", "Russo", "Ferrari", "Esposito", "Bianchi", "Romano", "Colombo", "Ricci", "Marino", "Greco", "Bruno", "Gallo", "Conti", "De Luca", "Mancini", "Costa", "Giordano", "Rizzo", "Lombardi", "Moretti", "Barbieri", "Fontana", "Santoro", "Mariani", "Rinaldi", "Caruso", "Ferrara", "Galli", "Martini", "Leone", "Longo", "Gentile", "Martinelli", "Vitale", "Lombardo", "Serra", "Coppola", "De Santis", "D'Angelo", "Marchetti", "Parisi", "Villa", "Conte", "Ferraro", "Ferri", "Fabbri", "Bianco", "Marini", "Grasso", "Valentini", "Messina", "Sala", "De Angelis", "Gatti", "Pellegrini", "Palumbo", "Sanna", "Farina", "Rizzi", "Monti", "Cattaneo", "Morelli", "Amato", "Silvestri", "Mazza", "Testa", "Grassi", "Pellegrino", "Carbone", "Giuliani", "Benedetti", "Barone", "Rossetti", "Caputo", "Montanari", "Guerra", "Palmieri", "Bernardi", "Martino", "Fiore", "De Rosa", "Ferretti", "Bellini", "Basile", "Riva", "Donati", "Piras", "Vitali", "Battaglia", "Sartori", "Neri", "Costantini", "Milani", "Pagano", "Ruggiero", "Sorrentino", "D'Amico", "Orlando", "Damico", "Negri"};
        return listaCognomi[r.nextInt(listaCognomi.length)];
    }

    public static String getDominioMail() {
        String[] listaDomini = {
                "gmail.com", "outlook.com", "yahoo.com", "virgilio.it", "libero.it", "msn.com", "aruba.it", "live.com","email.com","zmail.com","gasmail.com","ail.com","gl.com","ururuarara.com"};
        return listaDomini[r.nextInt(listaDomini.length)];
    }

    public static String getEmail() {
        return getNome().toLowerCase() + "." + getCognome().toLowerCase().replaceAll("\\W", "") + "@" + getDominioMail();

    }


    public static String getEmail(String nome, String cognome) {
        return nome.toLowerCase() + "." + cognome.toLowerCase().replaceAll("\\W", "") + "@" + getDominioMail();

    }
}//end class
