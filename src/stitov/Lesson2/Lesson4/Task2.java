package stitov.Lesson2.Lesson4;

/**
 * Created by user on 05.10.2019.
 */
public class Task2 {
  public static void main(String[] args) {
  int array[] = new int[55];
  int a=1;
  for (int i=0; i<55; i++){
    array[i] = a;
    a+=2;
    System.out.print(array[i] + " ");
  }
  }
}
