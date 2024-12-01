package hw49;

public class Main {
    public static void main(String[] args) {
        String str = "java is fun and java is powerful";
        System.out.println(str.replaceAll("[^a-zA-Z\\\\s]", ""));
        CharCounter counter = new CharCounter(str);
        System.out.println(counter);
    }


}
