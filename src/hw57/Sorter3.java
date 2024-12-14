package hw57;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorter3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "fig", "date", "kiwi", "grape");

        List<String> newList = words.stream()
                .filter(s -> s.length() > 4)
                .map(String::toUpperCase)
                .sorted(Comparator.comparing(String::length))
                .toList();
        System.out.println(newList);

    }
}
