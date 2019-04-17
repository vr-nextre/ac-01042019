package it.nextre.es_savana;

public class Ghepardo extends Animale {


    public Ghepardo(String razza){
        this.runSpeed=76; //Km/h
        super.setRazza(razza);
    }

    @Override
    public double corri() {
        //ritorno metri percorsi al secondo
        //double vel = runSpeed*1000/3600;
        double vel = runSpeed/3.6;  //semplificata
        if (r.nextInt(100)<80)
            return 0;
        else
            return vel;
    }

    @Override
    public String toString() {
        return "Ghepardo{" +
                "razza=" + super.getRazza() +", "+
                "runSpeed=" + runSpeed + ", " +
                "distanzaPercorsa=" + getDistanzaPercorsa() +
                '}';
    }
}//end class
