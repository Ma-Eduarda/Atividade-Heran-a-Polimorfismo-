package Q13;

import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animais;
    
    public Zoologico() {
        this.animais = new ArrayList<>();
    }
    
    public void adicionar(Animal animal) {
        animais.add(animal);
    }
    
    public void animarBicharada() {
        for (Animal animal : animais) {
            animal.andar();
            animal.emitirSom();
        }
    }
    
    public void alimentarAnimais() {
        for (Animal animal : animais) {
            animal.alimentar();
        }
    }
    
    public int contarAnimais() {
        return animais.size();
    }
}