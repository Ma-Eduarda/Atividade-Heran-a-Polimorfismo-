package Q10;

// Sobrecarga de Métodos (Overloading): Quando criamos métodos com o mesmo nome, mas com parâmetros diferentes.

class Calculadora {
    int somar(int a, int b) {
        return a + b;
    }

    int somar(int a, int b, int c) {
        return a + b + c;
    }
}