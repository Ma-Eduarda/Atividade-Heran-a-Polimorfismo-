package Q12;

public class Principal {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();
        
        Empregado a = new Assalariado("João", "Silva", "111111111", 3000);
        Empregado c = new Comissionado("Maria", "Santos", "222222222", 10000, 0.10);
        Empregado h = new Horista("Carlos", "Ferreira", "3333333333", 20, 160);
        
        folha.adicionarFuncionario(a);
        folha.adicionarFuncionario(c);
        folha.adicionarFuncionario(h);
        
        folha.exibirTodos();
        System.out.println("Valor total da folha de pagamento: R$ " + folha.calcularValorTotal());
    }
}