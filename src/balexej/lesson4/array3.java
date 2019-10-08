package balexej.lesson4;

import java.util.Random;

public class array3 {
    public static void main (String[] args){
        int[] ar = new int[10];

        for (int i = 0; i < ar.length; i++){
            ar [i] =(int) Math.round ( Math.random() * 10 ) ;
           System.out.println(ar[i]);
        }
        System.out.println();


        for (int i = ar.length-1; i >= 0; i--) {
            System.out.println(ar[i]);
        }

    }
}
