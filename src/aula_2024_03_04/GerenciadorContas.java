package aula_2024_03_04;

public class GerenciadorContas {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1, 2_300d);
        ContaPoupanca cp = new ContaPoupanca(2, 5_600d);

        System.out.println(cc);
        System.out.println(cp);

        System.out.println(transferir(cc, cp, 400.13));

        System.out.println(cc);
        System.out.println(cp);
    }

    private static <T extends Conta> boolean transferir(T origem, T destino, double valor) {
        if (valor < 0 || valor > origem.getSaldo()) {
            return false;
        }

        origem.sacar(valor);
        destino.depositar(valor);

        return true;
    }

}
