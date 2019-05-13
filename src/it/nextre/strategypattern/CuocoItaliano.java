package it.nextre.strategypattern;

public class CuocoItaliano implements Cuoco{

    private String nazione = "Italia";

    private final String[] SCELTA = {"Piadina", "Focaccia", "Panino"};
    private final String[] FARCITURA = {"Prosciutto cotto", "Prosciutto crudo", "Salame", "Speck", "Bresaola"};
    private final String[] FORMAGGI = {"Fontina", "Mozzarella", "Brie", ""};
    private final String[] CONDIMENTI = {"Cipolle", "Pomodori", "Insalata", ""};
    private final String[] SALSE = {"Ketchup", "Maionese", "Salsa rosa", ""};


    public String getNazione() {
        return nazione;
    }

    @Override
    public String cucina() {
        String formaggio = FORMAGGI[r.nextInt(FORMAGGI.length)];
        String condimento = CONDIMENTI[r.nextInt(CONDIMENTI.length)];
        String salsa = SALSE[r.nextInt(SALSE.length)];
        return "Panino italiano: "
                + SCELTA[r.nextInt(SCELTA.length)]
                + " con "
                + FARCITURA[r.nextInt(FARCITURA.length)]
                + (!formaggio.equals("")?", " + formaggio:"")
                + (!condimento.equals("")?" e " + condimento:"")
                + (!salsa.equals("")?" con " + salsa:"");
    }
}//end class
