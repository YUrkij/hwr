package hw3940.obj;

import java.util.Objects;

public class House {
    private final Integer floorCount;
    private final Integer roomCount;
    private final Boolean isGarageExist;

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

    @Override
    public int hashCode() {
        return Objects.hash(floorCount, roomCount, isGarageExist);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        House home = (House) obj;
        Integer hash = hashCode();
        Integer obHash = hashCode();
        return floorCount.equals(home.floorCount) && roomCount.equals(home.roomCount) && isGarageExist.equals(home.isGarageExist) && hash.equals(obHash);
    }




}
