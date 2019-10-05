package nsivko.lab3;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        int a;
        Scanner ch = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        a = ch.nextInt();
        int b = 1;
        for(int i = 1; i <=a ; i++){
            b *= i;
        }
        System.out.println("Факториал числа равен " + b);
    }
}
