package contaCorrente;

public class Main {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente(120610, "Juliana", 800.00);

        ContaCorrente conta2 = new ContaCorrente(10890, "Bento", 700.00);

        conta1.depositoConta(500.00);
        System.out.println("Seu saldo é de R$" + conta1.saldo);

        conta2.saqueConta(300.00);
        System.out.println("Seu saldo é de R$" + conta2.saldo);

    }
}
