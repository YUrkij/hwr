package hw3940;

import hw3940.obj.House;

public class Main {
    public static void main(String[] args) {
        House house1 = new House.Builder()
                .floorCount(2)
                .roomCount(5)
                .isGarageExist(true)
                .build();


        House house2 = new House.Builder()
                .floorCount(8)
                .roomCount(95)
                .isGarageExist(false)
                .build();


        House house3 = new House.Builder()
                .floorCount(1)
                .roomCount(3)
                .isGarageExist(false)
                .build();
        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house3);

    }
}
