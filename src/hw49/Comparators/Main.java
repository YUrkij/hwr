package hw49.Comparators;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        String[] names = {"Jhon", "Simon", "Jane", "Oleg", "Vilhelmiina", "Zoe", "Yuyun", "Stanislav"};
        String[] countrs = {"USSR", "USA", "FRG", "GDR", "Cuba", "GB", "SFRY"};
        String[] nationalitys = {"Czech", "Polish", "Mongolian", "Chinese", "Armenian"};
        List<Spy> spys = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            String name = names[rnd.nextInt(names.length)];
            String country = countrs[rnd.nextInt(countrs.length)];
            String nationality = nationalitys[rnd.nextInt(nationalitys.length)];
            spys.add(new Spy(nationality, name, country));
        }
        System.out.println(spys);
        Collections.sort(spys, new SpyCountryComparator());
        System.out.println(spys);
        Collections.sort(spys, new SpyNameComparator());
        System.out.println(spys);
    }
}
