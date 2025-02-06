package Q12;

import java.util.HashSet;
import java.util.Set;

public class FolhaDePagamento {
    private Set<Empregado> funcionarios = new HashSet<>();

    public void adicionarFuncionario(Empregado emp) {
        if (funcionarios.add(emp)) {
            System.out.println(emp.getNome() + " adicionado à folha de pagamento.");
        } else {
            System.out.println("Funcionário já está na folha de pagamento.");
        }
    }

    public void exibirTodos() {
        System.out.println("\nLista de Funcionários:");
        for (Empregado emp : funcionarios) {
            System.out.println(emp.getNome() + " - Vencimento: R$ " + emp.vencimento());
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Empregado emp : funcionarios) {
            total += emp.vencimento();
        }
        return total;
    }
}

/* 
O polimorfismo na FolhaDePagamento, onde a lista armazena objetos de diferentes tipos de Empregado.
O método vencimento() é chamado dinamicamente, executando a versão correta para cada tipo de empregado.
*/