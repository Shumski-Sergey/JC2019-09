package balexej.Test1;

import balexej.Lesson9Colletion.LinkedListArrayList.Array;

public class Task1 {
    public static void main(String[] args){

        int [] arr = new int [11];
        for (int i = 0; i < arr.length; i++){
            arr [i] =(int) Math.round ( Math.random() * 11 ) ;
            System.out.println(arr[i]);
        }
        int max = arr[0];
        int min = arr[0];
        for (int i= 0; i<arr.length; i++){
        if (arr[i]>max){
            max = arr[i];
        }
     }
        System.out.println("Максимальное " + max);

        for (int i = 0; i < arr.length; i++){
        }


        System.out.println("Минимальное  "+ min);
     int sum = 0;
         for (int i =0; i < max; i++) {
          sum += arr[i];
     }
         System.out.println(sum-max-min);
 }
 }
