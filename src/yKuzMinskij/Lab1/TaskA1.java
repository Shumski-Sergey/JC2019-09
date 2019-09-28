package yKuzMinskij.Lab1;

import java.util.Scanner;

public class TaskA1 {
    public static void main (String[] args) {
        System.out.println("Введите два числа");
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double n = sc.nextDouble();
        if(Math.abs(10-m)==Math.abs(10-n)){
            System.out.println("Они одинаково удалены от 10");
        }
        else if (Math.abs(10-m)>Math.abs(10-n)) {
            System.out.println(n);
        }else System.out.println(m);
    }
}

