package Q11;

public class Pessoa implements Desenho {
    private String nome;
    
    public Pessoa() {
        this.nome = "Pessoa";
    }

    public String getNome() {
        return nome;
    }

    public void desenhar() {
        System.out.println("Desenhando uma " + nome);
    }
}