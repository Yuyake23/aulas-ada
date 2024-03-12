package aula_2024_02_21.ex2;

public class Diretor extends Funcionario {

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double calcularSalario(){
        return salario;
    }

    public void exibirDetalhes(){
        System.out.printf("Salário do diretor: R$ %.2f%n", salario);
    }

}
