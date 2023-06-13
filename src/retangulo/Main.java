package retangulo;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(12.0, 6.0);

        System.out.println("O comprimento inicial é: " + retangulo.comprimento);
        System.out.println("A largura inicial é: " + retangulo.largura);

        Double area = retangulo.calcularArea();
        System.out.println("O calculo da area é: " + area);

        Double perimetro = retangulo.calcularPerimetro();
        System.out.println("O calculo do perimetro é: " + perimetro);

        retangulo.mudarValorcomprimento(20.0);
        System.out.println("Mudamos o valor do comprimento, o novo valor é: " + retangulo.comprimento);

        retangulo.mudarValorLargura(10.0);
        System.out.println("Também mudamos o valor da largura, seu novo valor é: " + retangulo.largura);
    }
}
