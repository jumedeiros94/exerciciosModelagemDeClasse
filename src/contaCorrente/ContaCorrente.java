package contaCorrente;

public class ContaCorrente {

    Integer numeroDaConta;
    String nomeDoCorrentista;
    Double saldo;

    public ContaCorrente(Integer numeroDaConta, String nomeDoCorrentista, Double saldo){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = saldo;
    }

    public ContaCorrente(Integer numeroDaConta, String nomeDoCorrentista){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = 0.0;
    }

    public void depositoConta (Double valor){

            this.saldo += valor;
    }

    public void saqueConta (Double valor){
           if (valor <= this.saldo) {
               this.saldo -= valor;
           }else {
               System.out.println("Saldo insuficiente!");
           }
        }
    }


