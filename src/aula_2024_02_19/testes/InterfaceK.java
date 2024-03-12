package aula_2024_02_19.testes;

import java.util.Arrays;
import java.util.List;

public interface InterfaceK extends InterfaceX, InterfaceY {

    @Override
    default void imprimir() {
        InterfaceY.super.imprimir();
        InterfaceX.super.imprimir();
    }

    default void maisUmMetodo(){
        List.of("Hello!").forEach(s -> {
            InterfaceX.super.imprimir();
            InterfaceY.super.imprimir();
            InterfaceK.this.imprimir();
        });
    }

}