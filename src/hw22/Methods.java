package hw22;

public class Methods {
    static long square(int i) {
        return (long) i * i;
    }

    static void printFullName(String name, String surname) {
        System.out.print("Full name: " + name + " " + surname);
    }

    static String[] cornerValuesArray(String[] str) {
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
}
