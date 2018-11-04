package Interfejsy.Test;

import org.testng.annotations.Test;

public class Testo implements SomeInterface, OtherInterface {

    public static void main(String[] args) {
        Testo tst = new Testo();

        System.out.println(tst.otherMethode());
        System.out.println(tst.someMethode());

    }
    @Override
    public String otherMethode() {
        return "dupcia ciupcia z otherMethods";
    }

    @Override
    public String someMethode() {
        return "dupcia ciupcia z someMethods";
    }
}
