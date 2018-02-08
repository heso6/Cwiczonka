package Klasy.Zad3;

public class Player {

    private String name;
    private String surname;
    private int points;

    public Player(String name, String username, int points) {
        this.name = name;
        this.surname = username;
        this.points = points;


    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPoints() {
        return points;
    }

    public String fullName() {
        return name + " " + surname + " " + points;
    }
}
