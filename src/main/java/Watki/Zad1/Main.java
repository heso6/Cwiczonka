package Watki.Zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void  main(String[] args){


        Random randomGenerator;


        List<String> list = new ArrayList<>();
        list.add("Jan");
        list.add("Zbych");
        list.add("Andrzej");
        list.add("wiesiek");
        list.add("Tomasz");


ExecutorService service = Executors.newFixedThreadPool(2);
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i =0; i < list.size();i++){
                    System.out.println("watek 1: " + list.get(i));
                    Thread.yield();
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                for (int i = list.size() -1; i >=0;i--){
                    System.out.println("watek 2: " + list.get(i));
                    Thread.yield();
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };

        service.execute(runnable1);
        service.execute(runnable2);
service.shutdown();
    }
}