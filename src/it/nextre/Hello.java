package it.nextre;

import java.math.*;


/**
 * @author Valerio Radice
 * <p>Classe di prova per far partire un programma in Java</p>
 */
public class Hello{

    // commento singola linea

    //costruttore
    Hello(int numero){
        this();  //richiamo un altro costruttore
        System.out.println("Numero: " + numero);
    }
    Hello(){
        super(); //richiamo al costruttore padre, implicito
    }


    public static void main(String[] vars){
        System.out.println("Metodo main vero");
        Hello h1 = new Hello(7);
        Persona p1 = new Persona();
        p1.setNome("Valerio");

        System.out.println(p1.numero_di_auto);
        System.out.println(p1.getNome());


        System.out.println("numeri virgola mobile: " + ((float)0.0==0f));

        /*
        if (true){

        }else{

        }
        */
    }

    public static void Main(String[] vars){
        System.out.println("metodo farlocco");
    }


}



class Utente{}
class A{}
class Giocatore{}
