package aula_2024_03_04;

import java.util.Objects;

public class ContaPoupanca implements Conta {


    private int numeroConta;
    private double saldo;

    public ContaPoupanca(int numeroConta, double saldo){
        if (saldo < 0) {
            throw new IllegalArgumentException("O saldo não pode ser negativo.");
        }
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    @Override
    public boolean depositar(double valor) {
        if (valor <= 0)
            return false;
        this.saldo += valor;
        return true;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0 || valor > this.saldo) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaPoupanca that = (ContaPoupanca) o;
        return numeroConta == that.numeroConta && Double.compare(saldo, that.saldo) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroConta, saldo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContaPoupanca{");
        sb.append("numeroConta=").append(numeroConta);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }
}
