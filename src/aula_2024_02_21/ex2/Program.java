package aula_2024_02_21.ex2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Program {

    public static void main(String[] args) {
        List<Funcionario> funcionarios =
                Arrays.asList(new Funcionario(), new Gerente(), new Diretor());

        funcionarios.forEach(Funcionario::exibirDetalhes);
    }

}
