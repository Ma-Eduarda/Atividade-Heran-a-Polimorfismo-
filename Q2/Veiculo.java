package Q2;
// 2. Defina herança e apresente situações em que a mesma pode ser útil.

public class Veiculo {
    private String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}

class Carro extends Veiculo {
    private int ano;

    public Carro(int ano, String marca) {
        super(marca);
        this.ano = ano;
    }

    public void mostrarMarca() {
        System.out.println("Marca do carro: " + getMarca());
    }
}