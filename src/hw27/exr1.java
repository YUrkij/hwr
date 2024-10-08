package hw27;

public class exr1 {
    public static void main(String[] args){
        int[][] array = new int[3][3];
        create(array);
        arrayShow(array);
        arrayStringSum(array);
        arrayColomnSum(array);
    }

    public static void create(int[][] array){
        int n = 1;
        for (int i = 0; i< array.length;i++){
            for (int j = 0; j < array[0].length;j++){
                array[i][j] = n;
                n++;
            }
        }
    }

    public static void arrayShow(int[][] array){
        for (int i = 0; i< array.length;i++){
            for (int j = 0; j < array[0].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void arrayStringSum(int[][] array){
        for (int i = 0; i< array.length;i++){
            int n = 0;
            for (int j = 0; j < array[0].length;j++){
                n += array[i][j];
            }
            System.out.println("Сумма строки " + i + ": " + n);
        }
        System.out.println();
    }

    public static void arrayColomnSum(int[][] array){
        for (int i = 0; i< array[0].length;i++){
            int n = 0;
            for (int j = 0; j < array.length;j++){
                n += array[j][i];
            }
            System.out.println("Сумма столбца " + i + ": " + n);
        }
        System.out.println();
    }
}
