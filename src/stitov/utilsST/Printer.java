package stitov.utilsST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by user on 26.10.2019.
 */
public class Printer {
  /**
   * Print any ArrayList
   * @param arrayList origin ArrayList to Print
   * @param <T> any type for ArrayList
   */
  public static <T> void printArray (ArrayList<T> arrayList){
    for (T item : arrayList) {
      System.out.println(item );
    }
    System.out.println();
  }

  /**
   * Print ArrayList with ArrayList of String
   * @param array ArrayList to print
   */
  public static void printArrayOfArray (ArrayList<ArrayList<String>> array){
    for (ArrayList<String> firstArray: array){
      for (String str: firstArray){
        System.out.print(str+ " ");
      }
      System.out.println();
    }
  }

  /**
   * Print all HashSet
   * @param set any type HashSet
   */
  public static <T> void printHashSetString(HashSet<T> set){
    for(T i:set){
      System.out.print(i+ " ");
    }
    System.out.println();
  }

  /**
   * Print only Keys in HashMap
   * @param map original HashMap
   * @param <T> type of Keys in HashMap
   * @param <E> type of Values in HashMap
   */
  public static <T,E> void  printKeysInMap(HashMap<T,E> map){
    for (Map.Entry entry : map.entrySet()){
      System.out.print(entry.getKey()+ " ");
    }
    System.out.println();
  }
}
