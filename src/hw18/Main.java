package hw18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        exer1(str);
        exer2(str);
        long a = sc.nextLong();
        exer3(a);
    }

    public static void exer1(String str){
        StringBuilder sbild = new StringBuilder();
        for (int i = str.length() - 1; i > (str.length() / 2); i--){
        sbild.append(str.charAt(i));
    }
    if (str.startsWith(sbild.toString())){
        System.out.println("Палиндром");
    } else {
        System.out.println("Не палиндром");
    }
}

    public static void exer2(String str){

        boolean isPalindrom = true;
        for (int i = 0; i < (str.length() / 2); i++){
            if (str.charAt(i) != str.charAt(((str.length() - 1) - i))){
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom){
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }

    public static void exer3(long n){

        int leng = 0;
        while ( Math.pow(10,leng) < n ){
            leng++;
            System.out.println(Math.pow(10,leng));
        }
        for (int i = 1; i <= (leng / 2); i++){
            long current_count = (long) ((n % Math.pow(10,i)) / Math.pow(10,i - 1));
            n = (long) (n - ((Math.pow(10,i - 1) * current_count) + (Math.pow(10,leng - i) * current_count)));
        }
        if (leng % 2 == 1){
            long current_count = (long) ((n % Math.pow(10,(leng / 2) + 1)) / Math.pow(10,(leng / 2)));
            n = (long) (n - (Math.pow(10,leng / 2) * current_count));
        }
        if (n != 0){
            System.out.println("Не палиндром");
        } else {
            System.out.println("Палиндром");
        }
    }

}
