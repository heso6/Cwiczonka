package codility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Time_Conversion {

//
//    Given a time in -hour AM/PM format, convert it to military (24-hour) time.
//
//    Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
//        Sample Input 0
//
//            07:05:45PM
//        Sample Output 0
//
//            19:05:45


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
        Date date = null;
        try {
            date = parseFormat.parse(sc.next());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(displayFormat.format(date));

    }
}

//    static String timeConversion(String s) {
//        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
//        Date date = null;
//        try {
//            date = parseFormat.parse(s);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        return displayFormat.format(date);
//
//    }
//
//    private static final Scanner scan = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = scan.nextLine();
//
//        String result = timeConversion(s);
//
//        bw.write(result);
//        bw.newLine();
//
//        bw.close();
//    }
//}