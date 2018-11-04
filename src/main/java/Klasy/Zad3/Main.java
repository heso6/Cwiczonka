package Klasy.Zad3;

public class Main {
    public static void main(String[] args) {

// tablica graczy
        Player[] players = {
                new Player("pawel", "Lukaszewski", 1),
                new Player("Rom", "Leya", 10),
                new Player("Jackob", "Lukaszewski", 50),
                new Player("Vader", "Skywoker", 102)};


        Game game = new Game(" Quake 3 turnament", players); //obiekt game


        System.out.println(game.getWinner());
    }

}
