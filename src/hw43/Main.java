package hw43;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        List<Integer> linkList = new LinkedList<>();
        addToList(arrList);
        addToList(linkList);
        findRand(arrList);
        findRand(linkList);
    }

    public static void addToList(List<Integer> list) {
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i, i);
        }
    }

    public static void findRand(List<Integer> list) {
        Random rnd = new Random();
        int b = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            b = rnd.nextInt(0, 1_000_000);
            b = list.get(b);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения - " + (endTime - startTime) + " миллисекунд");
    }
}
