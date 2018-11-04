package Watki;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 {
    int wiek = 0;
    ExecutorService service;

    public static void main(String[] args) {
        new Example1();
    }

    public Example1() {
        service = Executors.newFixedThreadPool(2);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
                System.out.println("watek1");
            }
        };

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
                System.out.println("watek2");
            }
        };


        service.execute(runnable);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.execute(runnable1);

// service.shutdownNow();
    }
}

