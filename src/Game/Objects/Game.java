package Game.Objects;

import java.util.ArrayList;
import java.util.List;

public abstract class Game {
    static final private int MAX_PLAYERS_ON_FIELD = 6;
    // playersInGame - игроки на поле, playersOutOfGame - вне поля
    private static final List<Player> playersInGame = new ArrayList<>();
    private static final List<Player> playersOutOfGame = new ArrayList<>();

    static final public NullPlayer NULL_PLAYER = new NullPlayer();

    /**
     * Ищет свободный объект игрока. В зависимсти от результата создаёт новый или переназначает свободный объект.
     * @param name Имя нового игрока
     */
    public static void addPlayer(String name){
        if (playersInGame.size() < MAX_PLAYERS_ON_FIELD){
            if (playersOutOfGame.isEmpty()) {
                playersInGame.add(new Player(name));
            } else {
                Player pl = playersOutOfGame.getLast();
                playersOutOfGame.remove(pl);
                pl.init(name);
                playersInGame.add(pl);
            }
        }
    }

    /**
     * Ищет первого игрока с указанным именем
     * @param name Имя игрока
     * @return Возвращает объект игрока или NullPlayer
     */
    public static isPlayer getPlayer(String name){
        for(Player player : playersInGame) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return NULL_PLAYER;
    }

    /**
     * Ищет игрока по индексу листа
     * @param index Индекс игрока
     * @return Возвращает объект игрока или NullPlayer
     */
    public static isPlayer getPlayer(int index){

        if (index < playersInGame.size()) {
            return playersInGame.get(index);
        }else {
            System.out.println("Игрока под данным индексом нет на поле.");
            return NULL_PLAYER;
        }
    }

    /**
     * Ищет n-ного игрока с именем name
     * @param name - имя игрока
     * @param n - номер игрока c именем name
     * @return
     */
    public static isPlayer getPlayer(String name, int n){
        for(Player player : playersInGame) {
            if (player.getName().equals(name)) {
                n--;
                if (n == 0) {
                    return player;
                }
            }
        }
        return NULL_PLAYER;
    }


    /**
     * Убирает объект игрока с поля, добавляя тот в лист свободных объектов. Посысается с объекта игрока.
     * @param player
     */
    protected static void playerOut (Player player){
        playersInGame.remove(player);
        System.out.println(player.getName() + " устал и уходит с поля.");
        playersOutOfGame.add(player);
    }




    /**
     * Выводит в консоль кол-во недостающих игроков на поле.
     */
    public static void info(){
        System.out.print("На поле находится " + playersInGame.size() + " игроков. ");
        if (playersInGame.size() == MAX_PLAYERS_ON_FIELD){
            System.out.println("На поле нет свободных мест");
        } else {
            System.out.println("На поле нехватает " + (MAX_PLAYERS_ON_FIELD - playersInGame.size()) + " игроков.");
        }

    }

    /**
     * Выводит полную информацию о поле
     */
    public static void fullInfo(){
        System.out.println("На поле находится " + playersInGame.size() + " игроков. Из них: ");
        for(Player player : playersInGame) {
            System.out.println(player.getName() + " со стаминой " + player.getStamina());
        }

        if (playersInGame.size() == MAX_PLAYERS_ON_FIELD){
            System.out.println("На поле нет свободных мест");
        } else {
            System.out.println("На поле нехватает " + (MAX_PLAYERS_ON_FIELD - playersInGame.size()) + " игроков.");
        }

    }

    /**
     * Убирает объект игрока по id
     * @param id индекс объекта
     */
    public static void removeById(int id){
        if (id < playersInGame.size()) {
            playerOut(playersInGame.get(id));
        }else {
            System.out.println("Игрока под данным индексом нет на поле.");
        }
    }


}
