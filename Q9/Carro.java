package Q9;

/* 
9. Explique os métodos da classe Object, dê exemplos de uso.  

A classe Object é a superclasse de todas as classes em Java. Ela contém vários métodos que podem ser usados ou sobrescritos em qualquer classe.

toString() - Retorna uma representação em texto do objeto
equals(Object obj) - Compara dois objetos para verificar se são iguais
hashCode() - Retorna um código numérico único para o objeto
getClass() - Retorna a classe do objeto
clone() - Cria uma cópia do objeto (precisa implementar Cloneable)
finalize() - Chamado antes do objeto ser removido da memória

*/

//Por padrão, toString() retorna o nome da classe + um código hexadecimal do objeto. Podemos sobrescrevê-lo para exibir outras informações.

class Carro {
    String modelo;
    
    Carro(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Modelo do carro: " + modelo;
        }
}


