package akhrapskaya.Lesson3.Arrays;

public class Task4 {
    private static void output(int[] ar){
        for (int j : ar){
            System.out.print(j + " ");
        }
    }
    public static void  main(String[] args){
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) Math.pow(2,i);
        }
        output(array);
    }

}
