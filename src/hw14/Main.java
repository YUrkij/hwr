package hw14;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        zadacha1(n);
        n = sc.nextInt();
        zadacha2(n);
        zadacha3();
    }

    public static void zadacha1(int n) {
        for (int i = 1; i < n; i += 2){
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    public static void zadacha2(int n) {
        long x = 1;
        for (int i = 1; i < n; i++){
            x *= i;
            System.out.print(i + " * ");
        }
        System.out.print(n + " = " + x);
        System.out.print("\n");
    }

    public static void zadacha3() {
        for (int i = 0; i <= 10; i++){
            for (int j = 0; j <= 10; j++){
                System.out.print("  ");
                if ((j == 0 ^ i ==0)){
                    if ((i+j) < 10){
                        System.out.print("  " + (i + j));
                    } else {
                        System.out.print(" " + (i + j));
                    }
                } else if (i+j == 0) {
                    System.out.print("  *");
                } else if (i * j < 10) {
                    System.out.print("  " + (i * j));
                }else if (i * j < 100) {
                    System.out.print(" " + (i * j));
                }else{
                    System.out.print("" + (i * j));
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
