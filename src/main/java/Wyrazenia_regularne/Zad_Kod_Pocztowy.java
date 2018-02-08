package Wyrazenia_regularne;

import java.util.Scanner;


public class Zad_Kod_Pocztowy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Boolean adress = sc.hasNext("\\d{2}-\\d{3}");


        if (adress == true) {
            System.out.println("Podales poprawny adres");
        } else {
            System.out.println("Podales zly adres");
        }
    }
}
