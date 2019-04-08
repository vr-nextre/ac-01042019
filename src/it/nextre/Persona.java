package it.nextre;

import java.util.*;

public class Persona extends Object{

    private String nome;
    private String cognome;
    int numero_di_auto;
    double salario;
    Persona coniuge;

    public Persona(){

    }
    public Persona(Persona persona) {
        //todo fare qualcosa
    }
    public Persona(String nome, String cognome, int numero_di_auto, double salario, Persona coniuge) {
        this.nome = nome;
        this.cognome = cognome;
        this.numero_di_auto = numero_di_auto;
        this.salario = salario;
        this.coniuge=coniuge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
       this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getNumero_di_auto() {
        return numero_di_auto;
    }

    public void setNumero_di_auto(int numero_di_auto) {
        this.numero_di_auto = numero_di_auto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Persona getConiuge() {
        return coniuge;
    }

    public void setConiuge(Persona coniuge) {
        this.coniuge = coniuge;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", numero_di_auto=" + numero_di_auto +
                ", salario=" + salario +
                ", coniuge='" + (coniuge!=null?coniuge.getNome():"") +
                "'}";
    }

    @Override
    protected Persona clone()  {
        return new Persona(
                this.nome,
                this.cognome,
                this.numero_di_auto,
                this.salario,
                this.coniuge!=null?this.coniuge.clone():null
        );
    }










/*
    byte     //def 0            Byte            //def null
    short    //def 0            Short           //def null
    int      //def 0            Integer         //def null
    long     //def 0            Long            //def null
    char     //def '\u0000'     Chararcter      //def null
    boolean  //def  false       Boolean         //def null
    double   //def  0.0         Double          //def null
    float    //def  0.0f        Float           //def null
*/

}//end class
