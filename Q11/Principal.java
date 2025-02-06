package Q11;

public class Principal {
    public static void main(String[] args) {
        CadastroDeDesenhos cadastro = new CadastroDeDesenhos();

        Desenho r = new Retangulo();
        Desenho c = new Circulo();
        Desenho q = new Quadrado();
        Desenho p = new Pessoa();

        cadastro.adicionarDesenho(r);
        cadastro.adicionarDesenho(c);
        cadastro.adicionarDesenho(q);
        cadastro.adicionarDesenho(p);

        cadastro.desenharTodos();
    }
}
