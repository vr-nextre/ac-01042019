package it.nextre.es_savana;


/**
 * Utilizzando le interfacce creare una gara tra animali che corrono per agguantare una succulenta preda. (partendo dalla stessa distanza)
 * <p>
 * Orso Bruno; corre a 67km/h e inciampa con una frequenza di 1/5 tentativi
 * Ghepardo Gerardo; corre a 76km/h e inciampa con una frequenza di 4/5 tentativi
 * Leone Simone; corre a 58km/h e inciampa con una frequenza di 2/5 tentativi
 * <p>
 * Ognuno di loro deve percorrere 800m per raggiungere la preda, e ogni secondo svolgono un tentativo. Se inciampano, avanzano di 0m.
 */


public class AppSavana {

    public static void main(String[] args) throws InterruptedException {

        //creare gli animali nella savana

        Animale bruno = new Orso("Bruno");
        Animale simone = new Leone("Albino");
        Animale gerardo = new Ghepardo("Da sofà");

        //classe anonima x Gazzella
        Animale gazzella = new Animale() {
            @Override
            public double corri() {
                return 10/3.6;  //10Km/h in m/s
            }
            /*
            @Override
            public String toString() {
                return "Gazzella{" +
                        "razza=" + super.getRazza() +", "+
                        "runSpeed=" + runSpeed + ", " +
                        "distanzaPercorsa=" + getDistanzaPercorsa() +
                        '}';
            }
            */
        };
        gazzella.setRazza("zoppa");


        //Gazzella ferma a 800m da loro
        double distanza_dalla_preda = 800;

        // Map non utilizzabile ma da correggersi in futuro
        //todo rifare con map

        //tutti gli animali corrono fintantoché non la prendono
        do{
            //todo corse
            double distanza = 0;
            distanza = gazzella.corri();
            System.out.println("Gazzella "+ gazzella.getRazza() + " ha percorso " + distanza + "m.");
            gazzella.addDistanzaPercorsa(distanza);
            distanza_dalla_preda += distanza;


            distanza = bruno.corri();
            System.out.println("Orso "+ bruno.getRazza() + " ha percorso " + distanza + "m.");
            bruno.addDistanzaPercorsa(distanza);

            distanza = simone.corri();
            System.out.println("Leone "+ simone.getRazza() + " ha percorso " + distanza + "m.");
            simone.addDistanzaPercorsa(distanza);

            distanza = gerardo.corri();
            System.out.println("Ghepardo "+ gerardo.getRazza() + " ha percorso " + distanza + "m.");
            gerardo.addDistanzaPercorsa(distanza);

            System.out.println("----Parziali:");
            System.out.println(gazzella+" distanzaTotale="+distanza_dalla_preda);
            System.out.println(bruno);
            System.out.println(simone);
            System.out.println(gerardo);
            System.out.println("\n\n\n");

            Thread.sleep(1000);

        }while(
                bruno.getDistanzaPercorsa()<=distanza_dalla_preda &&
                        simone.getDistanzaPercorsa()<=distanza_dalla_preda &&
                        gerardo.getDistanzaPercorsa()<=distanza_dalla_preda);

        System.out.println("----FINALE:");
        System.out.println(bruno);
        System.out.println(simone);
        System.out.println(gerardo);




    }//end main

}//end class
