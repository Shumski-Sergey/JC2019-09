package asenyuk.Lesson3;

public class Lesson3Task1a {
    public static void main(String[] args) {
        int i =4321;
        int a=0 ;

        while (i>0) {
            a = a + i%10;
            i=i/10;
            System.out.println("a =" + a);
            System.out.println("i =" + i);
            System.out.println("------" );
        }

        System.out.println("The sum of the numbers is  " + a);
    }
}
