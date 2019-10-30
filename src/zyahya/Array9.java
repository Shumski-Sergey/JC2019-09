package zyahya;

import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) {
        int a;
        long b=1;
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter a number");
        if (abc.hasNext()) {
             a = abc.nextInt();
            for (int i = a; i > 0; i--) {
                b *= i;
            }
            System.out.print(b + " ");
        }

    }
}


