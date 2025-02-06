package Q1;

// 1. Defina classe abstrata e apresente situações em que a mesma pode ser útil. 

abstract class Animal {

    abstract void fazerSom();

    void correr() {
        System.out.println("Correndo...");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Au Au!");
    }
}

class Gato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Miau!");
    }
}
