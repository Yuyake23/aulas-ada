package aula_2024_03_08;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    List<Item> itens = new ArrayList<>();

    public void adicionarItem(String nome, double preco) {
        this.itens.add(new Item(nome, preco));
    }

}