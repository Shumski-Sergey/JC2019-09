package nbogdan.Lesson3.TaskA;

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        StringBuilder s = new StringBuilder();
        long z = sc.nextLong(), x = 1;
        for ( ; x > 0;) {
            x = z % 1000;
            z /= 1000;
            if (x == 0) {break;}
            s.insert(0, x + " ");
        }
        System.out.print(s);
    }
}