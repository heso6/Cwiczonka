package Klasy.Zad10;

public class Point2D {

    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        x = 0;
        y = 0;
    }

    @Override
    public String toString() {
        return "Point2D " +
                "[" +
                "x = " +
                x +
                ", y = " +
                y +
                "]";


    }
}