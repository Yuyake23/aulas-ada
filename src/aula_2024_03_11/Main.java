package aula_2024_03_11;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaCorrente = new ContaCorrente(1000, 10);
        ContaBancaria contaPoupanca = new ContaPoupanca(2000, 0.05);

        realizarDepositoESaque(contaCorrente);
        System.out.println();
        realizarDepositoESaque(contaPoupanca);

    }

    public static void realizarDepositoESaque(ContaBancaria conta) {
        conta.sacar(100);
        conta.depositar(400);

        conta.fazerFechamento();
    }


}