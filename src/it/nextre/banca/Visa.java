package it.nextre.banca;

public class Visa extends Carta {

    private static final String circuit = "VISA";


    public Visa(String code, String cvv, String expire, String owner) {
        super(code, cvv, expire, owner, circuit);
    }

    @Override
    public boolean paga(double price, String toIban) {
        System.out.println("Pagamento su circuito "+circuit);
        System.out.println("Tentativo di trasferimento di "+price+"€");
        System.out.println("DA:\t"+this.getCode());
        System.out.println("A :\t"+toIban);
        System.out.println("Contatto IP: 192.168.0.254");
        if(Math.random()*10<0.3){
            System.out.println("PAGAMENTO KO");
            return false;
        }
        System.out.println("PAGAMENTO OK");
        return true;
    }


    @Override
    public String toString() {
        return "******SECRET******";
    }
}//end class
