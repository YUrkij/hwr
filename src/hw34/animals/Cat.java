package hw34.animals;

public class Cat extends Animal implements Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " бегает");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест рыбу");
    }

    @Override
    public void makeSound() {
    }

    @Override
    public void play() {
        System.out.println(name + " играет с мышкой");
    }

    @Override
    public void beFrendly() {
        System.out.println(name + " мурчит");
    }
}
