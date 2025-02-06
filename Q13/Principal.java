package Q13;

public class Principal {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        
        zoo.adicionar(new Cachorro());
        zoo.adicionar(new Galinha());
        zoo.adicionar(new Gato());
        zoo.adicionar(new Papagaio());
        
        System.out.println("Animais no zoológico: " + zoo.contarAnimais());
        zoo.animarBicharada();
        zoo.alimentarAnimais();
    }
}
