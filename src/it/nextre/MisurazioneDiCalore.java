package it.nextre;

import it.nextre.rilevazioni.Misurazione;


public class MisurazioneDiCalore extends Misurazione {

    public MisurazioneDiCalore(){
        this(3);
        //esempio di attributo protetto
        precisione="centesimo di Celsius";
    }
    public MisurazioneDiCalore(int i){
        super(i);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}//end class
