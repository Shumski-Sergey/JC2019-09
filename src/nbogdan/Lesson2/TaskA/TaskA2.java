package nbogdan.Lesson2.TaskA;

import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a, b, c для квадратного уравнения aX^2 + bX + c = 0");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double d, x;
        d = (Math.pow(b, 2) - 4 * a * c);
        if (d < 0) {System.out.println("У уравнения нет корней");} else {
            if (d == 0) {
                x = ((double) -b / (double) (2 * a));
                System.out.println("Единственный корень уравнения: " + x);
            } else {
                x = (-b + Math.sqrt(d)) / (2 * a);
                System.out.println("Первый корень уравнения: " + x);
                x = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Второй корень уравнения: " + x);
            }
        }
    }
}
