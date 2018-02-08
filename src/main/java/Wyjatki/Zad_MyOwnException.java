package Wyjatki;

import javafx.scene.media.MediaException;

public class Zad_MyOwnException {

    public static class NameException extends Exception {

        public NameException(String message) {
            super(message);
            System.out.println("Wystąpił wyjatek, a przyczyna to " + message);
        }
    }

    public static class GuestList {
        public String list(String name) throws NameException {
            if (name.contains("Paweł"))
                throw new NameException("Zakazane imie: " + name);
            return name;
        }
    }


    public static void main(String[] args) {


        GuestList guestList = new GuestList();

        try {
            guestList.list("Paweł");
        } catch (NameException e) {
            e.printStackTrace();
        }

    }
}

