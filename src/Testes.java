import aula_2024_02_19.testes.*;

public class Testes {
    public static void main(String[] args) {
        testarClasses();
    }

    private static void testarClasses(){
        var ca = new ClasseA();
        var cb = new ClasseB();
        var cc = new ClasseC();

        System.out.println(">>>> ClasseA.imprimir()");
        ca.imprimir();
        System.out.println("\n>>>> ClasseB.imprimir()");
        cb.imprimir();
        System.out.println("\n>>>> ClasseC.imprimir()");
        cc.imprimir();
        System.out.println("\n>>>> ClasseC.dump()");
        cc.runDump();
    }

    private static void testarInterfaces(){
        var ix = new InterfaceX(){};
        var iy = new InterfaceY(){};
        var ik = new InterfaceK(){};

        ix.imprimir();
        iy.imprimir();
        ik.imprimir();
    }

}