package akhrapskaya.Lesson4.Arrays2;

import akhrapskaya.Lesson4.Arrays.MyArrays;

import java.util.Scanner;

public class Task3 {

    public static void turn (MyArrays ar) {
        for( int i = 0; i < ar.n/2; i++){
            int k = ar.array[i];
            ar.array[i] = ar.array[ar.n-1-i];
            ar.array[ar.n-1-i] = k;
        }
    }
    public static void  main(String[] args){
        MyArrays ar = new MyArrays("Введите количество элементов массива(<= 20):");
        System.out.println("Введите интервал значений:");
        Scanner sc = new Scanner(System.in);
        ar.setIn(sc.nextInt(), sc.nextInt());
        ar.output();
        turn(ar);
        ar.output();
    }
}
