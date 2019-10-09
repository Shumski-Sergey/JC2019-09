package akhrapskaya.Lesson4.Arrays;

public class Task6 {
    private static void set(MyArrays ar){
        ar.array [0] = -166;
        for (int i = 1; i < ar.n; i++){
            ar.array[i] = 2*ar.array[i-1]+200;
        }
    }
    private static void out (MyArrays ar){
        for (int i = 1; i < ar.n; i++){
            if (ar.array[i] > -100 && ar.array[i] < 100)
                System.out.print(ar.array[i] + " ");
        }
    }
    public static void  main(String[] args){
        MyArrays ar = new MyArrays(6);
        set(ar);
        out(ar);
    }

}
