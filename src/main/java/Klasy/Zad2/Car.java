package Klasy.Zad2;

public class Car {

    private String brand;
    private String model;
    private int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;


    }

    public void show() {
        System.out.println("Marka samochodu to " + brand + " ,a jego cena to " + price);
    }
}
