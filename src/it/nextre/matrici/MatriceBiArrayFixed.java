package it.nextre.matrici;

public class MatriceBiArrayFixed implements Matriciabile {

    private String[][] db;
    private int righe;
    private int colonne;


    /**
     * Crea una matrice rettagolare
     * */

    public MatriceBiArrayFixed(int righe, int colonne) {
        if (righe > 0 && colonne > 0) {
            this.righe = righe;
            this.colonne = colonne;
            db = new String[righe][colonne]; //inizializzo tutti i livelli
        }
    }


    public boolean checkIndex(int riga, int colonna){
        return (riga>=0 && riga<this.db.length && colonna>=0 && colonna<this.db[0].length);
    }

    public String get(int riga, int colonna) {
        if(!checkIndex(riga, colonna))return "Invalid Index";
        return this.db[riga][colonna];

    }

    public void put(String value, int riga, int colonna) {
        if(!checkIndex(riga, colonna)){
            System.err.println("Invalid Index: row("+riga+")/col("+colonna+") not valid.");
            return;
        }
        this.db[riga][colonna]=value;
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < db.length; i++) {
            for(int col = 0;col<db[i].length;col++)
                out += String.format("| %-5s", db[i][col]);
            out += "|\n";
        }
        return out;
    }
}//end class
