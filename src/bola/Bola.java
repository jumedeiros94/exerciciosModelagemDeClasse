package bola;

public class Bola {
    String cor;
    String material;
    String marca;
    Double velocidade;
    Double circunferencia;

    public Bola (String cor, String material, String marca, Double velocidade, Double circunferencia) {
        this.cor = cor;
        this.material = material;
        this.marca = marca;
        this.velocidade = velocidade;
        this.circunferencia = circunferencia;
    }

    public void trocaCor(String novaCor){
        this.cor = novaCor;
    }

    public String mostraCor() {
        return this.cor;
    }
}
