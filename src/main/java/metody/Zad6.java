package metody;

public class Zad6 {
    public static void main(String[] args) {
        Zad6 task = new Zad6();
        System.out.println("wynik sumy: " + task.sum(123));
    }

    int sum(int a) {

        String converted = String.valueOf(a); //funkcja zmieniajaca int na String
        int sum = 0;
        for (int i = 0; i < converted.length(); i++) { // bo potem z tego stringa moge odczytac wielkosc poprzez funkcje length
            sum += Character.getNumericValue(converted.charAt(i)); //funkcja konvertujaca char na int i ja sumuje
        }

        return sum; // zwaraca nam sume
    }

}
