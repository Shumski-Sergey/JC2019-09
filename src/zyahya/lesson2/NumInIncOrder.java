package zyahya.lesson2;

import java.util.Scanner;

public class NumInIncOrder {
    public static void main(String[] args){


        Scanner abc = new Scanner(System.in);
        System.out.println("Enter numbers: ");

        int a = abc.nextInt();
        int b = abc.nextInt();
        int c = abc.nextInt();

        int x=0;
        if(a>b){
            x=a; a=b; b=x;
        }
        if(b>c){
            x=b; b=c; c=x;
        }
        if(a>b){
            x=a; a=b; b=x;
        }
        System.out.println("Возрастающий порядок чисел: " +a+ " "+b+ " "+c);
    }
}
