package aula_2024_02_21.ex2;

public class Gerente extends Funcionario {

    {
        this.salario *= 7.2;
    }

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
        System.out.printf("Salário do gerente: R$ %.2f%n", salario);
    }

}
