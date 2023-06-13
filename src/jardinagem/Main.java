package jardinagem;

public class Main {
    public static void main(String[] args) {

        Jardinagem jardim = new Jardinagem("Jardim encantado", 40, 30.0, 20.0, 20.0,
                300.0, 5.0, 15.0);

        Double aduboUsado = jardim.usarAdubo();
        System.out.println(aduboUsado);

        Double precoAdubo = jardim.precoAdubo(5.0);
        System.out.println(precoAdubo);

        Double precoCorteGrama = jardim.precoCorteGrama();
        System.out.println(precoCorteGrama);

    }
}
