package hw34.animals;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " ест рыбу");
    }

    @Override
    public String makeSound(){
        return name + " says Мяу-Мяу";
    }

}
