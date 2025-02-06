package Q7;

/*
7. Uma classe que estende uma classe abstrata pode deixar de implementar um dos 
seus métodos abstratos?  

Não, uma classe que estende uma classe abstrata não pode deixar de implementar os métodos abstratos. 
Se a subclasse não implementar todos os métodos abstratos da superclasse, ela também deverá ser declarada como abstrata.
 */

abstract class Animal {
    abstract void fazerSom(); 
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Au Au!");
    }
}

class Gato extends Animal {
    // Se a classe Gato não implementar 'fazerSom', ela deve ser abstrata
}
