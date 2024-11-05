package STO.Transport;

abstract class MotorTransport extends WheeledTransport{
    private String fuelType;

    public MotorTransport(int wheelCount, float maxSpeed, String fuelType) {
        super(wheelCount, maxSpeed);
        this.fuelType = fuelType;
    }

    @Override
    public void service() {
        super.service();
        System.out.print(", " + fuelType + " двигатель");
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

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
