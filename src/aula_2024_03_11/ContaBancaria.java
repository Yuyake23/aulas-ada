package aula_2024_03_11;

public abstract class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirInformacoes(){
        System.out.println("Saldo da conta: " + this.getSaldo());
    }

    public void fazerFechamento(){
        this.imprimirInformacoes();
    }

}