package Interfejsy.Zad1;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Voice> Animals = new ArrayList<>();
        Animals.add(new Dog("Kasza"));
        Animals.add(new Cat("pusia"));

        for (Voice allAnimals : Animals) {
            allAnimals.getVoice();
        }
    }
}

