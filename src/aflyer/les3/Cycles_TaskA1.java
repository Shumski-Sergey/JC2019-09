package aflyer.les3;
// Имеется целое число. Следует посчитать сумму цифр данного числа.

import java.util.Scanner;

public class Cycles_TaskA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int i = sc.nextInt();
        int k = 0;
        while (i != 0) {
            k += i % 10;
            i = i / 10;
        }
        System.out.println("Сумма цифр числа:" + (k));
    }
}
