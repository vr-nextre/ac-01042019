package it.nextre.strategypattern;

//il contesto usa la strategia (cuoco) per generare qualcosa (piatto --> panino)

public class Context {
    public String getPanino(Cuoco cuoco){
        if (cuoco!=null){
            return cuoco.cucina();
        }
        return "Invalid Strategy";
    }
}//end class
