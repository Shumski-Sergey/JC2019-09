package dkolesnik.lesson2;

public class TaskA1 {
    public static void main(String[] args) {
        double a = 8.5;
        double b = 11.45;
        int c = 10;
        double m = c - a;
        double n = c - b;
        if (m > n) {
            System.out.println("Число B ближе к " + c);
        } else {
            if (m == n) {
                System.out.println("Число А равно числу B");
            } else {
                System.out.println("Число А ближе к " + c);
            }


        }
    }
}
