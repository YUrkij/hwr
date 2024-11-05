package STO;

import STO.Transport.Transport;
import STO.Transport.Truck;

public class ServiceStation {

    private int cash = 0;


    void servTransport(Transport transport){
        transport.service();
        this.cash++;
        if (transport.getClass().equals(Truck.class)){
            this.cash++;
        }
    }

    public void getCash() {
        System.out.println("\nСТО зараболало " + cash + " условных денежных единиц.");
    }
}
