package metody;

public class Zad4 {
    public static void main(String[] args) {
        Zad4 task = new Zad4(); //Referencja do naszej klasy pozwalajaca nam odwłoanie sie do metody bez static
        System.out.println(task.divide(10, 8));

    }

    double divide(double a, double b) {
        if (a == 0 || b == 0) {
            throw new ArithmeticException(); // wyrzucenie wyjątku i jesli zostanie spełniony zakonczy działanie
            //if (a == 0 || b == 0){
            //System.out.println("Nie dziel przez 0 "); return 0;
        }
        return a / b;
    }
}
