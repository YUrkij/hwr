package hw34.animals;

public class Dog extends Animal implements Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " бегает");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест кость");
    }

    @Override
    public void makeSound() {
    }

    @Override
    public void play() {
        System.out.println(name + " бегает за палкой");
    }

    @Override
    public void beFrendly() {
        System.out.println(name + " дружелюбно лает");
    }
}
