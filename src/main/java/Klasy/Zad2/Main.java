package Klasy.Zad2;

public class Main {
    public static void main(String[] args) {

        Car BMW = new Car("BMW", "E36", 14000);
        Car Honda = new Car("honda", "civic", 10000);
        Car ford = new Car("ford", "focus rs", 34000);

        BMW.show();
        ford.show();
        Honda.show();
    }
}
