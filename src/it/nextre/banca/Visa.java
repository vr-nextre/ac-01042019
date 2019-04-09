package it.nextre.banca;

public class Visa extends Carta {

    private static final String circuit = "VISA";


    public Visa(String code, String cvv, String expire, String owner) {
        super(code, cvv, expire, owner, circuit,0);
    }

    @Override
    public boolean paga(double price, String toIban) {
        if(super.amount>=price) {
            System.out.println("Pagamento su circuito " + circuit);
            System.out.println("Tentativo di trasferimento di " + price + "€");
            System.out.println("DA:\t" + this.getCode());
            System.out.println("A :\t" + toIban);
            System.out.println("Contatto IP: 192.168.0.254");
            if (Math.random() * 10 < 0.3) {
                System.out.println("PAGAMENTO KO");
                return false;
            }
            System.out.println("PAGAMENTO OK");
            return true;
        }
        return false;
    }

    String cvv = "XXX";

    public void setCvv(String cvv){
        this.cvv=cvv;
    }

    @Override
    public String toString() {
        return "Visa{" +
                "code='" + getCode().substring(0, getCode().length()-4)+"****" + '\'' +
                ", cvv='" + getCvv() + '\'' +
                ", expire='" + getExpire() + '\'' +
                ", owner='" + getOwner() + '\'' +
                ", circuit='" + circuit + '\'' +
                '}';
    }
}//end class
