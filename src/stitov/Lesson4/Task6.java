package stitov.Lesson4;

/**
 * Created by user on 05.10.2019.
 */
public class Task6 {
  public static void main (String[] args){
    int array[] = new int[10];
    array[0]=-166;
    int j=1;
    while (array[j-1]<100){
      array[j] = 2*array[j-1]+200;
      if ((array[j]>9 && array[j]<100)||(array[j]<-9 && array[j]>-100)){
        System.out.println(array[j] + " "+j);
      }
      j++;
    }
  }
}
