package codility;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(solution("8795421015163"));
    }

    public static String solution(String S) {
        S = S.replaceAll("\\D+", "");

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.length() % 3 == 0) {
                if (i % 3 == 0 && i != 0) {
                    builder.append("-");
                }
            } else {
                if (i % 3 == 0 && i != 0 && S.length() - i >= 4) {
                    builder.append("-");
                } else {
                    if (S.length() - i == 2) {
                        builder.append("-");
                    }
                }
            }
            builder.append(S.charAt(i));
        }
        return builder.toString();
    }
}
