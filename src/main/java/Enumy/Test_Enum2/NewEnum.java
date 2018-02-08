package Enumy.Test_Enum2;

public enum NewEnum {
    PONIEDZIAŁEK(1, "pon"), WTOREK(2, "wt"), SRODA(3, "sr"), CZWARTEK(4, "czw"),
    PIATEK(5, "pt"), SOBORA(6, "sb"), NIEDZIELA(7, "nd");

    private int number;
    private String scr;

    NewEnum(int number, String scr) {
        this.number = number;
        this.scr = scr;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getScr() {
        return scr;
    }

    public void setScr(String scr) {
        this.scr = scr;
    }
}
