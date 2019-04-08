package it.nextre.oop.animali;

public class Animale {

    protected boolean ha_scheletro;
    protected String ID;

    public Animale(){
        System.out.println("Sono un animale");
        this.ID = "0000";
    }

    public String getId(){
        return this.ID;
    }

    @Override
    public String toString() {
        return "Animale";
    }
}//end class
