package it.nextre.mappa;

public class AppMappa {

    public static void main(String[] args) {

        Mappa m = new Mappa();
        m.add("nome","Valerio");
        m.add("cognome","Radice");
        m.add("anni","33");
        m.add("anni","34");

        System.out.println("\nSTAMPA MATRICE:");
        System.out.println(m);
        System.out.println("Matrice: "+m.size()+ (m.size()==1?"elemento":" elementi"));


        System.out.println(""+m.getValue("nome")+" ha "+m.getValue("anni") + " anni!");


        m.remove("cognome");
        System.out.println("\nSTAMPA MATRICE:");
        System.out.println(m);

        m.remove("anni");
        System.out.println("\nSTAMPA MATRICE:");
        System.out.println(m);

        System.out.println("Matrice: "+m.size()+ (m.size()==1?"elemento":" elementi"));

        m.remove("nome");
        System.out.println("\nSTAMPA MATRICE:");
        System.out.println(m);

        System.out.println("Matrice: "+m.size()+ (m.size()==1?"elemento":" elementi"));


    }//end main
}//end class
