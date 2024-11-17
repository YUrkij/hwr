package hw45;

import java.util.Objects;

public class Car extends SuperCar {
    private final String model;
    private final Integer year;
    private final String color;

    public Car(String model, Integer year, String color) {
        super(getCarCount());
        this.model = model;
        this.year = year;
        this.color = color;
        whenCarAdded();
    }

    @Override
    public Integer getID() {
        return super.getID();
    }

    @Override
    public int compareTo(Object obj) {
        Car car = (Car) obj;
        int modelCompare = this.model.compareTo(car.model);
        if (modelCompare != 0) {
            return modelCompare;
        }
        int yearCompare = this.year.compareTo(car.year);
        if (yearCompare != 0) {
            return yearCompare;
        }
        int colorCompare = this.color.compareTo(car.color);
        if (colorCompare != 0) {
            return colorCompare;
        }
        return super.compareTo(obj);
        /* Или просто
         * return getID().compareTo(car.getID())
         * */
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, color, super.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        if (Objects.equals(model, car.model) && Objects.equals(year, car.year) && Objects.equals(color, car.color)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", ID=" + ID +
                '}';
    }
}
