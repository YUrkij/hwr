package STO.Transport;

public interface Transport {
    static final int PRICE = 1;

    void service();
    default int get_price(){
        return PRICE;
    }
}
