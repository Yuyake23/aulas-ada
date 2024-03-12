package aula_2024_02_19;

import java.util.StringJoiner;

public class ContaBancaria {

    private Double saldo;
    private String senha;

    public Double getSaldo() {
        return saldo;
    }

    public void sacar(Double valor){
        if (valor < 0){
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }
        if (valor > this.saldo){
            throw new RuntimeException("Saldo insuficiente.");
        }

        this.saldo -= valor;
    }

    public void depositar(Double valor){
        if (valor < 0){
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }

        this.saldo += valor;
    }

    public void trocarSenha(String senhaAtual, String novaSenha) {
        if (!senha.equals(this.senha)){
            throw new RuntimeException("Senha incorreta");
        }
        this.senha = novaSenha;
    }

}
