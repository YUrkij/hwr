package hw34.animals;

public class Bird extends Animal {

    final private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public void move() {
        if(canFly)
            System.out.println(name + " летает");
        else
            System.out.println(name + " бегает");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест зёрна");
    }

    @Override
    public void makeSound() {
    }

}
