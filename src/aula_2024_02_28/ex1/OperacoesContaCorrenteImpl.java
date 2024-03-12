package aula_2024_02_28.ex1;

public class OperacoesContaCorrenteImpl implements OperacoesContaCorrente {
    @Override
    public boolean depositar(ContaCorrente contaCorrente, double valor) {
        if (valor <= 0)
            return false;

        contaCorrente.setSaldo(contaCorrente.getSaldo() + valor);
        return true;
    }

    @Override
    public boolean sacar(ContaCorrente contaCorrente, double valor) {
        if (valor <= 0 || contaCorrente.getSaldo() < valor)
            return false;

        contaCorrente.setSaldo(contaCorrente.getSaldo() - valor);
        return true;
    }
}
