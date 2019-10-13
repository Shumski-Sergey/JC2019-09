package vtafeliuk.Lesson2;
import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double d;
        double x1;
        double x2;
        double y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter 3 numbers:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        d = b*b - 4*a*c;

        if (d < 0){
            System.out.println("No roots");
        } else {
            if (d == 0){
                x1 = -b/2*a;
                System.out.println("There is only 1 root:" + x1);
            } else {
                x1 = (-b + Math.sqrt(d))/(2*a);
                x2 = (-b - Math.sqrt(d))/(2*a);
                System.out.println("There are two roots:" + x1 + " and " + x2);
            }
        }
        }
    }
