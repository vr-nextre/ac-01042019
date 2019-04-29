package it.nextre;

public class Es001 {
    public static void main(String[] args) {
        Elaboratore e1 = new Elaboratore();

        assert e1.semplifica("1234567891234567").equals("1234-5678-9123-4567") : "Errore 1";
        assert e1.semplifica("1234567891234567").length()==19 : "errore 2";
        assert e1.semplifica("123456789123456").equals("bad data") : "errore 2.1";
        assert e1.semplifica("12345678912345678").equals("bad data") : "errore 2.2";
        assert e1.semplifica("").equals("0000-0000-0000-0000") : "errore 2.3";
        assert e1.semplifica("abcdefgh12345678").equals("bad data") : "errore 2.4";

        assert e1.verifica("1234567891234567")==3 : "Errore 3";
        assert e1.stilizza("xxx1234567").length()==13 : "Errore 4";
        assert e1.stilizza("xxx1234567").equals("xxx-123 45 67") : "Errore 5";
        assert e1.stilizza("xxx").equals("invalid") : "Errore 6";
        assert e1.stilizza("xxxx").equals("invalid") : "Errore 6";
        assert e1.stilizza("xxxxx").equals("invalid") : "Errore 6";
        assert e1.stilizza("xxxxxx").equals("invalid") : "Errore 6";
        assert e1.stilizza("xxxxxxx").equals("invalid") : "Errore 6";
        assert e1.stilizza("xx").equals("+xx") : "Errore 7";

        assert e1.avanti(2)==4  : "Errore 8";
        assert e1.avanti(4)==8  : "Errore 8";
        assert e1.avanti(6)==12  : "Errore 8";
        assert e1.avanti(8)==16  : "Errore 8";
        assert e1.avanti(10)==0  : "Errore 9";
        assert e1.avanti(-10)==0  : "Errore 9";
        assert e1.avanti(-8)==0  : "Errore 9";
        assert e1.avanti(-1)==0  : "Errore 9";
        assert e1.avanti(0)==0  : "Errore 10";
        assert e1.avanti(1)==1  : "Errore 11";
        assert e1.avanti(3)==-3  : "Errore 12";
        assert e1.avanti(5)==-5  : "Errore 12";
        assert e1.avanti(7)==-7  : "Errore 12";
        assert e1.avanti(9)==-9  : "Errore 12";
    }//end main
}//end class

class Elaboratore {
    public String semplifica(String s) {
        return "xxxx-xxxx-xxxx-xxxx";
    }

    public int verifica(String s) {
        return 0;
    }

    public String stilizza(String s) {
        return null;
    }

    public int avanti(int i) {
        return 0;
    }
}