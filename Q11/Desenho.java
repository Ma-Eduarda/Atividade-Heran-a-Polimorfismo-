package Q11;

interface Desenho {
    void desenhar();
    String getNome();
}



/* 
11. Explique onde está acontecendo o polimorfismo no código criado:
O polimorfismo acontece porque usamos a interface Desenho para tratar diferentes classes (Retangulo, Circulo, Quadrado, Pessoa) de forma igual. 
Isso permite guardar todos na mesma lista e chamar desenhar(), sem precisar saber qual é o tipo exato. 
Cada classe executa seu próprio método desenhar().
*/