package quadrado;

public class Main {
    public static void main(String[] args) {

        Quadrado quadradro = new Quadrado(4.0);

        System.out.println("O valor do lado é: " + quadradro.lado);

        quadradro.mudarValorLado(6);

        double lado = quadradro.retornarValorLado();

        double area = quadradro.calcularArea();

        System.out.println("O novo valor do lado é: " + lado);

        System.out.println("O calculo da area é: " + area);


    }
}
