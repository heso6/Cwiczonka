package Klasy.Zad3;

import java.util.Arrays;

public class Game {

    private String name;
    private Player[] players; // tworzymy tablice graczy

    public Game(String name, Player[] players) {
        this.name = name;
        this.players = players;

    }


    public String getWinner() { // metoda getWinner

        // wyszukujemy gracza, ktory ma najwiecej pkt z calego meczu
        int max = 0;
        int tempIndex = 0;
        for (int i = 0; i < players.length; i++) {
            if (max < players[i].getPoints()) {
                max = players[i].getPoints();
                tempIndex = i;


            }

        }

        return players[tempIndex].fullName();

    }

}



