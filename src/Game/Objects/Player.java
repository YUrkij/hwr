package Game.Objects;

import java.util.Random;

public class Player implements isPlayer {
    private static final Random rnd = new Random();
    private String name;
    private int stamina;
    static final private int MAX_STAMINA = 10;
    static final private int MIN_START_STAMINA = 8;
    static final private int MIN_STAMINA = 0;

    static int tiredCount = 0;

    public Player(String name) {
        init(name);
    }

    /**
     * Инициализация объекта
     * @param name
     */
    public void init(String name) {
        this.stamina = rnd.nextInt(MIN_START_STAMINA,MAX_STAMINA + 1);
        this.name = name;
    }

    public int getStamina() {
        return stamina;
    }

    public String getName() {
        return name;
    }

    /**
     * Уменьшает стамину вызываемого Player на 1. Если стамина уменьшается до MIN_STAMINA, то Player уходит с поля
     */
    public void run(){
        this.stamina -= 1;
        if (this.stamina <= MIN_STAMINA){
            Game.playerOut(this);
        }
    }

    /**
     * Обнуляет стамину.
     */
    public void runOut(){
        this.stamina = MIN_STAMINA;
        this.run();
    }


}
