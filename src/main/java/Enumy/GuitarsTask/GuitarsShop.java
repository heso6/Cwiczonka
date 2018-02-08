package Enumy.GuitarsTask;

public class GuitarsShop {

    private GuitarsEnum guitarsType;
    private String name;
    private String producer;
    private double price;

    public GuitarsShop(GuitarsEnum guitarsType, String name, String producer, double price) {
        this.guitarsType = guitarsType;
        this.name = name;
        this.producer = producer;
        this.price = price;
    }

    public int getCords() {
        return guitarsType.getNumberOfCord();
    }

    public int getDiameter() {
        return guitarsType.getWholeDiameter();
    }

    public GuitarsEnum getGuitarsType() {
        return guitarsType;
    }

    public void setGuitarsType(GuitarsEnum guitarsType) {
        this.guitarsType = guitarsType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n Type - " + guitarsType + "\n Name - " + name + " \n Producer - " + producer + " \n Price - " + price +
                " \n Cords -  " + getCords() + " \n Diameter - " + getDiameter() + "\n";
    }
}





