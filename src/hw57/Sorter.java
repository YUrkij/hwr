package hw57;

import java.util.*;

public class Sorter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Аннтон", "Борис", "Владимир", "Григорий", "Давид", "Дэвид");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(names);

        Collections.shuffle(names);
        System.out.println(names);

        names.sort(((o1, o2) -> o2.compareTo(o1)));
        System.out.println(names);
    }
}
