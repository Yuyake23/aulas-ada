package aula_2024_02_21.ex2;

public class Funcionario {

    protected Double salario = 1500d;

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
        System.out.printf("Salário do funcionário: R$ %.2f%n", salario);
    }

}
