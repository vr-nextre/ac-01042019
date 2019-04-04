package it.nextre.gioco1;

import java.util.Random;

public class Giocatore {

    String nome;
    int colpi;

    public Giocatore(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getColpi() {
        return colpi;
    }

    public void setColpi(int colpi) {
        this.colpi = colpi;
    }

    //boolean per preso o non preso il bersaglio
    public boolean spara() {
        this.colpi++;
        Random r = new Random();
        return r.nextInt(100) < 5;
    }


    @Override
    public String toString() {
        return "Giocatore{" +
                "nome='" + nome + '\'' +
                ", colpi=" + colpi +
                '}';
    }
}//end class
