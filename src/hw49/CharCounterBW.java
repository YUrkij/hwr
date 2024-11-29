package hw49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharCounterBW extends Counter {

    /**
     * curString - Текущая строока в обработке
     * charCount - Хэшмапа к каждому в ней слову
     */
    private String curString;
    private Map<String, HashMap<Character, Integer>> charCount = new HashMap<>();

    public CharCounterBW(String curString) {
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
        String[] words = curString.replaceAll("[^a-zA-Z\\\\s]", "").toLowerCase().split("\\s+");
        for (String word : words) {
            HashMap<Character, Integer> counts = new HashMap<>();
            for (char ch : word.toCharArray()) {
                counts.put(ch, counts.getOrDefault(ch, 0) + 1);
            }
            charCount.put(word, counts);
        }
    }

    @Override
    public boolean hasUniqueSymbol() {

        for (HashMap<Character, Integer> HM : charCount.values()) {
            for (Character ch : HM.keySet()) {
                if (HM.get(ch) == 1) {
                    if (checkUnique(ch)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean checkUnique(Character key) {
        int keyCount = 0;
        for (HashMap<Character, Integer> HM : charCount.values()) {
            for (Character ch : HM.keySet()) {
                if (ch == key) {
                    keyCount++;
                    if (keyCount > 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public double mediumSum() {
        double charValue = 0;
        List<Character> charList = new ArrayList<>();
        for (HashMap<Character, Integer> HM : charCount.values()) {
            for (Character ch : HM.keySet()) {
                if (!charList.contains(ch)) {
                    charList.add(ch);
                }
                charValue += HM.get(ch);
            }
        }
        return charValue / charList.size();
    }
}
