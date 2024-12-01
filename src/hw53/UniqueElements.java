package hw53;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueElements {

    public static Set<Integer> getUniqueElements(int... numbers) {
        Set<Integer> unN = new HashSet<>();
        for (int num : numbers) {
            unN.add(num);
        }
        return unN;
    }

    /**
     * @param words - набор строк
     * @return Set<String> - Последовательность уникальных эллементов в порядке их добавления
     */
    public static Set<String> getOrderedUniqueElements(String... words) {
        return new LinkedHashSet<>(Arrays.asList(words));
    }
}