package STO.Transport;

public class Bicycle extends WheeledTransport{
    private String bicycleType;

    public Bicycle(int wheelCount, float maxSpeed, String bicycleType) {
        super(wheelCount, maxSpeed);
        this.bicycleType = bicycleType;
    }

    @Override
    public void service() {
        super.service();
    }

    @Override
    public void setMaxSpeed(float maxSpeed) {
        super.setMaxSpeed(maxSpeed);
    }

    @Override
    public float getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public void setWheelCount(int wheelCount) {
        super.setWheelCount(wheelCount);
    }

    @Override
    public int getWheelCount() {
        return super.getWheelCount();
    }

    public String getBicycleType() {
        return bicycleType;
    }

    public void setBicycleType(String bicycleType) {
        this.bicycleType = bicycleType;
    }

}
