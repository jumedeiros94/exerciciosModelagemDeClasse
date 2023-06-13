package jardinagem;

public class Jardinagem {

    String nomeJardim;
    Integer qtdPlantas;
    Double qtdMetros, qtdMetrosGrama, gramaAdubo, valorAdubo, valorMetroGrama, valorCorteGrama;

    public Jardinagem(String nomeJardim, Integer qtdPlantas, Double qtdMetros, Double qtdMetrosGrama, Double gramaAdubo,
                      Double valorAdubo, Double valorMetroGrama, Double valorCorteGrama) {

        this.nomeJardim = nomeJardim;
        this.qtdPlantas = qtdPlantas;
        this.qtdMetros = qtdMetros;
        this.qtdMetrosGrama = qtdMetrosGrama;
        this.gramaAdubo = gramaAdubo;
        this.valorAdubo = valorAdubo;
        this.valorMetroGrama = valorMetroGrama;
        this.valorCorteGrama = valorCorteGrama;
    }

        public double usarAdubo() {
            return (qtdMetrosGrama / 2) * 100;
        }

        public Double precoAdubo(Double valorAdubo) {
            return usarAdubo() * valorAdubo;
        }

        public Double precoCorteGrama() {
            return qtdMetrosGrama * valorMetroGrama;
        }
    }



