

public class Main {

    public static void main(String[] args) {
        double m, n, a=10;
        m = 4.4;
        n = 13.7;
        if (Math.abs(m-a)<Math.abs(n-a)){
            System.out.print("Ближайшее " + m);
        } else {
            System.out.print("Ближайшее " + n);
        }

    }
}
