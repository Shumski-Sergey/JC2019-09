package ssivko.lab3;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое число ");
        int a = in.nextInt();
        int  b;
        System.out.println("Делители: ");
        for (b = 1; b<=a; b++){
            if (a%b==0){
                System.out.print( +b+" ");
            }

        }
    }
}
