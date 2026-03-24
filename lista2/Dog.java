package lista2;

public class Dog extends Animal {
    public Dog(long id, int age, double weight) {
        super(id, "buddy", age, weight);
        this.addAbility("sniff");
    }

    @Override
    public String sound() {
        return "au";
    }
}