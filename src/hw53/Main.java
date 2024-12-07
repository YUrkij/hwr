package hw53;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import static hw53.UniqueElements.getUniqueElements;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int target = 35;
        int[] result = ClosestNumbers.findClosestNumbers(numbers, target);
        System.out.println("Ближайшие числа " + target + ": " + Arrays.toString(result));

        target = 55;
        result = ClosestNumbers.findClosestNumbers(numbers, target);
        System.out.println("Ближайшие числа " + target + ": " + Arrays.toString(result));

        target = 5;
        result = ClosestNumbers.findClosestNumbers(numbers, target);
        System.out.println("Ближайшие числа " + target + ": " + Arrays.toString(result));

        target = 25;
        result = ClosestNumbers.findClosestNumbers(numbers, target);
        System.out.println("Ближайшие числа " + target + ": " + Arrays.toString(result));


        int[] emptyNumbers = {};

        result = ClosestNumbers.findClosestNumbers(emptyNumbers, target);
        System.out.println("Ближайшие числа " + target + ": " + Arrays.toString(result));

        int[] someNumbers = {1, 2, 3, 2, 1, 4};
        Set<Integer> unique = getUniqueElements(someNumbers);
        System.out.println(unique);

        String[] words = {"apple", "banana", "apple", "cherry", "banana", "date", "apple"};
        LinkedHashSet<String> resultLHS = (LinkedHashSet<String>) UniqueElements.getOrderedUniqueElements(words);
        System.out.println("Уникальные эллементы в порядке добавления: " + resultLHS);


        String[] words2 = {};
        resultLHS = (LinkedHashSet<String>) UniqueElements.getOrderedUniqueElements(words2);
        System.out.println("Уникальные эллементы в порядке добавления: " + resultLHS);


        String[] words3 = {"apple", "apple", "apple", "apple"};
        resultLHS = (LinkedHashSet<String>) UniqueElements.getOrderedUniqueElements(words3);
        System.out.println("Уникальные эллементы в порядке добавления: " + resultLHS);


    }
}
