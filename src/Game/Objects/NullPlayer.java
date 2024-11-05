package Game.Objects;

/**
 * Объект-заглушка что-бы не вызывать ошибок
 */
public class NullPlayer implements isPlayer{
    @Override
    public void run() {
        System.out.println("Такого игрока нет на поле");
    }

    @Override
    public int getStamina() {
        System.out.println("Такого игрока нет на поле");
        return 0;
    }

    @Override
    public void runOut() {
        System.out.println("Такого игрока нет на поле");
    }
}
