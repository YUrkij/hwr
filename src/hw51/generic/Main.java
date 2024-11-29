package hw51.generic;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("String");
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(100);
        Box<Boolean> nullBox = new Box<>();

        System.out.println(stringBox);
        System.out.println(integerBox);
        System.out.println(nullBox);
        System.out.println();
        System.out.println("stringBox.isEmpty() = " + stringBox.isEmpty());
        System.out.println("integerBox.isEmpty() = " + integerBox.isEmpty());
        System.out.println("nullBox.isEmpty() = " + nullBox.isEmpty());
        System.out.println();
        if (nullBox.isEmpty()) {
            nullBox.setValue(true);
            System.out.println(nullBox.getValue());
        }
        System.out.println();
        System.out.println("Очищаем строки");
        stringBox.clear();
        integerBox.clear();
        nullBox.clear();
        System.out.println("stringBox.isEmpty() = " + stringBox.isEmpty());
        System.out.println("integerBox.isEmpty() = " + integerBox.isEmpty());
        System.out.println("nullBox.isEmpty() = " + nullBox.isEmpty());
        System.out.println();

    }
}
