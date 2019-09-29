package stitov.Lesson2;

/**
 * Created by user on 28.09.2019.
 */
public class Lesson2_Task1A {
  public static void main(String[] args) {
    double m, n, a = 10;
    m = -9;
    n = 30;
    if (Math.abs(m - a) == Math.abs(n - a)) {
      System.out.print("Расстояние одинаково");
    } else {
      if (Math.abs(m - a) < Math.abs(n - a)) {
        System.out.print("Ближайшее " + m);
      } else {
        System.out.print("Ближайшее " + n);
      }
    }
  }
}