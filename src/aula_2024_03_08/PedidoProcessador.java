package aula_2024_03_08;

import java.util.List;

public class PedidoProcessador {

    public double calcularTotal(List<? extends Item> itens) {
        double valorTotal = 0d;
        for (Item item : itens) {
            valorTotal += item.preco;
        }
        return valorTotal;
    }

    public double calcularTotal(List<? extends Item> itens, double porcentagemDesconto){
        return calcularTotal(itens) * (1 - porcentagemDesconto);
    }

}
