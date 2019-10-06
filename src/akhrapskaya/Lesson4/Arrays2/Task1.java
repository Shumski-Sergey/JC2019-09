package akhrapskaya.Lesson4.Arrays2;

import java.util.Scanner;

public class Task1 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество оценок:");
        int n = sc.nextInt();
        int[] array = new int[n];
        set(array);
        output(array);
    }
    private static void set( int[] array){
        System.out.println("Введите оценки:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

    }
    private static void output(int[] ar){
        for (int i = 0; i < ar.length; i++){
            if(i % 30 == 0)
                System.out.print("\n");
            System.out.print(ar[i] + " ");
        }
    }
}
