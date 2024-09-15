package cw12;

import java.util.Scanner;

public class FuzzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        variant1(n);
        variant2(n);
        variant3(n);
        variant4(n);
    }

    public static void variant1(int n) {
        // Жёсткий вариант
        for(int i = 1; i <= n; i++){
            switch ((i % 15)){
                case 3, 6, 9, 12 : {
                    System.out.print("Fuzz");
                    break;
                }
                case 5, 10 : {
                    System.out.print("Buzz");
                    break;
                }
                case 0 : {
                    System.out.print("FuzzBuzz");
                    break;
                }
                default:{
                    System.out.print(i);
                    break;
                }
            }
            System.out.print(" ");
        }
        System.out.print("\n");
    }

    public static void variant2(int n) {
        // Вариант с 1 большой строкой
        for(int i = 1; i <= n; i++){
            String s = "";
            if (i % 3 == 0){
                s += "Fuzz";
            }
            if (i % 5 == 0){
                s += "Buzz";
            }
            if (s.equals("")){
                s += i;
            }
            System.out.print(s + " ");
        }
        System.out.print("\n");
    }

    public static void variant3(int n) {
        // Вариант с if'ом
        for (int i = 1; i <= n; i++){
            if (i % 15 == 0){
                System.out.print("FuzzBuzz");
            } else
            if (i % 3 == 0){
                System.out.print("Fuzz");
            } else
            if (i % 5 == 0){
                System.out.print("Buzz");
            } else {
                System.out.print(i);
            }
            System.out.print(" ");
        }
        System.out.print("\n");
    }

    public static void variant4(int n) {
        // Вариант с 3 маленькими строками
        for (int i = 1; i <= n; i++){
            String numero = Integer.toString(i);
            String fuzz = "";
            String buzz = "";
            if (i % 3 == 0){
                fuzz = "Fuzz";
                numero = "";
            }
            if (i % 5 == 0){
                buzz = "Buzz";
                numero = "";
            }
            System.out.print(numero + fuzz + buzz + " " );
        }
        System.out.print("\n");
    }
    public static void variant5(int n) {
        // Вариант с
        for (int i = 1; i <= n; i++){
            String numero = Integer.toString(i);
            System.out.print(numero + " " );
        }
        System.out.print("\n");
    }
}
