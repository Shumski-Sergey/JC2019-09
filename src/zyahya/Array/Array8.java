package zyahya.Array;

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner abc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a= abc.nextInt();
        long b=1;
        for(int i=a;i>0;i--){
            b*=i;
            System.out.print(b+" ");
        }
    }
}
