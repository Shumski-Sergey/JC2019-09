package asenyuk.Lesson3;

public class Lesson3Task2a {
    public static void main(String[] args) {
        int x = 12;
        int j=0;
        double s;
        for (int i = 1; i <= x; i++) {
            if (x%i==0) {
                j=j+1;
            }
        }
        System.out.println(j);
        if (j==2) {
            System.out.println("Prime number");
                    }
        else {
            System.out.println("Is not prime number");
        }
    }
}
