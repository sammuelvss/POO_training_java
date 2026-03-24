
package lista2;

import java.util.ArrayList;

public abstract class Animal { // Abstract pois cada bicho tem seu som
    private long id;
    private String name;
    private int age;
    private double weight;
    private ArrayList<String> abilities = new ArrayList<>();

    public Animal(long id, String name, int age, double weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void addAbility(String ability) {
        this.abilities.add(ability);
    }

    public abstract String sound();

    public String performAbility(String ability) {
        if (abilities.contains(ability)) {
            return this.name + " can " + ability;
        } else {
            return this.name + " can't " + ability;
        }
    }

    public long getId() {

        return this.id;

    }

    public void setId(long id) {

        this.id = id;

    }

    public String getName() {

        return this.name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getAge() {

        return this.age;

    }

    public void setAge(int age) {

        this.age = age;
    }

    public double getWeigth() {

        return this.weight;

    }

    public void setWeigth(double weight) {

        this.weight = weight;

    }
    // Adicione os getters aqui (getId, getName, etc)
}