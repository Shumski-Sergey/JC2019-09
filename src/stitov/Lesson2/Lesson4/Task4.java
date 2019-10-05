package stitov.Lesson2.Lesson4;

/**
 * Created by user on 05.10.2019.
 */
public class Task4 {
  public static void main (String[] args) {
    int array[] = new int[20];
     array[0] = 2;
     System.out.print(array[0]+" ");
    for (int i = 1; i<20;i++){
      array[i] = array[i-1]*2;
      System.out.print(array[i]+" ");
    }
  }
}
