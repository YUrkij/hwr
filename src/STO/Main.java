package STO;

import STO.Transport.Bicycle;
import STO.Transport.Car;
import STO.Transport.Transport;
import STO.Transport.Truck;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car(4,120, "Дизельный","Volvo", "Volvo v8");
        Transport bike = new Bicycle(2, 40,"Горный");
        Transport truck = new Truck(4,120, "Дизельный",2000);
        ServiceStation sto = new ServiceStation();
        sto.servTransport(car);
        sto.servTransport(bike);
        sto.getCash();
        sto.servTransport(truck);
        sto.getCash();
    }
}
