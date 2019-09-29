package vtafeliuk.Lesson2;
import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter 3 numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a == b) {
            System.out.println("The numbers a,b and c must not match!");
        } else if (a == c) {
            System.out.println("The numbers a,b and c must not match!");
        }
        if (b == c) {
            System.out.println("The numbers a,b and c must not match!");
        }

        if (a < c) {
            if (a < b) {
                if (b < c) {
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                } else {
                    b = b + c;
                    c = c - b;
                    c = -c;
                    b = b - c;
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                }
            } else {
                a = a + b;
                b = b - a;
                b = -b;
                a = a - b;
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
        } else {
            if (a > b) {
                if (b > c) {
                    a = a + c;
                    c = c - a;
                    c = -c;
                    a = a - c;
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                } else {
                    b = b + c;
                    c = c - b;
                    c = -c;
                    b = b - c;
                    a = a + c;
                    c = c - a;
                    c = -c;
                    a = a - c;
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                }
            } else {
                a = a + c;
                c = c - a;
                c = -c;
                a = a - c;
                b = b + c;
                c = c - b;
                c = -c;
                b = b - c;
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
        }
    }
}
