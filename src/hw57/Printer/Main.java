package hw57.Printer;

public class Main {
    public static void main(String[] args) {
        Printer anonPrinter = new Printer() {
            @Override
            public void print(String str) {
                System.out.println("anonPrinter says: " + str);
            }
        };
        anonPrinter.print("Реализация с анонимным классом");

        Printer lmbPrinter = str -> System.out.println("lmbPrinter says: ");
        lmbPrinter.print("Реализация с лямбда выражением");

        Printer lmbAnotherPrinter = str -> {
            System.out.println("lmbPrinter says: ");
            System.out.println("длинна этого сообщения " + str.length() + " символов");
        };
        lmbAnotherPrinter.print("Реализация с лямбда выражением в блоке");
    }
}
