package it.nextre.banca;

public abstract class Carta {

    private String code;
    private String cvv;
    private String expire;
    private String owner;

    private String circuit;

    double amount;  //usata dai figli
    //non tutte le carte sono ricaricabili!!!!


    public Carta(String code, String cvv, String expire, String owner, String circuit, double amount) {
        this.code = code;
        this.cvv = cvv;
        this.expire = expire;
        this.owner = owner;
        this.circuit = circuit;
        this.amount=amount;
    }

    public String getCode() {
        return code;
    }

    public String getCvv() {
        return cvv;
    }

    public String getExpire() {
        return expire;
    }

    public String getOwner() {
        return owner;
    }

    public String getCircuit() {
        return circuit;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "code='" + code + '\'' +
                ", cvv='" + cvv + '\'' +
                ", expire='" + expire + '\'' +
                ", owner='" + owner + '\'' +
                ", circuit='" + circuit + '\'' +
                '}';
    }

    public abstract boolean paga(double price, String toIban);

}//end class
