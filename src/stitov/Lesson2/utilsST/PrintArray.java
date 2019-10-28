package stitov.Lesson2.utilsST;

import java.util.ArrayList;

/**
 * Created by user on 26.10.2019.
 */
public class PrintArray {
  public void printArray (ArrayList<Integer> arrayList){
    for (int i =0; i< arrayList.size();i++){
      System.out.print( arrayList.get(i)+ "  ");
    }
  }
}
