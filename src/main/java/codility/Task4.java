package codility;

public class Task4 {
    public static void main(String[] args) {

//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(String.valueOf(i));
//            }
//        }

        int dochMiesieczMINUSmiesieczZobowiaz = 30;
        int kwotaKredytuPODZIELICokreskredytu = 25;
        int a = 30;
        int b = 25;


        System.out.println((double) (dochMiesieczMINUSmiesieczZobowiaz * 100) / kwotaKredytuPODZIELICokreskredytu - 100);
        if ((double) (dochMiesieczMINUSmiesieczZobowiaz * 100) / kwotaKredytuPODZIELICokreskredytu - 100 > 19) {
            System.out.println("dostałes kredyt");
        } else {
            System.out.println("nie dostales");
        }


    }
}



