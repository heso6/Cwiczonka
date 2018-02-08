package Wyjatki;

import javax.naming.InsufficientResourcesException;

public class Zad2 {
    public static void main(String[] args) throws InsufficientResourcesException {


        new Zad2().deposit();

    }

    public void deposit() {

        try {
            withDraw(100, 10, 800);
        } catch (InsufficientResourcesException e) {
            //e.printStackTrace();
            System.out.println("za mała kwota wpłaty");
        }

    }

    public void withDraw(int minimumPayment, int payment, int accountBalance) throws InsufficientResourcesException {
        if (minimumPayment > payment) {
            throw new InsufficientResourcesException("za mała kwota wpłaty");
        }
        System.out.println(payment + accountBalance);
    }

}