package Klasy.Zad3;

public class Main {
    public static void main(String[] args) {

// tablica graczy
        Player[] players = {
                new Player("pawel", "Lukaszewski", 50),
                new Player("Rom", "Leya", 10),
                // new Player("thomas", "Lukas", 150),
                //  new Player("thomas", "Dupa", 170),
                new Player("Jackob", "Lukaszewski", 50),
                new Player("Vader", "Skywoker", 12)};


        Game game = new Game(" Quake 3 turnament", players); //obiekt game


        System.out.println(game.getWinner());
    }

}
