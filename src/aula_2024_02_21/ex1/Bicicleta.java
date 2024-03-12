package aula_2024_02_21.ex1;

public class Bicicleta extends Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Acelerando bicicleta");
    }

    @Override
    public void frear() {
        System.out.println("Freando bicicleta");
    }

}
