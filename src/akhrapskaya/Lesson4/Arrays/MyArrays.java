package akhrapskaya.Lesson4.Arrays;

import java.util.Random;
import java.util.Scanner;

public class MyArrays {
    public int [] array;
    public int n;

    public MyArrays(){
        n = 0;
        array = new int[n];
    }
    public MyArrays( int n){
        this.n = n;
        array = new int[n];
    }
    public MyArrays(String s){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(s);
            n = sc.nextInt();
        } while ( n < 0 || n > 20);
        array = new int[n];
    }
    public void output( int k){
        for (int i = 0; i < array.length; i++){
            if(i % k == 0)
                System.out.print("\n");
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }
    public void output(){
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
    public int maxInd (){
        int maxi = 0;
        for (int i = 0; i < n; i++){
            if (array[maxi] < array[i])
                maxi = i;
        }
        return maxi;
    }
    public int minInd (){
        int mini = 0;
        for (int i = 0; i < n; i++){
            if (array[mini] > array[i])
                mini = i;
        }
        return mini;
    }
    public void setIn( String s){
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
    }
    public void setIn( int min, int max){
        Random rand = new Random();
        for (int i = 0; i < n; i++){
            array[i] = rand.nextInt(Math.max(min,max)-Math.min(min,max)) + Math.min(min,max);
        }
    }

}
