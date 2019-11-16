package stitov.Lesson4;

/**
 * Created by user on 05.10.2019.
 */
public class Task3 {
  public static void main(String[] args) {
    int a=(90-90%5)/5+1;
    int array[] = new int[a];
    int j=0;
    for (int i = 90; i>-1;i-=5){
      array[j]=i;
      System.out.print(array[j]+" ");
      j++;
    }
  }
}
