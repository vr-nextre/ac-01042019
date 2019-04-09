package it.nextre.mappa;

public class AppMappaTest {

    public static void main(String[] args) {

        Mappa m = new Mappa();
        assert m.size()==0 : "Errore mappa size";


        m.add("nome","Valerio");
        assert m.size()==1 : "Errore di inserimento";
        assert m.getValue("nome").equals("Valerio") : "Errore di memorizzazione su add o su estrazione valore metodo getValue";
        assert m.contains("nome")==true : "Errore metodo contains";


        m.add("nome","Anna");
        assert m.size()==1 : "Errore di aggiornamento";
        assert m.getValue("nome").equals("Anna") : "Errore di aggiornamento su add o su estrazione valore metodo getValue";




        m.add("cognome","Radice");
        assert m.size()==2 : "Errore metodo add";

        m.add("anni","33");
        assert m.size()==3 : "Errore metodo add";

        m.remove("anni");
        assert m.contains("anni")==false : "Errore metodo contains";
        assert m.size()==2 : "Errore metodo remove";





    }//end main
}//end class
