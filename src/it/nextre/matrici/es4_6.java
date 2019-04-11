package it.nextre.matrici;

import java.util.Random;

public class es4_6 {

    public static void main(String[] args) {

        int righe=3, colonne=3;

        int[][] m1 = new int[righe][colonne];
        int[][] m2 = new int[righe][colonne];
        int[][] ris;

        Random r = new Random();

        //POPOLAMENTO DINAMICO/RANDOMICO
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                m1[i][j]=r.nextInt(10);
                m2[i][j]=r.nextInt(10);
            }//end for
        }//end for

        //STAMPA MATRICI m1 e m2
        System.out.println(getContent(m1));
        System.out.println(getContent(m2));

        //RICHIEDO MATRICE RISULTATO
        ris = confrontaMatrici(m1,m2);
        //STAMPO MATRICE RISULTATO
        System.out.println(getContent(ris));

        //TEST VALIDITA' MATRICE RISULTATO
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                if(m1[i][j]<m2[i][j]){
                    assert ris[i][j]==-1 : "Errore -1";
                };
                if(m1[i][j]==m2[i][j]){
                    assert ris[i][j]==0 : "Errore 0";
                };
                if(m1[i][j]>m2[i][j]){
                    assert ris[i][j]==1 : "Errore 1";
                };
            }//end for
        }//end for



    }//end main

    private static int[][] confrontaMatrici(int[][] m1, int[][] m2) {
        int[][] out = new int[m1.length][m1[0].length];
        //todo fixare con eccezione
        //controllo di sicurezza
        if (m1.length!=m2.length){
            for (int i = 0; i < out.length; i++) {
                for (int j = 0; j < out[i].length; j++) {
                    out[i][j]=9; // 9 valore non valido solo -1 0 1
                }//end for
            }//end for
            return out;
        }

        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out[i].length; j++) {
                if (m1[i][j]  < m2[i][j])out[i][j]=-1;
                if (m1[i][j] == m2[i][j])out[i][j]= 0;
                if (m1[i][j]  > m2[i][j])out[i][j]= 1;
            }//end for
        }//end for

        return out;
    }


    public static String getContent(int[][] db){
        String out = "";
        for (int i = 0; i < db.length; i++) {
            for(int col = 0;col<db[i].length;col++)
                out += String.format("| %-2s", db[i][col]);
            out += "|\n";
        }
        return out;
    }


}//end class
