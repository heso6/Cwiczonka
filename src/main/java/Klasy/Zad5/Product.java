package Klasy.Zad5;

public class Product {
    private String name;
    private String desription;
    private String specification;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Product(String name, String desription, String specification) {
        this.name = name;
        this.desription = desription;
        this.specification = specification;


    }
}
