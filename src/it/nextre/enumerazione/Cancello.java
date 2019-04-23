package it.nextre.enumerazione;

public enum Cancello {
    APERTO(100), CHIUSO(0), UN_QUARTO(25), UN_MEZZO(50), TRE_QUARTI(75);

    //  |#####___|  100 tutto aperto , 0 tutto chiuso
    private int valore;
    Cancello(int stato){
        this.valore=stato;
    }
    public int getValore(){
        return this.valore;
    }

    public void stampaStato() {
        String out="|";
        int conteggio=0;
        while(conteggio<this.valore){
            if(conteggio%5==0){
                out+="_";
            }
            conteggio++;
        }
        while(conteggio<100){
            if(conteggio%5==0){
                out+="#";
            }
            conteggio++;
        }
        out+="|";
        System.out.println(out);
    }
}//end class
