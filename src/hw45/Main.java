package hw45;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    static String[] colors = {"Black", "Gray", "Wight", "Rad", "Brown"};
    static Integer[] years = {2020, 2021, 2022, 2023, 2024};
    static String[] models = {"Lada", "Volga", "Audi", "BELAZ", "Moskovitz"};
    static Random rnd = new Random();

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            addCar(cars);
        }
        cars.forEach(System.out::println);
        Collections.sort(cars);
        System.out.println();
        cars.forEach(System.out::println);

        Car car1 = new Car("Lada", 2020, "Black");
        Car car2 = new Car("Lada", 2020, "Black");
        Car car3 = new Car("Lada", 2004, "Black");
        Car car4 = car1;
        System.out.println("car1.equals(car2) = " + car1.equals(car2));
        System.out.println("car1.equals(car3) = " + car1.equals(car3));
        System.out.println("car3.equals(car2) = " + car3.equals(car2));
        System.out.println("car1.equals(car4) = " + car1.equals(car4));

        System.out.println("car1.hashCode() = " + car1.hashCode());
        System.out.println("car2.hashCode() = " + car2.hashCode());
        System.out.println("car3.hashCode() = " + car3.hashCode());
        System.out.println("car4.hashCode() = " + car4.hashCode());


    }

    public static void addCar(List<Car> cars) {
        int col = rnd.nextInt(0, 5);
        int year = rnd.nextInt(0, 5);
        int mod = rnd.nextInt(0, 5);
        cars.add(new Car(models[mod], years[year], colors[col]));
    }
}
