package Q5;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro(4, "Toyota"); 
        System.out.println(meuCarro.marca);  // Herdado da superclasse
        meuCarro.acelerar();                 // Método sobrescrito na subclasse
        meuCarro.exibirPortas();             // Método exclusivo da subclasse
    }
}