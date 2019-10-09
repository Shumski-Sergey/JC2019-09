package akhrapskaya.Lesson4.Arrays2;

import java.util.Scanner;

public class Task4 {

    private static int size(){
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (n > 30 || n < 0) {
            System.out.println("Введите размер массива(0-30): ");
            n = sc.nextInt();
        }
        return n;
    }
    private static void butterfly(int[][] array){
        for(int i = 0; i < array.length; i++){
            for( int j = i; j < array[0].length-i; j++){
                array[i][j]=1;
            }
            for( int j = array[0].length-1-i; j <= i ; j++){
                array[i][j]=1;
            }
        }
    }
    private static void output(int[][] array){
        for(int i = 0; i < array.length; i++){
            for( int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void  main(String[] args){
        int n = size();
        int[][] array = new int[n][n];
        butterfly(array);
        output(array);
    }
}
