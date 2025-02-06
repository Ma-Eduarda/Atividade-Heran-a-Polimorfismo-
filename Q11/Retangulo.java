package Q11;

public class Retangulo implements Desenho {
    private String nome;

    public Retangulo() {
        this.nome = "Retângulo";
    }

    public String getNome() {
        return nome;
    }

    public void desenhar() {
        System.out.println("Desenhando um " + nome);
    }
}