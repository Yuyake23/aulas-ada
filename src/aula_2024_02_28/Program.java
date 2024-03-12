package aula_2024_02_28;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Program {

    public static void main(String[] args) {

        Supplier<Integer> fibonacci = new Supplier<>() {

            private int a = 0;
            private int b = 1;

            @Override
            public Integer get() {
                int aux = b;
                this.b += this.a;
                this.a = aux;
                return a;
            }
        };
        Consumer<Supplier<?>> printer = s -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(s.get());
            }
        };

        printer.accept(fibonacci);

    }

}
