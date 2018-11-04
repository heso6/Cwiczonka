package codility;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int size = A.length;
        int[] cyclic = new int [size];
        for (int x=0; x<size; x++) {
            cyclic[(x + K) % size] = A[x];
        }

        return cyclic;
    }
}
