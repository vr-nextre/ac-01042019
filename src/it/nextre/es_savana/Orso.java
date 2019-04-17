package it.nextre.es_savana;

public class Orso extends Animale {


    public Orso(String razza){
        this.runSpeed=67; //Km/h
        super.setRazza(razza);
    }

    @Override
    public double corri() {
        //ritorno metri percorsi al secondo
        //double vel = runSpeed*1000/3600;
        double vel = runSpeed/3.6;  //semplificata
        if (r.nextInt(100)<20)
            return 0;
        else
            return vel;
    }

    @Override
    public String toString() {
        return "Orso{" +
                "razza=" + super.getRazza() +", "+
                "runSpeed=" + runSpeed + ", " +
                "distanzaPercorsa=" + getDistanzaPercorsa() +
                '}';
    }
}//end class
