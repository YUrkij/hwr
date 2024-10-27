package Game.Objects;

import java.util.Random;

public class Player {
    final private int id;
    private int stamina;
    private boolean isTired = false;

    static final private int MAX_STAMINA = 10;
    static final private int MIN_START_STAMINA = 8;
    static final private int MIN_STAMINA = 0;
    static final private int MAX_PLAYERS_ON_FIELD = 6;

    static int playerCount = 0;
    static int tiredCount = 0;

    private Player() {
        playerCount++;
        this.id = playerCount;
        Random rnd = new Random();
        this.stamina = rnd.nextInt(MIN_START_STAMINA,MAX_STAMINA + 1);
    }

    /**
     * Если команды неполные, возвращает новый объект игрока, иначе возвращает null.
     */
    public static Player addPlayer(){
        if (playerCount - tiredCount < MAX_PLAYERS_ON_FIELD){
            return new Player();
        } else {
            return null;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public int getId() {
        return id;
    }

    public boolean isTired() {
        return isTired;
    }

    /**
     * Уменьшает стамину вызываемого Player на 1. Если стамина уменьшается до MIN_STAMINA, то Player уходит с поля
     */
    public void run(){
        if(!isTired) {
            this.stamina -= 1;
            if (getStamina() <= MIN_STAMINA) {
                this.isTired = true;
                this.stamina = MIN_STAMINA;
                tiredCount += 1;
            }
        } else {
            System.out.println("Игрок № " + getId() + " устал");
        }
    }

    /**
     * Выводит в консоль кол-во недостающих игроков на поле.
     */
    public static void info(){
        if (playerCount - tiredCount >= MAX_PLAYERS_ON_FIELD){
            System.out.println("На поле нет свободных мест");
        } else {
            System.out.println("Команды неполные. На поле ещё есть " + (MAX_PLAYERS_ON_FIELD - (playerCount - tiredCount))
                    + " свободных мест.");
        }
    }

}
