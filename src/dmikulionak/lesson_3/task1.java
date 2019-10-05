package dmikulionak.lesson_3;

import java.util.Scanner;

//1. Имеется целое число. Следует посчитать сумму цифр данного числа.
public class task1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = s1.nextInt();
        int summ = 0;
        while (a>0) {
            summ +=a%10;
            a/=10;
        }
        System.out.print("Сумма цифр числа " + a + " равна " + summ);
    }
}
