package Q5;

//5. É possível herdar apenas alguns atributos ou métodos de uma superclasse quando uma subclasse a estende? Justifique.  

public class Carro {
    int portas;
    String marca;

    public Carro(int portas, String marca) {
        this.portas = portas;
        this.marca = marca;
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public void exibirPortas() {
        System.out.println("O carro tem " + portas + " portas.");
    }

    public void exibirMarcas() {
        System.out.println("A marca do carro é " + marca);
    }
}
/* 
Sim, a subclasse herda todos os atributos e métodos públicos da superclasse, 
mas não pode escolher quais herdar. Métodos privados não são acessíveis diretamente.
*/