package Ylikanko;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by Płaszczka on 2016-11-23.
 */
public class klikanko {
    /* dodajac "throws FileNotFoundExcep" do metody main
    informujemy o tym, ze wiemy o mozliwosci
    wystąpienia wyjatku zwiazanego z nieodnalezieniem pliku
     */
    public static void main(String[] args) throws FileNotFoundException {

        //int PI = 14;
        //JOptionPane.showMessageDialog(null,  PI);

        //String greeting = "czesc";
        // String s = greeting.substring(0 , 3);
        //System.out.println(s + "_kaj");
        // System.out.println( "czesC".equalsIgnoreCase(greeting));

       /* System.out.println("wpisz imie:");
        String word = new Scanner(System.in).next().toLowerCase();
        StringBuilder wordBuilder = new StringBuilder(word);

        System.out.println("wpisane imie to; " + word);

        System.out.println("odwrócone słowo to: " + wordBuilder.reverse());*/
/*
      final String password = "chuj";
      String secretPassword;
      Scanner scanner = new Scanner(System.in);

      do {
          System.out.println("Podaj hasło");
          secretPassword = scanner.next();
      }while (!secretPassword.equals(password));
        System.out.println("podałes poprawne hasło");*/

       /* Scanner in = new Scanner(System.in);

        System.out.println("Jak sie nazywasz?");
        String name = in.nextLine();

        System.out.println("ile masz lat?");
        int age = in.nextInt();

        System.out.println("witaj użytkowniku " + name + " W przyszłym rogku bedziesz mieć " + (age + 1) + " Lat!"  );
    */
        /*
        Console console = System.console();
        String username = console.readLine("nazwa uzytkownika");
        char[] password = console.readPassword("Hasło: ");
       */
    /*
        Console console = System.console();
        if (console == null) {
            System.out.println("No console: non-interactive mode!");
            System.exit(0);
        }

            System.out.print("Enter your username: ");
            String username = console.readLine();

            System.out.print("Enter your password: ");
            char[] password = console.readPassword();

            String passport = console.readLine("Enter your %d (th) passport number: ", 2);
            */

        // PrintWriter out = new PrintWriter("jebać1.txt"); Zapisywanie pliku

        // Scanner in = new Scanner(Paths.get("jebać1.txt")); Wczytywanie pliku

            /*
        //aplikacja wyliczajaca emeryture
        Scanner in = new Scanner(System.in);

        System.out.println("ile pieniedzy bedziesz wpłacać rocznie");

        double payment = in.nextDouble();

        System.out.println("stopa procentowa w %: ");

        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        String input;

        //Aktualizacja stanu konta, kiedy uzytkownik nie jest gotowy na przejscie na emeryture
        do {

            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;

            year++;

            System.out.println("po upływie "+ year+ " lat stan twojego konta wyniesie " + balance);

            System.out.print("chcesz przejsć na emeryture? (T/N) ");
            input = in.next();
        }
                while (input.equals("N"));

                    */
        /*           Program obliczajacy szanse na wygranie w  loterii
        Scanner in = new Scanner(System.in);

        System.out.println("ile liczb ma byc wylosowanych? ");

        int k = in.nextInt();

        System.out.println("jaka jest górna granica przedziału losowych liczb? ");

        int n = in.nextInt();

        int lotteryOdds = 1;
        for (int i =1; i <=k; i++)
            lotteryOdds = lotteryOdds * (n - i + 1 ) / i;

        System.out.println("Twoje szanse to 1 do " + lotteryOdds + ". Powodzonka!");
        */
        /*
                //christmas tree
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++)
            System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
            System.out.print("*");
            System.out.println();
        }
        */
/*                      zmiana for-loop na while-loop
        int[][] arr = new int[4][];
        arr[0] = new int[4];
        arr[1] = new int[2];
        arr[2] = new int[1];
        arr[3] = new int[3];

        int counter = 1;
        int i = 0;
        int j = 0;
        //fill arr numbers from 1 to 10
        while (i < arr.length) {
            while (j < arr[i].length) {
                arr[i][j] = counter++;
                j++; // Increment as in for loops
            }
            i++; // Increment as in for loops
            j = 0; // Restart j to the next outer loop
        }

        i = 0; // Reset i for outer loop
        // No need to j=0 since when the above loop ends, j will reset to 0

        while (i < arr.length) {
            System.out.print(" arr [ " + i + " ] = ");
            while (j < arr[i].length) {
                System.out.print(arr[i][j] + " ");
                j++; // Increment as in for loops
            }
            i++; // Increment as in for loops
            j = 0; // Same objective as in the loop above
            System.out.println(" ");
        }*/


//        int[][] arr = new int[4][];
//        arr[0] = new int[1];
//        arr[1] = new int[2];
//        arr[2] = new int[3];
//        arr[3] = new int[4];
//
//        int counter = 10;
//
//        //fill arr numbers from 1 to 10
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = counter--;
//                System.out.println(arr[i][j]);
//
//
//            }
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("arr [ " + i + " ] ");
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//
//            }
//            System.out.println(" ");
//
//        }


        LocalDateTime time = LocalDateTime.now();

        System.out.println(time);

    }


}




