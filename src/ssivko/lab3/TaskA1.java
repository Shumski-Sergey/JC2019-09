package ssivko.lab3;

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое число ");
        int s = in.nextInt();
        int b = s;
        int r=0;
        while (b != 0){
            r += b%10;
            b /=10;
        }
        System.out.println("Сумма цифр равна: " + r);
    }
}
