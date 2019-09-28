package nbogdan.Lesson2;

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m, n, a;
        System.out.println("Введите 2 числа");
        m = sc.nextDouble();
        n = sc.nextDouble();
        if (Math.abs(10 -m) != Math.abs(10 - n)) {
            a = Math.abs(10 - m) > Math.abs(10 - n) ? n : m;
            System.out.println(a);
        } else {System.out.println("Числа равноудалены от 10");}
    }
}
