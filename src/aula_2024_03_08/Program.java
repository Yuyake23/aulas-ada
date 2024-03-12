package aula_2024_03_08;

public class Program {

    public static void main(String[] args) {
        ReciboGerador reciboGerador = new ReciboGerador();
        PedidoProcessador pedidoProcessador = new PedidoProcessador();

        Pedido pedido = new Pedido();
        pedido.adicionarItem("Arroz 5kg", 39.90);
        pedido.adicionarItem("Sabonete 185g", 3.99);


        reciboGerador.imprimirRecibo(
                pedido.itens,
                pedidoProcessador.calcularTotal(pedido.itens, .15));
    }

}
