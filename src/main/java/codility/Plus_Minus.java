package codility;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Plus_Minus {

//    Output Format
//
//    You must print the following  lines:
//
//    A decimal representing of the fraction of positive numbers in the array compared to its size.
//    A decimal representing of the fraction of negative numbers in the array compared to its size.
//    A decimal representing of the fraction of zeros in the array compared to its size.
//            Sample Input:
//
//         6
//        -4 3 -9 0 4 1
//    Sample Output:
//
//        0.500000
//        0.333333
//        0.166667


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n[] = new int[sc.nextInt()];
        double numbers = 0;
        float minusNumber = 0;
        float plusNumber = 0;
        float zeroNumber = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();


            if (n[i] > 0){
                plusNumber++;
            }
            if (n[i]<0){
                minusNumber++;
            }
            if (n[i] == 0){
                zeroNumber++;
            }



        }
        DecimalFormat df = new DecimalFormat("00.0000");

        double plusIntegers = plusNumber / n.length;
        float minusIntegers = minusNumber / n.length;
        float zeroIntegers = zeroNumber / n.length;

        String numberplusIntegers = String.format ("%.6f", plusIntegers);
        String numberminusIntegers = String.format ("%.6f", minusIntegers);
        String numberzeroIntegers = String.format ("%.6f", zeroIntegers);
        System.out.println(numberplusIntegers + '\n' + numberminusIntegers + '\n' + numberzeroIntegers);

//        String numberplusIntegers = String.format ("%.6f", plusIntegers);
//        String numberminusIntegers = String.format ("%.6f", minusIntegers);
//        String numberzeroIntegers = String.format ("%.6f", zeroIntegers);

    }
}
