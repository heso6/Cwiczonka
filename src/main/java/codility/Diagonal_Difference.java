package codility;

import java.util.Scanner;

public class Diagonal_Difference {

//    Sample Input:
//      3
//        11 2 4
//        4 5 6
//        10 8 -12
//    Sample Output:
//     15
//    Explanation
//
//    The primary diagonal is:
//
//         11
//            5
//              -12
//    Sum across the primary diagonal: 11 + 5 - 12 = 4
//
//    The secondary diagonal is:
//
//                   4
//                5
//            10
//    Sum across the secondary diagonal: 4 + 5 + 10 = 19
//    Difference: |4 - 19| = 15


    public static int difference(int arr[][], int n) {
        // Initialize sums of diagonals
        int primaryDiagonal = 0, secondaryDiagonal = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // finding sum of primary diagonal
                if (i == j) {
                    primaryDiagonal += arr[i][j];
                }
                // finding sum of secondary diagonal
                if (i == n - j - 1) {
                    secondaryDiagonal += arr[i][j];
                }
            }
        }

        // Absolute difference of the sums
        // across the diagonals
        return Math.abs(primaryDiagonal - secondaryDiagonal);
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();


        System.out.print(difference(arr, n));
    }
}