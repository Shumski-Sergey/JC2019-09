package AlexandraShokhan.lesson1;

public class A1 {
    public static void main(String[] args) {
        double m = 8.5;
        double n = 11.45;
        if (Math.abs(m - 10) > Math.abs(n - 10)) {
            System.out.println(n);
        } else if (Math.abs(m - 10) == Math.abs(n - 10)) {
            System.out.println(n + "&" + m);
        }
    }
}