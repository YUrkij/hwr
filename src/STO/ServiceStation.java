package STO;

import STO.Transport.Transport;
import STO.Transport.Truck;

public class ServiceStation {

    private int cash = 0;


    void servTransport(Transport transport){
        transport.service();
        this.cash += transport.get_price();
    }

    public void getCash() {
        System.out.println("\nСТО зараболало " + cash + " условных денежных единиц.");
    }
}
