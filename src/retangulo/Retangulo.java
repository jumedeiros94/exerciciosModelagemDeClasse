package retangulo;

public class Retangulo {

    Double comprimento, largura;

    public Retangulo(Double comprimento, Double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public void mudarValorcomprimento(Double novoComprimento) {
        this.comprimento = novoComprimento;
    }

    public void mudarValorLargura(Double novaLargura) {
        this.largura = novaLargura;
    }

    public double retornarValorComprimento() {
        return comprimento;
    }

    public double retornarValorLargura() {
        return largura;
    }

    public double calcularArea() {
        return  comprimento * largura;
    }

    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }
}
