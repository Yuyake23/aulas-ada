package aula_2024_02_21.ex1;

public class Carro extends Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Acelerando carro");
    }

    @Override
    public void frear(){
        System.out.println("Freando carro");
    }

}
