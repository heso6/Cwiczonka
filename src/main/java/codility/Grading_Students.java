package codility;

import java.util.Scanner;

public class Grading_Students {
    static int[] solve(int[] grades) {
        // Complete this function
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 38) {
                if (grades[i] + (5 - grades[i] % 5) - grades[i] < 3)
                    grades[i] = (grades[i] + (5 - grades[i] % 5));
            }
        }
        return grades;
    }
}