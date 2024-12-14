package hw55;

import java.util.List;

public class CarManager {
    private final List<Car> cars;

    public CarManager(List<Car> cars) {
        this.cars = cars;
    }

    public Car getCar(String model, int year) {
        for (Car car : cars) {
            if (car.getModel().equals(model) && car.getYear() == year) {
                return car;
            }
        }
        throw new CarNotFountExeption("Машина с папраметрами : model - " + model + ", year - " + year + " не найдена");
    }
}
