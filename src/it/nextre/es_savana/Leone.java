package it.nextre.es_savana;

public class Leone extends Animale {


    public Leone(String razza){
        this.runSpeed=58; //Km/h
        super.setRazza(razza);
    }

    @Override
    public double corri() {
        //ritorno metri percorsi al secondo
        //double vel = runSpeed*1000/3600;
        double vel = runSpeed/3.6;  //semplificata
        if (r.nextInt(100)<40)
            return 0;
        else
            return vel;
    }

    @Override
    public String toString() {
        return "Leone{" +
                "razza=" + super.getRazza() +", "+
                "runSpeed=" + runSpeed + ", " +
                "distanzaPercorsa=" + getDistanzaPercorsa() +
                '}';
    }
}//end class
