package it.nextre.enumerazione;

public class AppEnum {

    public static void main(String[] args) {
        //System.out.println(Ruolo.ADMIN);
        //System.out.println(Ruolo.GUEST);
        //System.out.println(Ruolo.values()[1]);

        for(Ruolo tmp : Ruolo.values()){
            System.out.println(tmp.ordinal());
            System.out.println(tmp);
            System.out.println(tmp.name());
            System.out.println(Ruolo.valueOf(tmp.toString()));
        }

    }//end main


}//end class
