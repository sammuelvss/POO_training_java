package lista2;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public ArrayList<Animal> listAnimals() {
        return this.animals;
    }

    public boolean removeAnimal(long id) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getId() == id) {
                animals.remove(i);
                return true;
            }
        }
        return false;
    }
}