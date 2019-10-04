package stitov.Lesson2.Lesson3;

import java.util.Scanner;

/**
 * Created by user on 02.10.2019.
 */
public class Task5 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int flag = 0;
    for (int i = 1; i<a+1; i++ ){
      if (a %i == 0){
        System.out.println(i);
      }
    }
  }
}
