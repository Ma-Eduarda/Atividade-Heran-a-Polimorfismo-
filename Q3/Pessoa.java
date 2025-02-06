package Q3;

// 3. Defina subclasse e superclasse através de exemplos. 

public class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    void apresentar() {
        System.out.println("Meu nome é " + nome + ".");
    }
}

class Estudante extends Pessoa {
    String curso;

    public Estudante(String nome, String curso) {
        super(nome);  
        this.curso = curso;
    }

    void apresentar() {
        super.apresentar();
        System.out.println("Sou estudante de " + curso + ".");
    }
}
