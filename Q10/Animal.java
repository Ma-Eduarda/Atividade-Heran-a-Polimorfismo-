package Q10;



//Sobrescrita de Métodos (@Override): Quando uma subclasse muda o comportamento de um método da superclasse.


class Animal {
    void fazerSom() {
        System.out.println("Som de animal");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Au Au!");
    }
}



// Sobrecarga de Métodos (Overloading): Quando criamos métodos com o mesmo nome, mas com parâmetros diferentes.

/* 

class Calculadora {
    int somar(int a, int b) {
        return a + b;
    }

    int somar(int a, int b, int c) {
        return a + b + c;
    }
}

public class Q10 {
    
}
*/