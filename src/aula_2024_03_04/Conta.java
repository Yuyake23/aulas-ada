package aula_2024_03_04;

public interface Conta {

    boolean depositar(double valor);

    boolean sacar(double valor);

    double getSaldo();
}
