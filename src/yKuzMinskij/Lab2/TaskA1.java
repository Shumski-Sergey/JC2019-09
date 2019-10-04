package yKuzMinskij.Lab2;

import java.util.Scanner;

public class TaskA1 {
    public static void main (String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum= 0;
        while (num>0){
            sum += (num%10);
            num /= 10;
        }System.out.println(sum);
    }
}
