package akhrapskaya.Lesson3.Arrays;

public class Task1 {
    public static void  main(String[] args){
        int[] array = new int[3000];
        for (int i = 0; i < array.length; i++){
            array[i] = 1000 + 3*i;
        }
        output(array);
    }
    private static void output(int[] ar){
        for (int i = 0; i < ar.length; i++){
            if(i % 30 == 0)
                System.out.print("\n");
            System.out.print(ar[i] + " ");
        }
    }
}
