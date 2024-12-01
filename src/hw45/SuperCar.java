package hw45;

import java.util.Objects;

abstract public class SuperCar implements Comparable {
    static protected int carCount = 1;
    protected final Integer ID;

    protected SuperCar(Integer id) {
        ID = id;
    }

    public Integer getID() {
        return ID;
    }

    public static int getCarCount() {
        return carCount;
    }

    public static void whenCarAdded() {
        carCount++;
    }

    @Override
    public int compareTo(Object o) {
        SuperCar car = (SuperCar) o;
        return ID.compareTo(car.getID());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SuperCar car = (SuperCar) obj;
        return Objects.equals(ID, car.getID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
