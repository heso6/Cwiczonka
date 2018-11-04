package Kolekcje;


import java.util.*;

public class Exercises {




    public static void main(String[] args) {

        Map<Integer, String> names = new HashMap<>();
        names.put(1, "Adam");
        names.put(3,"Bartek");
        names.put(2,"Xawery");
        names.put(4,"Bartek");
        names.put(6,"Cecylia");
        names.put(5,"Bartek");
        names.put(null, null);

        for (int i = names.size()-1; i > 0; i--){
            System.out.println(i +","+ names.get(i));
        }



    }

}
