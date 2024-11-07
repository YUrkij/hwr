package STO.Transport;

public final class Truck extends MotorTransport{
    private int overWeight;

    static final int PRICE = 2;


    public Truck(int wheelCount, float maxSpeed, String fuelType, int overWeight) {
        super(wheelCount, maxSpeed, fuelType);
        this.overWeight = overWeight;
    }

    @Override
    public void service() {
        super.service();
        System.out.print(",в грузовике грузоподъёмностью " + overWeight);
    }

    @Override
    public int getWheelCount() {
        return super.getWheelCount();
    }

    @Override
    public void setWheelCount(int wheelCount) {
        super.setWheelCount(wheelCount);
    }

    @Override
    public float getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public void setMaxSpeed(float maxSpeed) {
        super.setMaxSpeed(maxSpeed);
    }

    @Override
    public String getFuelType() {
        return super.getFuelType();
    }

    @Override
    public void setFuelType(String fuelType) {
        super.setFuelType(fuelType);
    }

    @Override
    public int get_price() {
        return PRICE;
    }

    public int getOverWeight() {
        return overWeight;
    }

    public void setOverWeight(int overWeight) {
        this.overWeight = overWeight;
    }
}
