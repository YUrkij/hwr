package hw20;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        zadacha1();
        zadacha2();
        zadacha3();
        zadacha4();
        zadacha5();

    }

    public static void zadacha1(){
        //среднее арефмитическое элементов массива
        //задаю массив
        Random rnd = new Random();
        int leng = rnd.nextInt(2, 31);
        int[] array = new int[leng];
        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(0, 301);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //решение
        long sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println(sum + " / " +  array.length + " = " + (sum / array.length));
        System.out.println();
    }

    public static void zadacha2(){
        //минимальное и максимальное значение элементов массива
        //задаю массив
        Random rnd = new Random();
        int leng = rnd.nextInt(2, 31);
        double[] array = new double[leng];
        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextDouble(-150, 151);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //решение
        int max = 0;
        int min = 0;
        for (int i = 1; i < array.length; i++){
            if (array[max] < array[i]){
                max = i;
            } else if (array[min] > array[i]) {
                min = i;
            }
        }
        System.out.println("Минимальный элемент с индексом " + min + " равен " + array[min]);
        System.out.println("Максимальный элемент с индексом " + max + " равен " + array[max]);
        System.out.println();
    }

    public static void zadacha3(){
        //кол-во глассных в массиве
        //задаю массив
        Random rnd = new Random();
        int leng = rnd.nextInt(6, 46);
        char[] array = new char[leng];
        for (int i = 0; i < array.length; i++){
            char simb = (char) ('a' + rnd.nextInt(0, 26));
            boolean isUpCase = rnd.nextBoolean();
            if (isUpCase){
                simb = (char) (('A' - 'a') + simb) ;
            }
            array[i] = simb;
            System.out.print(simb);
        }
        System.out.println();
        //решение
        int vowelCount = 0;
        for (int i = 0; i < array.length; i++){
            char simb = Character.toLowerCase(array[i]);
            if (simb == 'a'|| simb == 'e'|| simb == 'i' || simb == 'o' || simb == 'u'){
                vowelCount++;
            }
        }
        System.out.println("Кол-во гласных - " + vowelCount);
        System.out.println();
    }

    public static void zadacha4(){
        //Перевести строку в массив, затем заменить " " на "_"

        String str = "Hello World This Is Java";
        char[] array = new char[str.length()];
        //перевод
        for (int i = 0; i < str.length(); i++){
            array[i] = str.charAt(i);
        }
        //замена
        for (int i = 0; i < str.length(); i++){
            if (array[i] == ' '){
                array[i] = '_';
            }
        }
        for (int i = 0; i < str.length(); i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }


    public static void zadacha5(){
        //Перевести строку в массив строк
        String str = "Hello, World, This, Is, Java";
        String[] words = str.split(",");
        for (int i = 0; i < words.length; i++){
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }
}
