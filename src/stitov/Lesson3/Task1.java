package stitov.Lesson3;

import java.util.Scanner;

/**
 * Created by user on 02.10.2019.
 */
public class Task1 {
  public static void main(String[] args) {
    int i, j, sum =0;
    Scanner in = new Scanner(System.in);
    i = in.nextInt();
    while(i>0){
      sum = sum + i%10;
      j = i%10;
      i=i-j;
      i=i/10;
    }
    System.out.print(sum);
  }
}
