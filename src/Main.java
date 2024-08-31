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

        System.out.print(MyByte);
        System.out.print(MyShort);
        System.out.print(MyInteger);
        System.out.print(MyLong);
        System.out.print(MyFloat);
        System.out.print(MyDouble);
        System.out.print(MyChar);
        System.out.print(TestChar);
        System.out.print(MyStrung);
        System.out.print(MyByte + MyDouble);

    }
}