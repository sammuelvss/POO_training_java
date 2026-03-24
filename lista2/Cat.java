package lista2;

public class Cat extends Animal {

    public Cat(long id, int age, double weight) {
        super(id, "Whiskers", age, weight);
        this.addAbility("agility");
    }

    @Override
    public String sound() {
        return "meow";
    }
}