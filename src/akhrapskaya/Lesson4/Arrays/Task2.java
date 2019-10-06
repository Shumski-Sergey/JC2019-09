package akhrapskaya.Lesson4.Arrays;

public class Task2 {

    public static void  main(String[] args){
        MyArrays ar = new MyArrays(55);
        for (int i = 0; i < ar.array.length; i++){
            ar.array[i] = 1 + i*2;
        }
        ar.output(30);
    }
}
