package Lambdy.ManagementLambda;

import java.util.Comparator;

@FunctionalInterface
public interface Management {
    void kickOut();

    default void shout() {
        System.out.println("krzycze");

//        Comparator<String> e = (a,b) -> a.compareTo(b);

    }


}
