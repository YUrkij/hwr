package hw51.immutable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(4, 3, 2, 1));
        MyMutableClass mmc = new MyMutableClass(10);
        ImmutableList iml = new ImmutableList("32 A 23", nums, mmc);


        Map<ImmutableList, String> map = new HashMap<>();
        map.put(iml, "Первый");
        for (ImmutableList i : map.keySet()) {
            System.out.println(map.get(i));
        }

        System.out.println(iml);
        iml.getName().replace(" ", "");
        System.out.println(iml);
        iml.getNumbers().add(2);
        System.out.println(iml);
        iml.getMmc().value = 200;
        System.out.println(iml);

        map.put(iml, "Всё ещё первый");
        for (ImmutableList i : map.keySet()) {
            System.out.println(map.get(i));
        }

        nums = List.of(1, 2, 3, 4);
        iml = new ImmutableList("32 A 23", nums, mmc);
        map.put(iml, "Уже другой");
        System.out.println();

        for (ImmutableList i : map.keySet()) {
            System.out.println(map.get(i));
        }
    }
}
