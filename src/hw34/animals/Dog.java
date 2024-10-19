package hw34.animals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " ест кость");
    }

    @Override
    public String makeSound() {
        return name + " says Гав-Гав";
    }
}
