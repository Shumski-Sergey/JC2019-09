package ssivko.lab2;

import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое положительное число ");
        int A = in.nextInt();
        int B, sum = 0;
        for (B=1; B<=A; sum += B++);
        System.out.println("Сумма чисел от 1-го до "+ A + " равна: "+ sum);
    }
}
