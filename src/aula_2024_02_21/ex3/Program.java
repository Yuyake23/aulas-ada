package aula_2024_02_21.ex3;

import aula_2024_02_21.ex3.Animal;
import aula_2024_02_21.ex3.AnimalDomestico;

public class Program {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        AnimalDomestico ad1 = new AnimalDomestico();

        a1.comer();
        a1.emitirSom();
        ad1.comer();
        ad1.emitirSom();
        ad1.dormir();
        ad1.brincar();

        Animal copiaAd1 = ad1;
        copiaAd1.comer();
        copiaAd1.emitirSom();
//        copiaAd1.dormir(); // Não funciona
//        copiaAd1.brincar(); // Não funciona
    }

}
