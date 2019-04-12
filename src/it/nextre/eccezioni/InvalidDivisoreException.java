package it.nextre.eccezioni;

public class InvalidDivisoreException extends Exception{
    public InvalidDivisoreException(){
        this("InvalidDividisoreException!");
    }
    public InvalidDivisoreException(String mex){
        super(mex);
    }
}
