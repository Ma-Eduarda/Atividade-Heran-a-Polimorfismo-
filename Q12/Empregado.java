package Q12;

public abstract class Empregado {
    protected String nome;
    protected String sobrenome;
    protected String cpf;
    
    public Empregado(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    
    public abstract double vencimento();
    
    public String getNome() {
        return nome;
    }
}