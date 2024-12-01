package hw49;

import java.util.HashMap;
import java.util.Map;

public class CharCounter extends Counter {
    /**
     * curString - Текущая строока в обработке
     * charCount - Хэшмапа к ней
     */
    private String curString;
    private Map<Character, Integer> charCount = new HashMap<>();

    public CharCounter(String curString) {
        setCurString(curString);
    }

    @Override
    public void setCurString(String curString) {
        if (curString == null) {
            System.out.println("Полученна null строка.");
            return;
        }
        this.curString = curString;
        charCount.clear();
        fillHashMap();
    }

    @Override
    protected void fillHashMap() {
        for (char ch : curString.replaceAll("[^a-zA-Z\\\\s]", "").toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }
        }
    }

    @Override
    public boolean hasUniqueSymbol() {
        for (Integer val : charCount.values()) {
            if (val == 1) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double mediumSum() {
        double currentValue = 0;
        double charValue = 0;
        for (Integer val : charCount.values()) {
            currentValue++;
            charValue += val;
        }
        return charValue / currentValue;
    }

    @Override
    public String toString() {
        return "CharCounter{" +
                "charCount=" + charCount +
                '}';
    }

    /**
     * Инвертирует и выводить мапу Значение : Ключ
     */
    public void reverseHashMap() {
        Map<Integer, Character> rev = new HashMap<>();
        for (Character ch : charCount.keySet()) {
            rev.put(charCount.get(ch), ch);
        }
        System.out.println(rev);
    }
}
