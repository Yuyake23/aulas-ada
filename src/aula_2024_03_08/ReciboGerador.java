package aula_2024_03_08;

import java.util.List;
import java.util.function.BiFunction;

public class ReciboGerador {

    public void imprimirRecibo(List<? extends Item> itens, double valorTotal) {
        for (Item item : itens) {
            System.out.println(item.nome + ": " + item.preco);
        }
        System.out.println("Total: " + valorTotal);
    }

}

