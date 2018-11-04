package codility;


import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class booleans {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tableOfNumber[] = new int[sc.nextInt()];
        int sum = 0;
        for (int i = 0; i < tableOfNumber.length; i++) {
            tableOfNumber[i] = sc.nextInt();
            sum += tableOfNumber[i];
        }

        System.out.println(sum);
    }
}
