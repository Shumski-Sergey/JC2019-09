package akhrapskaya.Lesson4.Arrays;

public class Task3 {

    public static void  main(String[] args){
        MyArrays ar = new MyArrays(19);
        for (int i = 0; i < ar.n; i++){
            ar.array[i] = 90 - i*5;
        }
        ar.output();
    }
}
