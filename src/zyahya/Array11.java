package zyahya;

import java.text.NumberFormat;
import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Scanner abc= new Scanner(System.in);
        System.out.println("Enter full number:");
        int a=abc.nextInt();
        NumberFormat f= NumberFormat.getInstance();//  DecimalFormat f= new DecimalFormat();
        System.out.println(f.format(a));
    }
}


