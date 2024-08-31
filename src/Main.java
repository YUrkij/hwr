//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte MyByte; //объявление
        MyByte = - 128; //инициализация

        short MyShort = 127;
        int MyInteger = 127_902;
        long MyLong = 3_000_000_000L;

        float MyFloat = 3.0f;
        double MyDouble = 3.0;

        char MyChar = 'a';
        char TestChar = '\n';

        String MyStrung = "Hi world!!!";

        boolean MyBool = true;
        System.out.println(MyByte + " " + MyShort + " " + MyInteger + " " + MyLong + " " + MyFloat + " " + MyDouble + "    ");
        System.out.println(MyChar + " " + TestChar + " " + MyStrung);
        System.out.println(MyBool + " " + MyByte + MyDouble);

    }
}