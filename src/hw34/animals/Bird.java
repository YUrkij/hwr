package hw34.animals;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " ест зёрна");
    }

    @Override
    public String makeSound() {
        return name + " says Чирик-чирик";
    }
}
