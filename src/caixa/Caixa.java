package caixa;

public class Caixa {

    Double saldo, credito, debito;

    public Caixa(){
        this.saldo = 1000.00;
        this.credito = 0.0;
        this.debito = 0.0;
    }

    public void credito(double valor) {
        this.credito += valor;
        this.saldo += valor;
    }

    public void debito(double valor) {
        this.debito += valor;
        this.saldo -= valor;
    }

    public double saldoFinal(){
        return saldo;
    }
}
