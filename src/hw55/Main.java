package hw55;

import hw55.passwords.InvalidPasswordException;
import hw55.passwords.PasswordChecker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(AECatcher.divide(5, 2));
        System.out.println(AECatcher.divide(1, -1));
        System.out.println(AECatcher.divide(5, 0)); // Я не знаю почему это работает. Java просто выдаёт Infinity.

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BELAZ", 2013));
        cars.add(new Car("Moscvitz", 2002));
        cars.add(new Car("Unnown", 2020));

        CarManager carManager = new CarManager(cars);
        try {
            System.out.println(carManager.getCar("BELAZ", 2013));
        } catch (CarNotFountExeption e) {
            System.out.println("Что-то не так : " + e.getLocalizedMessage());
        }

        try {
            System.out.println(carManager.getCar("Porsche", 2022));
        } catch (CarNotFountExeption e) {
            System.out.println("Что-то не так : " + e.getLocalizedMessage());
        }

        String[] passwords = {"MyPassword123", "ffffff66", "ShlechtPass", "aSdf3h", "avalanche gt2020"};

        for (String pass : passwords) {
            try {
                System.out.println(PasswordChecker.check(pass));
            } catch (InvalidPasswordException e) {
                System.out.println("Что-то не так : " + e.getLocalizedMessage());
            }
        }
    }
}
