package hw27;

import java.util.Random;

public class exr2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[rnd.nextInt(5, 20)];
        create(array);
        for (int i = 1; i < 11; i++) {
            System.out.println("Итерация номер " + i + ": ");
            rerandomazer(array);
        }
    }

    public static void create(int[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10, 300);
        }
        arrayShow(array);
    }


    public static void rerandomazer(int[] array) {
        int[] arr2 = array.clone();
        for (int i = 0; i < arr2.length - 1; i++) {
            if (arr2[i] >= arr2[i+1]){
                arr2[i] -= arr2[i+1];
            } else {
                arr2[i] += arr2[i+1];
            }
        }
        if (arr2[arr2.length - 1] >= array[0]){
            arr2[arr2.length - 1] -= array[0];
        } else {
            arr2[arr2.length - 1] += array[0];
        }
        System.out.print("Изначальный массив: ");
        arrayShow(array);
        System.out.print("Новый массив: ");
        arrayShow(arr2);
        System.out.print("Замена: ");
        change(array,arr2);
    }


    public static void change(int[] array,int[] arr2) {
        for (int i = 0; i < array.length; i++) {
            array[i] = arr2[i];
        }
        arrayShow(array);
    }

    public static void arrayShow(int[] array){
        for (int i = 0; i< array.length;i++){
                System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
