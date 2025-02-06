package Q11;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeDesenhos {
    private List<Desenho> desenhos = new ArrayList<>();

    public void adicionarDesenho(Desenho d) {
        desenhos.add(d);
        System.out.println(d.getNome() + " adicionado ao cadastro.");
    }

    public void desenharTodos() {
        System.out.println("\nDesenhando todos os itens cadastrados:");
        for (Desenho d : desenhos) {
            d.desenhar();
        }
    }
}
