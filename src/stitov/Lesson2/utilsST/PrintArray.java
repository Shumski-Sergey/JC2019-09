package stitov.Lesson2.utilsST;

import java.util.ArrayList;

/**
 * Created by user on 26.10.2019.
 */
public class PrintArray {
  public static void printArray (ArrayList<Integer> arrayList){
    for (Integer integer : arrayList) {
      System.out.print(integer + "  ");
    }
    System.out.println();
  }

  public static void printArrayOfArray (ArrayList<ArrayList<String>> array){
    for (ArrayList<String> firstArray: array){
      for (String str: firstArray){
        System.out.print(str+ " ");
      }
      System.out.println();
    }
  }
}
