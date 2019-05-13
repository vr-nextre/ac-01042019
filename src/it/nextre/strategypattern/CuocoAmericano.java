package it.nextre.strategypattern;

public class CuocoAmericano implements Cuoco {

    private String nazione = "USA";

    private final String[] QUANTIFICATORI = {"Big", "Double", "Mega", "Regular", "Little"};
    private final String[] SCELTA = {"Hamburger", "Fish Burger", "Chicken Burger", "Hot Dog"};
    private final String[] AGGIUNTE = {"Bacon", ""};
    private final String[] FORMAGGI = {"Cheese", "Cheddar"};
    private final String[] CONDIMENTI = {"Onion", "Tomatoes", "Salad", ""};
    private final String[] SALSE = {"Ketchup", "Mayo", "BBQ", "Senap", ""};


    public String getNazione() {
        return nazione;
    }

    @Override
    public String cucina() {
        String aggiunta = AGGIUNTE[r.nextInt(AGGIUNTE.length)];
        String formaggio = FORMAGGI[r.nextInt(FORMAGGI.length)];
        String condimento = CONDIMENTI[r.nextInt(CONDIMENTI.length)];
        String salsa = SALSE[r.nextInt(SALSE.length)];
        return "American: "
                + QUANTIFICATORI[r.nextInt(QUANTIFICATORI.length)]
                + " "
                + SCELTA[r.nextInt(SCELTA.length)]
                + (aggiunta.equalsIgnoreCase(AGGIUNTE[1]) ? "" : " with " + aggiunta)
                + (!formaggio.equals("") ? " "  + formaggio : "")
                + (!condimento.equals("") ? " " + condimento : "")
                + (!salsa.equals("") ? " " + salsa : "");
    }
}//end class
