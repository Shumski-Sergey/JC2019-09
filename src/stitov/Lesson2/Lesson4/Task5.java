package stitov.Lesson2.Lesson4;

/**
 * Created by user on 05.10.2019.
 */
public class Task5 {
  public static void main (String[] args){
    int array[] = new int[1000];
    int j=1;
    array[0] =2;
    System.out.print(array[0]+" ");
    while (array[j-1]<10000){
      array[j] = 2*array[j-1]-1;
      if (array[j]<10000){
        System.out.print(array[j] + " ");
      }
        j++;

    }

  }
}
