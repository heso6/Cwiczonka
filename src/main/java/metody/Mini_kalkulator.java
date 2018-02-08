package metody;

import java.util.Scanner;

public class Mini_kalkulator {
    public static void main(String[] args) {
        //Referencja do naszej klasy pozwalajaca nam odwłoanie sie do metody bez static
        Mini_kalkulator task = new Mini_kalkulator();
    }

    int a, b;  //poza konstruktorem (zmienna globalna) aby odwolywac sie do nich w roznych metodach
    Scanner sc;

    public Mini_kalkulator() {
        sc = new Scanner(System.in); //przypisanie skanera
        System.out.println("Hello in my first calculator!");
        System.out.print("podaj komende: ");
        int answer = 0; //zmienna operacyjna, czyli jaka komende poda uzytkownik
        while (answer != 5) {  //1-4 puszcza petle,a 5 wylacza petle
            answer = sc.nextInt(); //petla sie zatrzymuje i czeka na reakcje(wybranie liczby)
            switch (answer) { //switch sprawca liczbe jaka została wybrana i który case zostanie aktywowany
                case 1: {
                    getNumber(); //funkcja ta laczy nas z "void getNumber" i jej opcjami
                    System.out.println("wynik z dodawania to: " + add(a, b));
                    System.out.print("podaj komende: ");
                    break;
                }
                case 2: {
                    getNumber();
                    System.out.println("wynik z odejmowania to: " + substrack(a, b));
                    System.out.print("podaj komende: ");
                    break;
                }
                case 3: {
                    getNumber();
                    System.out.println("wynik z mnozenia to: " + multiply(a, b));
                    System.out.print("podaj komende: ");
                    break;
                }
                case 4: {
                    getNumber();
                    System.out.println("wynik z dzielenia to: " + divide(a, b));
                    System.out.print("podaj komende: ");
                    break;
                }
            }
        }
    }

    void getNumber() {
        System.out.println("Podaj wartosc liczb a i b");
        System.out.print("Liczba a: ");
        a = sc.nextInt(); // scaner czeka az uzytkownik napisze liczbe, ktora zostanie przypisana do 'a'
        System.out.print("Liczba b: ");
        b = sc.nextInt(); // scaner czeka az uzytkownik napisze liczbe, ktora zostanie przypisana do 'b'
    }

    int add(int a, int b) {

        return a + b;
    }

    int substrack(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(double a, double b) {
        if (a == 0 || b == 0) {
            System.out.println("Nie dziel przez 0 ");
            return 0;
        }
        return a / b;
    }
}
