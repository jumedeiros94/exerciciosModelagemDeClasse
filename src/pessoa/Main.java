package pessoa;

public class Main {
    public static void main(String[] args) {
       Pessoa pessoas = new Pessoa("Juliana", 18, 1.50, 58.0);

       pessoas.envelhecer(2);
        System.out.println("Você envelheceu! Sua idade agora é: " + pessoas.idade + " anos");

        pessoas.engordar(2.5);
        System.out.println("Você engordou, seu novo peso é: " + pessoas.peso + " KG");

        pessoas.emagrecer(3.0);
        System.out.println("Você emagreceu, seu novo peso: " + pessoas.peso + " KG");

        pessoas.crescer(3);
        System.out.println("Você cresceu: " + pessoas.altura + " cm");

    }
}