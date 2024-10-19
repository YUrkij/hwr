package hw34;

import hw34.animals.Animal;
import hw34.animals.Cat;
import hw34.animals.Dog;
import hw34.animals.Bird;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Animal[] animals = new Animal[7];
        for (int i = 0; i < 7; i++) {
            animals[i] = new Animal();
            String name = switch (rnd.nextInt(0, 3)) {
                case 0 -> "Cat";
                case 1 -> "Dog";
                case 2 -> "Bird";
                default -> "";
            };

            animals[i] = switch (name) {
                case "Cat" -> new Cat("Cat " + i);
                case "Dog" -> new Dog("Dog " + i);
                case "Bird" -> new Bird("Bird " + i);
                default -> new Animal();
            };
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(animals[i].makeSound());
        }
    }
}
