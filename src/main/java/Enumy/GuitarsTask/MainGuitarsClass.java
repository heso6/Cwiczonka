package Enumy.GuitarsTask;

import java.util.*;

public class MainGuitarsClass {


    public static void main(String[] args) {

        new MainGuitarsClass();

    }

    public MainGuitarsClass() {
        List<GuitarsShop> guitarsList = new ArrayList<>();
        guitarsList.add(new GuitarsShop(GuitarsEnum.CLASSICGUITARS, "Classic", "Fender", 1500.20));
        guitarsList.add(new GuitarsShop(GuitarsEnum.CLASSICGUITARS, "ElClaso", "Cort", 5000));
        guitarsList.add(new GuitarsShop(GuitarsEnum.ACOUSTICGUITARS, "Acustioner", "Fender", 4670.20));
        guitarsList.add(new GuitarsShop(GuitarsEnum.ELECTRICGUITARS, "Electrica", "Epiphone", 2500.20));
        guitarsList.add(new GuitarsShop(GuitarsEnum.ELECTROACOUSTICGUITARS, "ElctroAcustica", "Gibson", 15000.20));
        guitarsList.add(new GuitarsShop(GuitarsEnum.BASSGUITAR, "BassRock", "Washburn", 3000));
        guitarsList.add(new GuitarsShop(GuitarsEnum.ACOUSTICGUITARS, "Acustica", "Fender", 3500.20));

        Scanner guitarScanner = new Scanner(System.in);
        System.out.print("wpisz wielkosc otworu rezonansowego: ");
        int diameterScanner = guitarScanner.nextInt();


        for (GuitarsShop sc : guitarsList) {
            if (sc.getDiameter() == diameterScanner) {
                System.out.println(sc);
            }

        }
        guitarScanner.close();
    }


    public void sortAndPrint(List<GuitarsShop> list) {

        Collections.sort(list, new ComparebyWholeDiameter());
        for (GuitarsShop newListOfguitars : list) {
            System.out.println(newListOfguitars);
        }

    }

    class ComparebyWholeDiameter implements Comparator<GuitarsShop> {

        @Override
        public int compare(GuitarsShop o1, GuitarsShop o2) {
            if (o1.getDiameter() > o2.getDiameter()) {
                return -1;
            } else if (o1.getDiameter() == o2.getDiameter()) {
                return 0;
            } else
                return 1;
        }

    }
}





