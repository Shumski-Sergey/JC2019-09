package dmikulionak.lesson_4;

import java.util.Scanner;

public class task_a7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число m: ");
        int m = in.nextInt();
        int x=1, y=1;
        int fact;
        for (int i = 0; i < m; i++) {
            x= x * y;
            y++;
            if (i == m - 1) {
                System.out.print("факториал числа "+ m + " равен " + x);
            }
        }
    }
}


