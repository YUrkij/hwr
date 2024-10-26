package hw34;

import hw34.animals.*;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Рекс"),
                new Cat("Варежка"),
                new Bird("Чижик", true),
                new Bird("Эму",false)
        };

        for (Animal animal : animals){
            animal.makeSound();
            animal.move();
            animal.eat();

            if (animal instanceof Pet){
                ((Pet) animal).play();
                ((Pet) animal).beFrendly();
            }
            System.out.println();
        }
    }
}
