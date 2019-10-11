package asenyuk.Lesson2;

public class Lesson2Task1b {
    public static void main(String[] args) {
        int max=155;
        int min=5;

        double a = (Math.random() * (max-min +1)) +min;
        System.out.println("Number = " +a);

        if (25<a & a<100) {
            System.out.println( "Good number");

        }
        else {
            System.out.println( "Bad number");
        }
    }
}
