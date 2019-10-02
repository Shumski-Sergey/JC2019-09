package stitov.Lesson2;
import java.util.Scanner;
/**
 * Created by user on 28.09.2019.
 */
public class Lesson2_Task3A {
  public static void main(String[] args) {
    double a, b, c, a1, b1, c1;
    Scanner in = new Scanner(System.in);
    System.out.println("Введите первое число");
    a = in.nextDouble();
    System.out.println("Введите второе число");
    b = in.nextDouble();
    System.out.println("Введите третье число");
    c = in.nextDouble();
    if (a < b) {
      if (a < c) {
        System.out.print(a + "  ");
        if (b < c) {
          System.out.print(b + "   " + c);
        } else {
          System.out.print(c + "  " + b);
        }
      } else {
        System.out.print(c + "  " + a + "  " + b);
      }
    } else {
      if (b<c){
        System.out.print(b + "  ");
        if (a<c) {
          System.out.print(a + "  " + c);
        } else {
          System.out.print(c + "  " + a);
        }
      } else{
        System.out.print(c + "  " + b + "  " + a);

      }

    }
  }
}