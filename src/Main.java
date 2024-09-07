import java.util.Random;
import java.util.Scanner;


public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Random rnd = new Random();

                System.out.println("Добро пожаловать в кофейный аппарат!");
                System.out.println("Код воспринимает только символы в верхнем регистре, указанные в скобках.");
                System.out.println("Вы хотите приготовить кофе? (Д/Н)");
                String answer = sc.next();

                if (answer.equals("Д")) {
                    System.out.println("Начало приготовления кофе");

                    // Подготовка ингредиентов
                    String coffee = "кофе";
                    String water = "воды";
                    String sugar = "сахаром";
                    String milk = "молоком";
                    String spinach = "шпинат";

                    // Измельчение кофе
                    System.out.println("Измельчение кофе...");
                    coffee = "Измельченный " + coffee;

                    // Нагревание воды
                    System.out.println("Нагревание воды...");
                    boolean isNotBoild = true;
                    int temperature = 15;
                    while (temperature < 110 & isNotBoild){
                        System.out.println("Текущая температура "+ water + " " + temperature + "°C");
                        System.out.println("Нагреть её? (Д/Н)");
                        answer = sc.next();
                        if (answer.equals("Д")){
                            temperature += rnd.nextInt(10) + 20;
                        } else if (answer.equals("Н")){
                            isNotBoild = false;
                        } else {
                            System.out.println("Неверный формат ответа");
                        }

                    }
                    String temp;
                    if (temperature >= 110) {
                        System.out.println("Вся вода выкипела");
                        water = "святого духа";
                        temp = "Сухой";
                    } else if (temperature >= 75) {
                        water = "горячей " + water;
                        temp = "Горячий";
                    } else if (temperature >= 40) {
                        water = "тёплой " + water;
                        temp = "Тёплый";
                    } else {
                        water = "холодной " + water;
                        temp = "Холодный и плохозаваренный ";
                    }

                    // Заваривание кофе
                    System.out.println("Заваривание кофе с помощью " + water);
                    coffee = temp + coffee;


                    // Процеживание кофе
                    System.out.println("Хотите ли вы процеживать кофе? (Д/Н)");
                    answer = sc.next();
                    if (answer.equals("Д")) {
                        System.out.println("Процеживание кофе...");
                        coffee = "Процеженный " + coffee;
                    }

                    // Добавление сахара, молока и шпината (по желанию)
                    boolean thShugar = false;
                    System.out.println("Хотите ли вы добавить сахар? (Д/Н)");
                    answer = sc.next();
                    if (answer.equals("Д")) {
                        System.out.println("Добавление сахара ...");
                        coffee = coffee + " с " + sugar;
                        thShugar = true;
                    }
                    System.out.println("Хотите ли вы добавить молоко? (Д/Н)");
                    answer = sc.next();
                    if (answer.equals("Д")) {
                        System.out.println("Добавление молока...");
                        if (thShugar) {
                            coffee = coffee + " и " + milk;
                        }else {
                            coffee = coffee + " с " + milk;
                        }
                    }
                    System.out.println("Хотите ли вы добавить шпината? (Д/Н)");
                    answer = sc.next();
                    if (answer.equals("Д")) {
                        System.out.println("Добавление шпината...");
                            coffee = coffee + " в который вы зачем то добавили " + spinach;
                    }
                    // Перемешивание
                    System.out.println("Перемешивание кофе...");
                    coffee = "Перемешанный " + coffee;

                    // Подача кофе
                    System.out.println("Ваш кофе готов! Вы приготовили: " + coffee);
                } else if (answer.equals("Н")){
                    System.out.println("Ок, может быть в следующий раз.");
                } else {
                    System.out.println("Ошибка, введён неверный символ");
                }
            }
        }
