package hw22;

public class Methods {
    public static long square(int i) {
        return (long) i * i;
    }

    /**
     * Печатает Full name: name surname
     * @param name - Имя
     * @param surname - Фамилия
     */
    public static void printFullName(String name, String surname) {
        System.out.print("Full name: " + name + " " + surname);
    }

    /**
     * Получает n-ное колличество объектов класса String
     * Возвращает самый длинный и самый короткый объект
     * @param str - набор строк
     * @return self[0] - Длинный, self[1] - Короткий
     */
    public static String[] cornerValuesArray(String... str) {
        String[] maxMinInd = new String[2];
        maxMinInd[0] = str[0];
        maxMinInd[1] = str[0];
        for (int i = 0; i < str.length; i++){
            if (str[i].length() > maxMinInd[0].length()){
                maxMinInd[0] = str[i];
            } else if (str[i].length() < maxMinInd[1].length()){
                maxMinInd[1] = str[i];
            }
        }
        return maxMinInd;
    }

    /**
     * Получает n-ное колличество переменных типа int
     * Возвращает самое большое и самое маленькое значение
     * @param str - набор intов
     * @return self[0] - Большое, self[1] - Маленькое
     */
    public static int[] cornerValuesArray(int... str) {
        int[] maxMinInd = new int[2];
        maxMinInd[0] = str[0];
        maxMinInd[1] = str[0];
        for (int i = 0; i < str.length; i++){
            if (str[i] > maxMinInd[0]){
                maxMinInd[0] = str[i];
            } else if (str[i] < maxMinInd[1]){
                maxMinInd[1] = str[i];
            }
        }
        return maxMinInd;
    }

    /**
     * Получает n-ное колличество переменных типа char
     * Возвращает значение самого большого и самого маленького индекса
     * @param str - набор симболов
     * @return self[0] - Большой, self[1] - Маленький
     */
    public static char[] cornerValuesArray(char... str) {
        char[] maxMinInd = new char[2];
        maxMinInd[0] = str[0];
        maxMinInd[1] = str[0];
        for (int i = 0; i < str.length; i++){
            if (str[i] > maxMinInd[0]){
                maxMinInd[0] = str[i];
            } else if (str[i] < maxMinInd[1]){
                maxMinInd[1] = str[i];
            }
        }
        return maxMinInd;
    }
}
