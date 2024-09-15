package hw16;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        zadacha1();
        zadacha2();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        System.out.print(zadacha3(str1));

    }

    public static void zadacha1() {
        String text = "1q23we111a";
        int lettersCount = 0;
        int lettersUpCase = 0;
        int digitsCount = 0;
        int digitsUpperFive = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                lettersCount++;
                if (Character.isUpperCase(text.charAt(i))){
                    lettersUpCase++;
                }
            } else if (Character.isDigit(text.charAt(i))) {
                digitsCount++;
                if (4 < Character.getNumericValue(text.charAt(i))) {
                    digitsUpperFive++;
                }
            }
        }
        System.out.print("В строке :'" + text + "' " + lettersCount + " символов (из которых " + lettersUpCase + "в верхнем регистре и ");
        System.out.print((lettersCount - lettersUpCase) + " в нижнем), " + digitsCount + " чисел(из которых " + digitsUpperFive + " от 5 до 9 и ");
        System.out.print((lettersCount - lettersUpCase) + " от 0 до 4) и " + (text.length() - (lettersCount + digitsCount)) + " других символов\n");
    }

    public static void zadacha2() {
        String text = "I like Java!!!";
        System.out.println("Собственно строка : " + text);
        System.out.println("Последний символ строки : " +text.charAt(text.length() - 1));
        System.out.println("Заканчивается ли строка подстрокой '!!!'? : " + text.endsWith("!!!"));
        System.out.println("Начинается ли строка подстрокой 'I like'? : " + text.startsWith("I like"));
        System.out.println("Содержит ли строка подстрокоу 'Java'? : " + text.contains("Java"));
        System.out.println("Индекс начала подстрокои 'Java' : " + text.indexOf("Java"));
        text = text.replace('a','o');
        System.out.println("Собственно строка после замены: " + text);
        text = text.toUpperCase();
        System.out.println("Собственно строка в верхнем регистре: " + text);
        text = text.toLowerCase();
        System.out.println("Собственно строка в нижнем регистре: " + text);
        System.out.print("\n");
    }

    public static String zadacha3(String str1) {
        if (str1.length()  % 2 == 0){
        return str1.substring(((str1.length()/2) - 1), ((str1.length()/2) + 1));
        }
        return "Введена строка с нечётным кол-вом символов";
    }

}
