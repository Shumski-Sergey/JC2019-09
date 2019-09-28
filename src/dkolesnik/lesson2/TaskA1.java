package dkolesnik.lesson2;

public class TaskA1 {
    public static void main(String[] args) {
        double a = -44444.8125;
        double b = 0;
        int c = 10;
        double m = c - a;
        double n = c - b;
        if (m > n) {
            System.out.println("Число B ближе к " + c);
        }
        else {
            System.out.println("Число А ближе к " + c);
        }


    }
}
