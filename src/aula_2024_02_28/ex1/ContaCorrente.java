package aula_2024_02_28.ex1;

public class ContaCorrente {

    private String agencia;
    private String conta;
    private Double saldo;

    public ContaCorrente(String agencia, String conta, Double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public ContaCorrente() {
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
