package cw12;


public class Filler {
    static char[][] curImg;
    static char curChar;
    static char nChar;

    /**
     * Переводит строку в массив символов
     *
     * @param image     - строка
     * @param separator - регулярное выражения разделителя
     * @return - массив символов
     */
    static public char[][] StringsToChar(String image, String separator) {
        if (image == null){
            System.out.println("Err: void string");
            return new char[][]{};
        }
        String[] lines = image.split(separator);
        int lineLength = lines[0].length();
        int comLength = lines.length;
        char[][] imageCharArr = new char[comLength][lineLength];
        for (int i = 0; i < comLength; i++) {
            if(lines[0].length() != lines[i].length()){
                System.out.println("Err: incorrectly placed separator");
                return new char[][]{};
            }
            for (int j = 0; j < lineLength; j++) {
                imageCharArr[i][j] = lines[i].charAt(j);
            }
        }
        return imageCharArr;
    }

    /**
     * Переводит строку в массив символов
     *
     * @param image - массив строк
     * @return - массив символов
     */
    static public char[][] StringsToChar(String[] image) {
        int lineLength = image[0].length();
        int comLength = image.length;
        char[][] imageCharArr = new char[comLength][lineLength];
        for (int i = 0; i < comLength; i++) {
            if(image[0].length() != image[i].length()){
                System.out.println("Err: different length of strings");
                return new char[][]{};
            }
            for (int j = 0; j < lineLength; j++) {
                imageCharArr[i][j] = image[i].charAt(j);
            }
        }
        return imageCharArr;
    }

    /**
     * @param image   - массив символов, который служит изображением
     * @param x       - индекс эллемента по вложенному массиву
     * @param y       - индекс эллемента по внешнему массиву
     * @param newChar - символ, который должен заменить текущий
     * @return curImg - новый перекраненный массив
     */
    static public char[][] Fill(char[][] image, int x, int y, char newChar) {
        // Проверки на вшивость
        if (image == null || image.length == 0 || image[0].length == 0) {
            System.out.println("Err: void array");
            return image;
        }
        if ((x < 0 || y < 0) || (y >= image.length || x >= image[0].length)) {
            System.out.println("Err: unable index x,y");
            return image;
        }
        //Проверка на цвет перекрашиваемого эллемента
        if (image[x][y] == newChar) {
            System.out.println("Same color");
            return image;
        }
        curImg = image;
        curChar = image[x][y];
        nChar = newChar;
        redrowerPlus(x, y);
        return curImg;
    }

    /**
     * перерисовка эллементов в 8 сторон (в том числе по диагонали)
     */
    static void redrowerPlus(int x, int y) {
        //Проверка на искомый символ
        if (curImg[x][y] != curChar) {
            return;
        }
        curImg[x][y] = nChar;
        for (int i = -1; i <= 1; i++) {
            if (x + i < 0 || x + i >= curImg[0].length) {
                continue;
            }
            for (int j = -1; j <= 1; j++) {
                if (y + j < 0 || y + j >= curImg.length || x + y == 0) {
                    continue;
                }
                redrowerPlus(x, y);
            }
        }
    }

    /**
     * перерисовка эллементов крестом (плюсом +)
     */
    static void redrowerCross(int x, int y) {
        //Проверка на искомый символ
        if (curImg[x][y] != curChar) {
            return;
        }
        curImg[x][y] = nChar;
        for (int i = -1; i <= 1; i++) {
            if (x + i < 0 || x + i >= curImg[0].length) {
                continue;
            }
            for (int j = -1; j <= 1; j++) {
                if (y + j < 0 || y + j >= curImg.length || x + y == 0) {
                    continue;
                }
                if ((x + y) % 2 == 0) {
                    redrowerPlus(x, y);
                }
            }
        }
    }
}
