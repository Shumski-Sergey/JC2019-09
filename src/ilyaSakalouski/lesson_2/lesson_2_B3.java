package ilyaSakalouski.lesson_2;

import java.util.Scanner;

public class lesson_2_B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВЕДИТЕ ЧИСЛО: ");
        int a = sc.nextInt();
        int b = (a * (a + 1))/2;
        System.out.println("Сумма чисел до введённого равна : " + b);
    }
}
