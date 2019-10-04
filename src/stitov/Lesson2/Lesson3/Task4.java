package stitov.Lesson2.Lesson3;
import java.util.Scanner;
/**
 * Created by user on 02.10.2019.
 */
public class Task4 {
  static public void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int a =in.nextInt();
    long mult=1;
    for (int i=1;i<a+1;i++){
      mult = mult*i;
    }
    System.out.print(mult);
  }
}
