package Q11;

public class Circulo implements Desenho {
    private String nome;

    public Circulo() {
        this.nome = "Círculo";
    }

    public String getNome() {
        return nome;
    }

    public void desenhar() {
        System.out.println("Desenhando um " + nome);
    }
}
