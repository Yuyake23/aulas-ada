package aula_2024_02_21.ex1;

import java.util.List;

public class Program {

    public static void main(String[] args) {
        Veiculo[] veiculos = {new Veiculo(), new Carro(), new Moto(), new Bicicleta()};

        for (Veiculo v : veiculos) {
            v.acelerar();
            v.frear();
        }

    }

}
