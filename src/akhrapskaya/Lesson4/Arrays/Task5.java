package akhrapskaya.Lesson4.Arrays;

public class Task5 {

    private static void set(MyArrays ar){
        ar.array [0] = 2;
        for (int i = 1; i < ar.n; i++){
            ar.array[i] = 2*ar.array[i-1]-1;
        }
    }
    public static void  main(String[] args){
        MyArrays ar = new MyArrays(14);
        set(ar);
        ar.output();
    }
}
