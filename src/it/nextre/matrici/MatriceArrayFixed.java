package it.nextre.matrici;

public class MatriceArrayFixed implements Matriciabile {

    private String[] db;
    private int righe;
    private int colonne;


    public MatriceArrayFixed(int righe, int colonne) {
        if (righe > 0 && colonne > 0) {
            this.righe = righe;
            this.colonne = colonne;
            db = new String[righe * colonne];
        }
    }


    public boolean checkIndex(int riga, int colonna){
        return (riga>=0 && riga<=this.righe && colonna>=0 && colonna <=this.colonne);
    }



    public String get(int riga, int colonna) {
        if(!checkIndex(riga, colonna))return "Invalid Index";
        //System.out.println("r: "+ riga + " c: "+colonna);
        //if(riga==0&&colonna==0){this.db[0]=value; return;}
        if (riga == this.righe && colonna == this.colonne) {
            return this.db[this.db.length - 1];
        } else {
            return this.db[riga * this.colonne + (colonna == 0 ? colonna : colonna - 1)];
        }
    }

    public void put(String value, int riga, int colonna) {
        if(!checkIndex(riga, colonna)){
            System.err.println("Invalid Index: row("+riga+")/col("+colonna+") not valid.");
            return;
        }
        //System.out.println("r: "+ riga + " c: "+colonna);
        //if(riga==0&&colonna==0){this.db[0]=value; return;}
        if (riga == this.righe && colonna == this.colonne) {
            this.db[this.db.length - 1] = value;
        } else {
            this.db[riga * this.colonne + (colonna == 0 ? colonna : colonna - 1)] = value;
        }
    }

    @Override
    public String toString() {
        String out = "";
        int colRiga = 0;
        for (int i = 0; i < db.length; i++, colRiga++) {
            if (colRiga > 0 && colRiga == colonne) {
                colRiga = 0;
                out += "|\n";
            }
            out += String.format("| %-5s", db[i]);
        }
        return out + "|";
    }
}//end class
