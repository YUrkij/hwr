package STO.Transport;

abstract class WheeledTransport implements Transport{
     private int wheelCount;
     private float maxSpeed;

    public WheeledTransport(int wheelCount, float maxSpeed) {
        this.wheelCount = wheelCount;
        this.maxSpeed = maxSpeed;
    }

    public void service(){
        System.out.print("\nОбслужено колёс - "+ wheelCount);
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
