package aula_2024_02_19;

public class Produto {

    private Double preco;

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }

        this.preco = preco;
    }

}
