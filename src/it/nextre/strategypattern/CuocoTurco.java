package it.nextre.strategypattern;

public class CuocoTurco implements Cuoco{

    private String nazione = "Turchia";

    private final String[] SCELTA = {"Kebab", "Falafel"};
    private final String[] CONDIMENTI = {"Shibola", "Pomodori", "Insalata", "", "Completo"};
    private final String[] SALSE = {"Ketchup", "Maionese", "Yogurt", ""};
    private final String[] PICCANTE = {"Pigando", "No pigando"};


    public String getNazione() {
        return nazione;
    }

    @Override
    public String cucina() {
        String condimento = CONDIMENTI[r.nextInt(CONDIMENTI.length)];
        if(condimento.equals(CONDIMENTI[4])){
            condimento = " " + CONDIMENTI[4].toLowerCase();
        } else if(!condimento.equals("")){
            condimento = " con " + condimento;
        }

        String salsa = SALSE[r.nextInt(SALSE.length)];
        return "Panino turco:"
                + SCELTA[r.nextInt(SCELTA.length)]
                + (condimento.equals("")?"":condimento)
                + (!salsa.equals("")?" con " + salsa:"")
                + " " + PICCANTE[r.nextInt(PICCANTE.length)];
    }

}//end class
