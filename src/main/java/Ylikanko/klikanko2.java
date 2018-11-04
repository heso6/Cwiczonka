package Ylikanko;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class klikanko2 {

    public static void main(String[] args) throws FileNotFoundException {


//        int[] numbers = {1, 5, 23, 2, 1, 6, 3, 1, 8, 12, 3};
//        Arrays.sort(numbers);
//
//        Set<Integer> hashSet = new HashSet<>();
//        List<Integer> repeatList = new ArrayList<>();
//        for (int i = 0; i < numbers.length; i++) {
//            boolean unique = hashSet.add(numbers[i]);
//            if (unique == false) {
//                repeatList.add(numbers[i]);
//            }
//
//        }
//        System.out.println("duplication " + hashSet);
//        System.out.println("number witch are repeat" + repeatList);
//    }
//}


        //        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(4);
//        list.add(7);
//        list.add(5);
//        list.add(4);
//        list.add(2);
//        list.add(7);
//        list.add(8);
//
//
//        List<Integer> uniqList = new ArrayList<>();
//        List<Integer> dupesList = new ArrayList<>();
//        for (Integer a : list) {
//            if (uniqList.contains(a))
//                dupesList.add(a);
//            else
//                uniqList.add(a);
//
//
//        }
//        System.out.println(dupesList.size() + " uniqe words: " + uniqList);
//        System.out.println(dupesList.size() + " dupes List words: " + dupesList);
//    }
//}
        Scanner input = new Scanner(new File("./src/test.txt"));


        while (input.hasNext()){
            System.out.println(input.next());
        }


        input.close();
    }
}