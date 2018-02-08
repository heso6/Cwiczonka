package Enumy.Test_Enum2;

public class MainClass {
    public static void main(String[] args) {

        NewEnum today = NewEnum.SRODA;
        System.out.println("Numer dnia w tygodniu " + today.getNumber());
        System.out.println("skrot dnia w tygodniu " + today.getScr());

        today = NewEnum.NIEDZIELA;
        System.out.println("Numer dnia w tygodniu " + today.getNumber());
        System.out.println("skrot dnia w tygodniu " + today.getScr());

        today = NewEnum.PONIEDZIAŁEK;
        System.out.println("Numer dnia w tygodniu " + today.getNumber());
        System.out.println("skrot dnia w tygodniu " + today.getScr());

        for (NewEnum day : NewEnum.values()) {
            System.out.println(day.getNumber() + " - " + day.getScr());

        }


    }
}
