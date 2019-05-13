package it.nextre.strategypattern;

public class CuocoSpagnolo implements Cuoco{
    private String nazione = "Spagna";

    private final String[] SCELTA = {"Piadina", "Focaccia", "Bocadillo"};
    private final String[] FARCITURA = {"Jamon cocito", "Jamon serrano", "Salami", "Mota", "Bresaola"};
    private final String[] FORMAGGI = {"Fontina", "Mozarela", "Brie","queso", "queso apestoso", ""};
    private final String[] CONDIMENTI = {"Cebolla", "Tomates", "Ensalada", ""};
    private final String[] SALSE = {"Salsa de Tomate", "Mayonesa", "Salsas rosas", ""};


    public String getNazione() {
        return nazione;
    }

    @Override
    public String cucina() {
        String formaggio = FORMAGGI[r.nextInt(FORMAGGI.length)];
        String condimento = CONDIMENTI[r.nextInt(CONDIMENTI.length)];
        String salsa = SALSE[r.nextInt(SALSE.length)];
        return "Panino spagnolo: "
                + SCELTA[r.nextInt(SCELTA.length)]
                + " con "
                + FARCITURA[r.nextInt(FARCITURA.length)]
                + (!formaggio.equals("")?", " + formaggio:"")
                + (!condimento.equals("")?" y " + condimento:"")
                + (!salsa.equals("")?" con " + salsa:"");
    }
}//end class
