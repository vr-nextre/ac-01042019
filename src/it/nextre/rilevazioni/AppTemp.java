package it.nextre.rilevazioni;

public class AppTemp {


    public static final int N_MISURE=172_800;

    public static void main(String[] args) {

        Misurazione mis = new Misurazione(N_MISURE);

        mis.precisione="ALTA";


        for (int i=0;i<N_MISURE;i++){
            if (i<7200*6){
                mis.addValore(GeneratoreUtils.getTemperatura("notte"));
            }else if (i>=7200*6 && i<7200*12){
                mis.addValore(GeneratoreUtils.getTemperatura("mattino"));
            }else if (i>=7200*12 && i<7200*18){
                mis.addValore(GeneratoreUtils.getTemperatura("pomeriggio"));
            }else{
                mis.addValore(GeneratoreUtils.getTemperatura("sera"));
            }
        }
        //mis.stampaValori();
        System.out.println("Media Temperature: " + mis.getMedia());


    }//end main

}//end class
