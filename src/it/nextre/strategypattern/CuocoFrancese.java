package it.nextre.strategypattern;

public class CuocoFrancese implements Cuoco {
    private String nazione = "Francia";

    private final String[] SCELTA = {"Baguette", "Sandwich"};
    private final String[] FARCITURA = {"Jambon cuit", "Jambon Cru", "Cordon bleu","Entrecote","Escargots"};
    private final String[] FORMAGGI = {"Fromage", "Emmental"};
    private final String[] CONDIMENTI = {"Oignon", "Tomate", "Salade", "Pomme de terre"};
    private final String[] SALSE = {"Ketchup", "Mayo", "Barbeque", "Moutarde", ""};


    public String getNazione() {
        return nazione;
    }

    @Override
    public String cucina() {
        String formaggio = FORMAGGI[r.nextInt(FORMAGGI.length)];
        String condimento = CONDIMENTI[r.nextInt(CONDIMENTI.length)];
        String salsa = SALSE[r.nextInt(SALSE.length)];
        return "Libertè, Egalitè, avec le Bidèt: "
                + SCELTA[r.nextInt(SCELTA.length)]
                + " avec "
                + FARCITURA[r.nextInt(FARCITURA.length)]
                + (!formaggio.equals("") ? " avec " + formaggio : "")
                + (!condimento.equals("") ? " avec " + condimento : "")
                + (!salsa.equals("") ? " avec " + salsa : "");
    }
}//end class
