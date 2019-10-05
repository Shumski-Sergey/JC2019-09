package nbogdan.Lesson3.TaskB;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        long a = sc.nextLong();
        System.out.print("Целые делители числа " + a + ": ");
        for (int i = 1; i < a + 1; i++) {
            if (a % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
