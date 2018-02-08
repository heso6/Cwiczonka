package Kolekcje.Zad2;


import java.util.Scanner;
import java.util.Stack;

public class BinarySystem {


    public static String toBinaryString(int number) {
        Stack<Integer> stack = new Stack<>();
        while (number != 0) {
            stack.push(number % 2);

            number /= 2;
        }
        StringBuilder binaryBuilder = new StringBuilder("");
        while (!stack.empty()) {
            binaryBuilder.append(stack.pop());
        }
        return binaryBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.print("wpisz liczbe: ");
        int sc = new Scanner(System.in).nextInt();


        System.out.println(BinarySystem.toBinaryString(sc));
    }
}















        /*
        // bez uzycia stosu
        int sc = new Scanner(System.in).nextInt();
        String binaryString = Integer.toBinaryString(sc);
        System.out.println(binaryString);
        */

