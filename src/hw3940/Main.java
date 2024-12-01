package hw3940;

import hw3940.obj.House;

import java.util.ArrayList;
import java.util.List;

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
                .floorCount(2)
                .roomCount(5)
                .isGarageExist(false)
                .build();


        House house4 = new House.Builder()
                .floorCount(8)
                .roomCount(95)
                .isGarageExist(false)
                .build();

        List<House> listOfHouses = new ArrayList<>();
        listOfHouses.add(house1);
        listOfHouses.add(house2);
        listOfHouses.add(house3);
        listOfHouses.add(house4);


        House house5 = new House.Builder()
                .floorCount(16)
                .roomCount(180)
                .isGarageExist(false)
                .build();

        for (House house : listOfHouses) {
            System.out.println(house + ((house.equals(house1)) ? " = " : " != ") + house1);
            System.out.println(house + ((house.equals(house2)) ? " = " : " != ") + house2);
            System.out.println(house + ((house.equals(house3)) ? " = " : " != ") + house3);
            System.out.println(house + ((house.equals(house4)) ? " = " : " != ") + house4);
        }

        if (listOfHouses.contains(house5)){
            System.out.println(house5 + " есть в списке по индексу " + listOfHouses.indexOf(house5));
        }

        if (listOfHouses.contains(house2)){
            System.out.println(house2 + " есть в списке по индексу " + listOfHouses.indexOf(house2));
        }


    }
}
