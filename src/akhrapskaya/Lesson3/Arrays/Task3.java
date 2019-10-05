package akhrapskaya.Lesson3.Arrays;

public class Task3 {

    private static void output(int[] ar){
        for (int i : ar){
            System.out.print(i + " ");
        }
    }
    public static void  main(String[] args){
        int[] array = new int[19];
        for (int i = 0; i < array.length; i++){
            array[i] = 90 - i*5;
        }
        output(array);
    }
}
