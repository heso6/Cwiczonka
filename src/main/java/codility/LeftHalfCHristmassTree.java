package codility;

import java.util.Scanner;

public class LeftHalfCHristmassTree {

//    Sample Input
//
//              6
//    Sample Output
//
//             #
//             ##
//             ###
//             ####
//             #####
//             ######
//    Explanation

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--)
                System.out.print(' ');
            for (int j = i * 1; j >= 0; j--)
                System.out.print('#');
            System.out.println();
        }
    }
}
