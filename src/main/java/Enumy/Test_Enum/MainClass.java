package Enumy.Test_Enum;

public class MainClass {
    public static void main(String[] args) {
        Size size;
        size = Size.BIG;
        size = Size.MIDDLE;
        size = Size.SMALL;
        String name = "BIG";

        if (size.valueOf(name) == size.BIG) {
            System.out.println("TRUE");
        }
        for (Size s : Size.values()) {
            System.out.println(s.name());
        }
    }
}
