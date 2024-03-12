package aula_2024_03_11;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(double saldoInicial, double taxaRendimento) {
        super(saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    private void aplicarRendimento() {
        saldo *= (1 + taxaRendimento);
    }

    public void fazerFechamento(){
        this.aplicarRendimento();
        super.fazerFechamento();
    }

}