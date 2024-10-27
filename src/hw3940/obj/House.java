package hw3940.obj;

public class House {
    private final int floorCount;
    private final int roomCount;
    private final boolean isGarageExist;

    private House(Builder builder) {
        this.floorCount = builder.floorCount;
        this.isGarageExist = builder.isGarageExist;
        this.roomCount = builder.roomCount;
    }

    @Override
    public String toString() {
        return "Здание имеет " + floorCount + " этажей " +
                roomCount + " комнат и " +
                ((isGarageExist) ? "" : "не") + "имеет гараж";
    }

    public static class Builder {
        private int floorCount;
        private int roomCount;
        private boolean isGarageExist;

        public Builder floorCount(int num){
            this.floorCount = num;
            return this;
        }

        public Builder roomCount(int num){
            this.roomCount = num;
            return this;
        }

        public Builder isGarageExist(boolean bool){
            this.isGarageExist = bool;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }

}
