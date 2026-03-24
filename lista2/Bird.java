package lista2;

public class Bird extends Animal {
    public Bird(long id, int age, double weight) {
        super(id, "twitte", age, weight);
        this.addAbility("fly");
    }

    @Override
    public String sound() {
        return "piu";
    }
}