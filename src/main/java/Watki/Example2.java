package Watki;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.swing.*;

public class Example2 {


    public static class Mythread implements Runnable {

        @Override
        public void run() {
            Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
            for (int i = 0; i < 500; i++) {
                System.out.println("watek 1: " + i);
            }
        }

    }

    public static class Mythread2 implements Runnable {

        @Override
        public void run() {
            Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
            for (int i = 0; i < 500; i++) {
                System.out.println("watek 2: " + i);
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Mythread());
        Thread t2 = new Thread(new Mythread2());
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

