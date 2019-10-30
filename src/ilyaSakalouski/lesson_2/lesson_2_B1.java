package ilyaSakalouski.lesson_2;

import java.util.Scanner;

public class lesson_2_B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число из интервала [5;155]");
        int a = sc.nextInt();

        if ((a >= 5) && (a <= 155)) {
            if ((a > 25) && (a < 100)) {
                System.out.println("Число попало в интервал (25;100) "); // Круглые скобки (.. ; ..) означают что 25 и 100 НЕ входят в интервал
            } else {
                System.out.println("Число не попало в интервал (25;100)");
            }
        } else {
            System.out.println("Число не входит в заданный условием интервал");
        }
    }
}
