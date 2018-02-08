package Kolekcje.Zad1;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class englishToPolish {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj słowo po angielsku:");


        Map<String, String> simpleTranslator = new HashMap<String, String>();
        simpleTranslator.put("hello", "czesc");
        simpleTranslator.put("yes", "tak");
        simpleTranslator.put("no", "nie");
        simpleTranslator.put("where", "gdzie");
        simpleTranslator.put("morning", "dzien");
        simpleTranslator.put("night", "noc");

        String wordCase = sc.next().toLowerCase();
        if (simpleTranslator.containsKey(wordCase)) {
            System.out.println(simpleTranslator.get(wordCase));
        } else {
            System.out.println("nie znaleziona słowa w słowniku!");
        }
        System.out.print("Podaj słowo po polsku: ");

        String englishWord = sc.next().toLowerCase();
        boolean found = false;
        //działanie w druga strone. Słaba optymalizacja
        for (Map.Entry<String, String> entry : simpleTranslator.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.equals(englishWord)) {
                System.out.print("Słowo po polsku to: " + key);
                found = true;
            }
        }

    }
}