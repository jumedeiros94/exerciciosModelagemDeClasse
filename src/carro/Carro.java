package carro;

public class Carro {
    String modelo;
    String marca;

    Integer qntDePortas;
    Double potencia;


    public Carro(String modelo, String marca, Integer qntDePortas, Double potencia) {
        this.modelo = modelo;
        this.marca = marca;
        this.qntDePortas = qntDePortas;
        this.potencia = potencia;
    }

    public Carro(String modelo, String marca, Integer qntDePortas) {
        this.modelo = modelo;
        this.marca = marca;
        this.qntDePortas = qntDePortas;
        this.potencia = 2.0;
    }

    public void ligar() {
        System.out.println("Carro ligado!");
    }
}
