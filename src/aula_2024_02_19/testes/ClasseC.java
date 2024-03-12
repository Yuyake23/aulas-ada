package aula_2024_02_19.testes;

public class ClasseC extends ClasseB {

    @Override
    public void imprimir() {
        super.imprimir(); // Pega o da ClasseB
        System.out.println("ClasseC chamou ^");
//        super.super.imprimir(); // Não funciona
//        ClasseA.super.imprimir(); // Não funciona
    }

    public void runDump() {
        new ClasseInterna().dump();
    }

    class ClasseInterna {
        void dump() {
            ClasseC.this.imprimir();
            ClasseC.super.imprimir();
//            ClasseB.super.imprimir(); // Não funciona
        }
    }

}
