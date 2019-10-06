package akhrapskaya.Lesson4.Arrays;

public class Task4 {

    public static void  main(String[] args){
        MyArrays ar = new MyArrays(20);
        for (int i = 0; i < ar.n; i++){
            ar.array[i] = (int) Math.pow(2,i);
        }
        ar.output();
    }

}
