package metody;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {

        Zad1 task = new Zad1(); //Referencja do naszej klasy pozwalajaca nam odwłoanie sie do metody bez static

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        System.out.println(task.add(a, b));
    }

    int add(int a, int b) {

        return a + b;
    }

   /* int add1 (int a, int b) {
        int c = a+b;
        return  c;
        */

}



