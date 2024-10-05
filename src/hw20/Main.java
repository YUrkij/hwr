package hw20;

public class Main {

    public static double[] zadacha2(double[] array) {
        //минимальное и максимальное значение элементов массива
        int[] maxmin = new int[2];
        if (array.length == 0) {
            return new double[] {};
        }
        for (int i = 1; i < array.length; i++) {
            if (array[maxmin[0]] < array[i]) {
                maxmin[0] = i;
            } else if (array[maxmin[1]] > array[i]) {
                maxmin[1] = i;
            }
        }
        return new double[] {array[maxmin[0]],array[maxmin[1]]};
    }

    /**
     * Вычисляет факториал числа
     *
     * @param i - число у которого находят факториал
     */
    public static long factorial(int i) {
        if (i == 1) {
            return 1;
        } else {
            return factorial(i - 1) * i;
        }

    }

    /**
     * Вычисляет число фибоначи по индексу i
     *
     * @param i - индекс искомого числа (учтите, что 0 индекс это 0)
     * @return - число фибоначи по индексу i
     */
    public static long fibonachi(int i) {
        if (i == 1) {
            return 1;
        } else if (i == 0) {
            return 0;
        } else {
            return fibonachi(i - 1) + fibonachi(i - 2);
        }
    }
}
