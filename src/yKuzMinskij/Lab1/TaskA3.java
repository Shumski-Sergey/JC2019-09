package yKuzMinskij.Lab1;

import java.util.Scanner;

public class TaskA3 {
    public static void main (String[] args) {
        System.out.println("Введите три целых неравных между собой числа числа");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int v = 0;
        while ((a > b) || (b > c) || (a > c)) {
            if (b > c) {
                v = b;
                b = c;
                c = v;
            } else if (a > b) {
                v = a;
                a = b;
                b = v;
            } else if (a > c){
                v=a;
                a=c;
                c=v;
            }
        } System.out.println(a + " " + b + " " + c);
    }
}
