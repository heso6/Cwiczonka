package Watki.Zad1;

public class SynchronizedMethod {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) {
        SynchronizedMethod sync = new SynchronizedMethod();
        sync.countFistsInTheAir();
    }

    private  void  countFistsInTheAir() {
        Runnable count = () -> {
            for (int i = 0; i < 5000; i++) {
                 increment();
            }
        };

        Thread firstManWhoCanCountToFiveThousand = new Thread(count);
        Thread secondManWhoCanCountToFiveThousand = new Thread(count);

        firstManWhoCanCountToFiveThousand.start();
        secondManWhoCanCountToFiveThousand.start();


        try {
            firstManWhoCanCountToFiveThousand.join();
            secondManWhoCanCountToFiveThousand.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("the number of this in the air is" + " " + counter);
    }
}
