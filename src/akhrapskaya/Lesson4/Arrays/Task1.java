package akhrapskaya.Lesson4.Arrays;

public class Task1 {
    public static void  main(String[] args){
        MyArrays ar = new MyArrays(3000);
        for (int i = 0; i < ar.array.length; i++) {
            ar.array[i] = 1000 + 3 * i;
        }
        ar.output(30);
    }
}
