package it.nextre.oop;



public class ClasseEsempio {


    {
     nome = "pippo";
    }


    private String nome;
    private String cognome;

    //costruttore vuoto / come quello di default, ma quello di default non lo si DEVE esplicitare mai, altrimenti è un costruttore vuoto
    public ClasseEsempio(){
        //super();
        this("NON VALORIZZATO","NON VALORIZZATO");
    }
    public ClasseEsempio(int anni){
        nome="anni";
    }

    public ClasseEsempio(Integer eta){
        nome="costruttore eta";
    }

    public ClasseEsempio(String nome, String cognome){
        this(4);
        this.nome=nome;
        this.cognome=cognome;
    }



    //metodo
    void saluta(){
        System.out.println("Ciaooneeeee "+this.nome);
    }

    static void saluta(String persona){
        System.out.println("Ciao "+persona);
    }



}//end class
