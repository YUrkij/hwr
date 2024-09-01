import java.util.Random;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                /*
                byte MyByte; //объявление
                MyByte = - 128; //инициализация

                short MyShort = 127;
                int MyInteger = 127_902;
                long MyLong = 3_000_000_000L;

                float MyFloat = 3.0f;
                double MyDouble = 3.0;

                char MyChar = 'a';
                char TestChar = '\n';

                String MyStrung = "Hi world!!!";
                boolean MyBool = true;


                System.out.println("Числовые : " + MyByte + " " + MyShort + " " + MyInteger + " " + MyLong);
                System.out.println("Дробные : " + MyFloat + " " + MyDouble);
                System.out.println("Знаковые + строка : " +MyChar + " " + TestChar + " " + MyStrung);
                System.out.println("Логические : " + MyBool);
                */
                // Пункт 1
                Scanner sc = new Scanner(System.in);
                System.out.print("Введите первое число для арифметических операций: ");
                int myInt1 = sc.nextInt();
                System.out.print("Введите первое число для арифметических операций: ");
                int myInt2 = sc.nextInt();
                System.out.println(myInt1 + " + " + myInt2 + " = " + (myInt1 + myInt2));
                System.out.println(myInt1 + " - " + myInt2 + " = " + (myInt1 - myInt2));
                System.out.println(myInt1 + " / " + myInt2 + " = " + (myInt1 / myInt2) + " Целочисленное деление");
                System.out.println(myInt1 + " % " + myInt2 + " = " + (myInt1 % myInt2) + " Остаток от деления");
                System.out.println(myInt1 + " / " + myInt2 + " = " + ((double) myInt1 / myInt2) + " Деление без остатка" + "\n");
                // Пункт 2
                Random rnd = new Random();
                myInt1 = rnd.nextInt(Character.MIN_CODE_POINT, Character.MAX_CODE_POINT);
                myInt2 = rnd.nextInt(Character.MIN_CODE_POINT, Character.MAX_CODE_POINT);
                int myInt3 = rnd.nextInt(Character.MIN_CODE_POINT, Character.MAX_CODE_POINT);
                int myInt4 = rnd.nextInt(Character.MIN_CODE_POINT, Character.MAX_CODE_POINT);
                char ch1 = (char) myInt1, ch2 = (char) myInt2, ch3 = (char) myInt3, ch4 = (char) myInt4;
                System.out.print(ch1);
                System.out.print(ch2);
                System.out.print(ch3);
                System.out.println(ch4);
                // Пункт 3
                long ln = Long.MAX_VALUE;
                myInt1 = (int) ln;
                System.out.println(ln + " : long");
                System.out.println(myInt1 + " : переполненный int");

            }
        }
