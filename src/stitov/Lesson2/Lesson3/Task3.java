package stitov.Lesson2.Lesson3;
import java.util.Scanner;
/**
 * Created by user on 02.10.2019.
 */
public class Task3 {
  static public void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long a = in.nextLong();
    int length;
    int b,f,e;
    long c = 0;
    int i = 0;
    int array[] = new int[20];
    int array1[] = new int[20];
    while (a > 0) {
      c = a % 10;
      array[i] = (int) c;
      i++;
      a = (a - c) / 10;
    }
    length =i;
    for (int j = 0; j<length;j++){
      array1[j] = array[i-1];
      i--;
    }
    if (length <4) {
      for (int j = 0; j < length; j++) {
        System.out.print(array1[j]);
      }

      }else {
      f = length%3;
      switch (f){
        case 1:
          e = 1;
          break;
        case 2:
          e = 2;
          break;
        default:
          e = 3;
          break;
            }
      for (int j = 0; j < length; j++) {
        if (j==e){
          System.out.print(" ");
          e=e+3;
        }
        System.out.print(array1[j]);

      }
    }

  }
}