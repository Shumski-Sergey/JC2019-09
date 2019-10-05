package nbogdan.Lesson3.TaskA;

import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = sc.nextInt();
            if (x >= 2) {
                if (x != 2 && x != 3 && x != 5 && x != 7) {
                    if ((((double) x) % 2 == 0) || (((double) x) % 3 == 0) || (((double) x) % 5 == 0) || (((double) x) % 7 == 0)) {
                        System.out.println("Число " + x + " не является простым!");
                    } else {
                        System.out.println("Число " + x + " является простым.");
                    }
                } else {
                    System.out.println("Число " + x + " является простым.");
                }
            } else {
                System.out.println("Число " + x + " не является простым!");
            }
    }
}
