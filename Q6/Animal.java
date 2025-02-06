package Q6;

/* 
6. Cite particularidades das classes abstratas.  

Não podem ser instanciadas: Você não pode criar um objeto diretamente de uma classe abstrata.
Métodos abstratos: Podem conter métodos sem implementação, que devem ser implementados pelas subclasses.
Métodos concretos: Podem ter métodos com implementação (não são obrigados a serem abstratos).
Herança: As subclasses devem implementar os métodos abstratos ou também serem abstratas.

*/


abstract class Animal {
    abstract void fazerSom(); // Método abstrato

    void dormir() { // Método concreto
        System.out.println("Dormindo...");
    }
}