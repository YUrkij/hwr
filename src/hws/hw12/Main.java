package hws.hw12;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Пункт 1
        for (int age = 2; age <= 27; age++){
            System.out.print("Если возраст человека равен " + age +" то ему ");
            if (age <= 6){
                System.out.println("следует ходить в детский сад;");
            } else if (age <= 18) {
                System.out.println("нужно посещать школу;");
            } else if (age < 24) {
                System.out.println("следует учиться в университете;");
            } else {
                System.out.println("пора идти на работу;");
            }
        }
        //Пункт 2
        long dianaZap = 66_660L;
        long andreiZap = 77_770L;
        long mariaZap = 88_880L;
        System.out.println("Диана теперь получает " + (long) (dianaZap * 1.15) + " рублей. Годовой доход вырос на " + (((long) (dianaZap * 1.15) * 12) - (dianaZap * 12)) + " рублей");
        System.out.println("Андрей теперь получает " + (long) (andreiZap * 1.15) + " рублей. Годовой доход вырос на " + (((long) (andreiZap * 1.15) * 12) - (andreiZap * 12)) + " рублей");
        System.out.println("Мария теперь получает " + (long) (mariaZap * 1.15) + " рублей. Годовой доход вырос на " + (((long) (mariaZap * 1.15) * 12) - (mariaZap * 12)) + " рублей");
        //Пункт 3
        Scanner scan = new Scanner(System.in);
        int monthNumber = scan.nextInt();
        String seazon = switch (monthNumber) {
            case 1, 2, 12 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Неверный индекс месяца";
        };
        System.out.println(seazon);
    }
}

