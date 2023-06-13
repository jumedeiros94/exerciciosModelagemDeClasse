package caixa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Caixa caixa = new Caixa();

        System.out.println("Quantos lançamentos deseja fazer? ");
        int numLancamentos = entrada.nextInt();

        for (int i = 0; i < numLancamentos; i++){
            System.out.println("Digite 1 para crédito ou 2 para débito: ");
            int opcao = entrada.nextInt();

            System.out.println("Digite o valor: ");
            double valor = entrada.nextDouble();

            if (opcao == 1){
                caixa.credito(valor);
            } else if (opcao == 2) {
                caixa.debito(valor);

            }
        }

        System.out.println("Saldo final: " + caixa.saldoFinal());
    }
}
