package aula_2024_02_28.ex1;

public interface OperacoesContaCorrente {

    boolean depositar(ContaCorrente contaCorrente, double valor);

    boolean sacar(ContaCorrente contaCorrente, double valor);

    default void imprimirSaldo(ContaCorrente contaCorrente){
        System.out.printf("Saldo da conta %s: R$ %.2f%n", contaCorrente.getConta(), contaCorrente.getSaldo());
    }

    default boolean transferencia(ContaCorrente contaOrigem, ContaCorrente contaDestino, double valor){
        boolean saque = this.sacar(contaOrigem, valor);
        if (!saque) {
            return false;
        }

        boolean deposito = this.depositar(contaDestino, valor);
        if (!deposito){
            this.depositar(contaOrigem, valor);
            return false;
        }

        return true;
    }

}
