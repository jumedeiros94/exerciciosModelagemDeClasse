package pessoa;

public class Pessoa {
    String nome;
    Integer idade;
    Double peso;
    Double altura;


    public Pessoa(String nome, Integer idade, Double altura, Double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public Pessoa(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = 0.0;

    }

    public void envelhecer(Integer anos) {
        this.idade += anos;
        if (idade < 21)
            crescer(0.5f);
        }

        public void engordar (Double kilos){
            this.peso += kilos;
        }

        public void emagrecer (Double kilosPerdidos){
            this.peso -= kilosPerdidos;
        }

        public void crescer (double altura){
            this.altura += altura;

        }
    }

