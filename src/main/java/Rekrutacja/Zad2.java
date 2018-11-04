package Rekrutacja;

public class Zad2 {
    public static int qwert(int[] a) {
        int ad = a[0];
        int counter = 1;


        while (ad != -1) {
            ad = a[ad];
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] tab = new int[6];
        tab[0] = 2;
        tab[1] = 1;
        tab[2] = 3;
        tab[3] = 4;
        tab[4] = 5;
        tab[5] = -1;
        System.out.println(Zad2.qwert(tab));

//        Lub

        int arr[] = {2,1,3,4,5 , -1};
        for (int i = 0; i <=arr.length-1; i++){
            if (arr[i] == -1){
                System.out.println(i);
            }
        }
    }
}
