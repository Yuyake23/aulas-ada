package aula_2024_03_04;

import java.util.Arrays;

public class CopiadorLista {

    public static void main(String[] args) {
        String[] lista = {"Olá", "Bom dia", "Tudo bem?", "Até logo"};
        System.out.println(Arrays.toString(copiar(lista)));
    }

    @SuppressWarnings("unchecked")
    private static <T> T[] copiar(T[] lista){
        if (lista == null) {
            return null;
        }
        T[] novaLista = (T[]) new Object[lista.length];
        System.arraycopy(lista, 0, novaLista, 0, lista.length);
        return novaLista;
    }

}
