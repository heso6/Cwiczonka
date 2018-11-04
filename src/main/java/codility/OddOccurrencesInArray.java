package codility;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    public static int solution(int[] A) {
        // write your code in Java SE 8

        // Using the concept of "XOR" (^)
        // when there is a pair A and B
        // A^B will be zero
        // A^B^C (where C is not paired),
        // then A^B^C = C

        // special case
        if(A.length == 0)
            return 0;

        int unpaired;
        unpaired = A[0]; // initial

        for(int i=1; i< A.length; i++){
            unpaired = unpaired ^ A[i]; // xor
        }

        return unpaired; // return the unpaired value
    }


    public static void main(String[] args) {
        int[] ar = new int[] { 9, 3, 9, 3, 9, 7, 9 };
        System.out.println(solution(ar));
    }
}