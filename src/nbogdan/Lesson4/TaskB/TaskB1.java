package nbogdan.Lesson4.TaskB;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        StringBuilder s = new StringBuilder();
        long x = sc.nextLong(), a = 1;
        for ( ; a > 0;) {
            a = x % 1000;
            x /= 1000;
            if (a == 0) {break;}
            s.insert(0, a + " ");
        }
        System.out.print(s);
    }
}
