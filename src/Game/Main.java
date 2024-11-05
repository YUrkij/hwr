package Game;

import Game.Objects.Game;
public class Main {
    public static void main(String[] args) {

        Game.info();
        Game.addPlayer("Саня");
        Game.addPlayer("Ваня");
        Game.addPlayer("Женя");
        Game.info();
        Game.addPlayer("Женя");
        Game.addPlayer("Гоша");
        Game.addPlayer("Петя");
        Game.fullInfo();
        Game.getPlayer("C").runOut();
        Game.info();
        Game.getPlayer("C").runOut();
        Game.info();
        Game.getPlayer("D").runOut();
        Game.removeById(1);
    }
}
