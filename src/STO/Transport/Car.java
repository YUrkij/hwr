package STO.Transport;

public class Car extends MotorTransport{
    private String mark;
    private String model;

    public Car(int wheelCount, float maxSpeed, String fuelType, String mark, String model) {
        super(wheelCount, maxSpeed, fuelType);
        this.mark = mark;
        this.model = model;
    }

    @Override
    public void service() {
        super.service();
        System.out.print(",в машине модели " + model + ", марки " + mark);
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

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
