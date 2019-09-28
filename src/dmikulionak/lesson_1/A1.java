package dmikulionak.lesson_1;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        int k = 10;
        double x1, x2;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число m: ");
        double m = in.nextInt();

        Scanner on = new Scanner(System.in);
        System.out.print("Введите число n: ");
        double n = in.nextInt();

        x1 = k - m;
        x2 = k - n;

        if (Math.abs(x1) == Math.abs(x2)) {
            System.out.println("Число m и n одинаково близки к 10");
        }
            else{

                if (Math.abs(x1) < Math.abs(x2)) {
                    System.out.println("Число m ближе к 10, чем m");
                } else {
                    System.out.println("Число m ближе к 10, чем n");
                }
            }
        }
    }


