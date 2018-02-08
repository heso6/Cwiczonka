package String_petle;

import java.util.Scanner;

/**
 * Created by Płaszczka on 2016-11-19.
 */
public class zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();
        final int correctLengthOfZipCode = 6;
        if (code.length() != correctLengthOfZipCode) {
            System.out.println("Kod pocztowy jest niepoprawny");
        } else {
            boolean isZipCode = true;
            for (int i = 0; i < 6; i++) {
                if (code.charAt(i) >= '0' && code.charAt(i) <= '9' && i != 2) {
                    continue;
                } else {
                    if (!(i == 2 && code.charAt(i) == '-')) {
                        isZipCode = false;
                        break;
                    }
                }
            }
            if (isZipCode)
                System.out.println("Kod pocztowy jest poprawny");
            else
                System.out.println("Kod pocztowy jest nieporawony");
        }
    }
}
