package Game;

import Game.Objects.Player;

public class Game {
    static public void main(String[] args){
        Player player1 = Player.addPlayer();
        Player player2 = Player.addPlayer();
        Player player3 = Player.addPlayer();
        Player player4 = Player.addPlayer();
        Player player5 = Player.addPlayer();
        Player.info();
        Player player6 = Player.addPlayer();
        Player player11 = Player.addPlayer();
        Player.info();
        makeTired(player6,player11);
        Player.info();
        makeTired(player5,player2);
        Player player7 = Player.addPlayer();
        Player player8 = Player.addPlayer();
        Player player9 = Player.addPlayer();
        Player player10 = Player.addPlayer();
        Player.info();
    }

    static void makeTired(Player... players){
        for (Player player : players) {
            if (player == null){
                continue;
            }
            while (!player.isTired()) {
                player.run();
            }
        }
    }

}
