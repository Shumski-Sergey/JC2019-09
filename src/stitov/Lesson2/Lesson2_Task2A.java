package stitov.Lesson2;

/**
 * Created by user on 28.09.2019.
 */
public class Lesson2_Task2A {
  public static void main(String[] args) {
    double a, b, c, d, x1, x2;
    a = 1;
    b = 1;
    c = -12;
    d = b * b - 4 * a * c;
    if (d < 0) {
      System.out.print("Вещественных корней нет");
    } else {
      if (d > 0) {
        x1 = (-b - Math.sqrt(d)) / (2 * a);
        x2 = (-b + Math.sqrt(d)) / (2 * a);
        System.out.print("X1 = " + x1 + "    X2 = " + x2);
      } else {
        x1 = -1 * b / (2 * a);
        System.out.print("X = " + x1);
      }
    }
  }
}