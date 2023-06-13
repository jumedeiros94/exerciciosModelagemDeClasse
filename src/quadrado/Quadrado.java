package quadrado;
public class Quadrado {
    Double lado;

    public Quadrado (Double lado){
        this.lado = lado;
    }

    public void mudarValorLado(double novoLado){
        this.lado = novoLado;
    }

    public double retornarValorLado (){
        return this.lado;
    }

    public double calcularArea(){
        return this.lado * this.lado;
    }

}
