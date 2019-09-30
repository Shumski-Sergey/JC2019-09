package asenyuk;

public class Lesson2Task3a {
    public static void main(String[] args) {
        //In this program, I specifically do not use loops and arrays :)
        int x=5;
        int y=3;
        int z=9;

        if (x>y & y>z) {
            System.out.println( "z "+z);
            System.out.println( "y "+y);
            System.out.println( "x "+x );
        }
        else  if (y>x & x>z) {
            System.out.println( "z "+z);
            System.out.println( "x "+ x);
            System.out.println( "y "+y);
        }
        else  if (z>x & x>y) {
            System.out.println( "y "+y);
            System.out.println( "x "+x);
            System.out.println( "z "+z);
        }

        else  if (y>z & z>x) {
            System.out.println( "x "+ x);
            System.out.println( "z "+z);
            System.out.println( "y "+y);
        }

        else  if (x>z & z>y) {
            System.out.println( "y "+y);
            System.out.println( "z "+z);
            System.out.println( "x "+x);
        }
        else  if (z>y & y>x) {
            System.out.println( "x "+x);
            System.out.println( "y "+y);
            System.out.println( "z  "+z);
        }
    }
}
