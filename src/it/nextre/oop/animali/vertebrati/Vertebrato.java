package it.nextre.oop.animali.vertebrati;

import it.nextre.oop.animali.Animale;

public class Vertebrato extends Animale {

    String ID;

    public Vertebrato(){
        System.out.println("Sono un vertebrato");
        super.ha_scheletro=false;
        this.ID = "1111";
    }

    @Override
    public String getId() {
        return this.ID;
    }

    @Override
    public String toString() {
        return super.toString()+">Vertebrato";
    }


    public void balla(){
        System.out.println("Il vertebrato sta muovendo i suoi arti in modo confusionario");
    }
}//end class
