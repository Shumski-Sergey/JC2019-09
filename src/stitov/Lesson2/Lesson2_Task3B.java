package stitov.Lesson2;

import java.util.Scanner;
/**
 * Created by user on 28.09.2019.
 */
public class Lesson2_Task3B {
  public static void main(String[] args) {
    Scanner in  = new Scanner(System.in);
    int a = in.nextInt();
    int i, j=0;
    for (i = 1; i < a+1; i++){
      j = j+i;
    }
    System.out.print(j);
  }
}
