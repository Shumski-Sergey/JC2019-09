package stitov.Lesson2.Lesson3;
import java.util.Scanner;
/**
 * Created by user on 02.10.2019.
 */
public class Task2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int flag = 0;
    for (int i = 2; i<a; i++ ){
      if (a %i == 0){
        flag = 1;
        System.out.print("Число не является простым");
        break;
      }

    }
    if (flag == 0 || a == 0 || a==1 || a==2){
      System.out.print("Число является простым");
    }
  }
}
