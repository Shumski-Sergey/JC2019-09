package yKuzMinskij.Lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskA3 {
    public static void main (String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        var1(num);

        }
    private static void var1 (int num){
        System.out.printf("%,d", num);
    }

}
