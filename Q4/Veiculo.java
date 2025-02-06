package Q4;

//4. Como acessar os atributos de uma classe e da sua superclasse?  

class Veiculo {
    String marca = "Toyota"; 
}

class Carro extends Veiculo {
    String marca;

    Carro(String marca) {
        this.marca = marca;
    }

    void exibirMarcas() {
        System.out.println("Marca do carro: " + this.marca);       // Acessa o atributo da subclasse
        System.out.println("Marca do veículo: " + super.marca); // Acessa o atributo da superclasse
    }
}