package bola;

public class Main {
    public static void main(String[] args) {
        Bola bolas = new Bola("Branca", "Couro", "Adidas", 2.5, 7.5);

        System.out.println(bolas.mostraCor());

        bolas.trocaCor("Azul");

        System.out.println(bolas.mostraCor());
    }
}
