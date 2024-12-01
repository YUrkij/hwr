package hw53;

import java.util.NavigableSet;
import java.util.TreeSet;

public class ClosestNumbers {
    /**
     * @param numbers - массив чисел
     * @param target  - число
     * @return масив int[]{lower, higher}. При невозможности найти чило возвращает всесто него target.
     */
    public static int[] findClosestNumbers(int[] numbers, int target) {
        NavigableSet<Integer> treeSet = new TreeSet<>();
        for (int number : numbers) {
            treeSet.add(number);
        }

        Integer lower = treeSet.lower(target);
        Integer higher = treeSet.higher(target);

        if (lower == null && higher == null) {
            return new int[]{target, target};
        } else if (lower == null) {
            return new int[]{target, higher};
        } else if (higher == null) {
            return new int[]{lower, target};
        } else {
            return new int[]{lower, higher};
        }
    }
}