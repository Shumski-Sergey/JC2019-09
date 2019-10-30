package aflyer.les2;

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три целых числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            if (b > c) System.out.println(c + " " + b + " " + a);
            else System.out.println(b + " " + c + " " + a);
        }
        if (b > a && b > c) {
            if (a > c) System.out.println((c + " " + a + " " + b));
            else System.out.println(a + " " + c + " " + b);
        }
        if (c > a && c > b) {
            if (a > b) System.out.println(b + " " + a + " " + c);
            else System.out.println(a + " " + b + " " + c);
        }

    }
}

