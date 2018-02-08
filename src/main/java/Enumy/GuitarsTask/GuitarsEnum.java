package Enumy.GuitarsTask;


public enum GuitarsEnum {
    CLASSICGUITARS(5, 15), ACOUSTICGUITARS(6, 18), ELECTROACOUSTICGUITARS(6, 2), ELECTRICGUITARS(8, 0), BASSGUITAR(4, 1);

    private int numberOfCord;
    private int wholeDiameter;

    GuitarsEnum(int numberOfCord, int wholeDiameter) {
        this.numberOfCord = numberOfCord;
        this.wholeDiameter = wholeDiameter;
    }

    public int getNumberOfCord() {
        return numberOfCord;
    }

    public int getWholeDiameter() {
        return wholeDiameter;
    }

}

