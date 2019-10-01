package yKuzMinskij.Lab1;

import java.util.Scanner;

public class TaskA3 {
    public static void main (String[] args) {
        System.out.println("Введите три числа");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for ((a < b) && (b < c)) {
            int a1 = a;
            a = b;
            b = a1;
            a1 = c;
            c = b;
            b = a1;
            System.out.println(a + " " + b + " " + c);
        }

        //if ((a!=b)&&(a!= c)&&(b!= c)) {}
    }
}
