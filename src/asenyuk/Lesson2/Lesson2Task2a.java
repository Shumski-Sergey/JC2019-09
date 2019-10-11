package asenyuk.Lesson2;
public class Lesson2Task2a {
    public static void main(String[] args) {

        int b =4;
        int a =3;
        int c= 1;
        double x1;
        double x2;
        double d;

        d =(b*b -4*a*c);

        if (d==0) {
            x1= (-1 *b)/ (2 *a);
            System.out.println("x1 " + x1 );

        }  else if (d>0) {
            x1= ((-1 *b + Math.sqrt(d))/2 *a );
            x2= ((-1 *b - Math.sqrt(d))/2 *a );
            System.out.println("x1 " + x1 );
            System.out.println("x2 " + x2 );
        }  else if (d<0) {
            System.out.println("There is no solution"  );
        }

    }
}
