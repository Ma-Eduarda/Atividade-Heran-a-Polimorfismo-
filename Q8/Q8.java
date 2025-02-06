package Q8;

/*
8. Qual é a relação existente entre as classes definidas pelo usuário com a classe 
Object?

Toda classe definida pelo usuário herda implicitamente da classe Object.
Isso significa que todas as classes em Java têm uma relação com a classe Object, que é a classe base para todas as outras classes.
A classe Object oferece métodos básicos para todas as classes, como Carro, que herda métodos como toString(), e outros automaticamente, mesmo sem declarar nada.

*/

class Carro {
    String modelo;

    Carro(String modelo) {
        this.modelo = modelo;
    }
}

