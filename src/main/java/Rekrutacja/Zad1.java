package Rekrutacja;

import java.util.Scanner;

public class Zad1 {
      public static void main(String[] args) {

        int numbers[]={1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1,11,21,31,41,51,61,71,81,91,99,89,79,69,59,49,39,29,19,42,3,6,11};


        for (int brutArr : numbers) {
            if (brutArr == 42) {
                break;
            }
            System.out.println(brutArr);


        }
    }
}
