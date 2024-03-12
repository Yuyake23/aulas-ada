package aula_2024_03_11;

public class ContaCorrente extends ContaBancaria {
    private double taxaManutencao;

    public ContaCorrente(double saldoInicial, double taxaManutencao) {
        super(saldoInicial);
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + taxaManutencao);
    }

    public void imprimirFatura() {
        System.out.println("Imprimindo fatura da conta corrente!");
    }

    public void imprimirInformacoes() {
        this.imprimirFatura();
        super.imprimirInformacoes();
    }

}