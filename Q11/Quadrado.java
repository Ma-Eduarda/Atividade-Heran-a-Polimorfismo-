package Q11;

public class Quadrado implements Desenho {
    private String nome;

    public Quadrado() {
        this.nome = "Quadrado";
    }

    public String getNome() {
        return nome;
    }

    public void desenhar() {
        System.out.println("Desenhando um " + nome);
    }
}