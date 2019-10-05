package akhrapskaya.Lesson3.Arrays;

public class Task2 {

    private static void output(int[] ar){
        for (int i = 0; i < ar.length; i++){
            if(i % 30 == 0)
                System.out.print("\n");
            System.out.print(ar[i] + " ");
        }
    }
    public static void  main(String[] args){
        int[] array = new int[55];
        for (int i = 0; i < array.length; i++){
            array[i] = 1 + i*2;
        }
        output(array);
    }
}
