package stitov.Lesson2.Lesson4;

/**
 * Created by user on 05.10.2019.
 */
public class Task1 {
  public static void main(String[] args) {
    int array[] = new int[3000];
    int j=0;
    for (int i =1000; i<10000; i = i+3) {
      array[j]=i;
      System.out.print(array[j] + " ");
      j++;
    }

  }
}
