package Interfejsy.Zad1;


public class Dog implements Voice {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getVoice() {
        System.out.println("hauhau");
    }
}

