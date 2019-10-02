package stitov.Lesson2;
import java.util.Scanner;
/**
 * Created by user on 28.09.2019.
 */
public class Lesson2_Task2A {
  public static void main(String[] args) {
    double a, b, c;
    Scanner in = new Scanner(System.in);
    System.out.println("Введите a");
    a = in.nextDouble();
    System.out.println("Введите b");
    b = in.nextDouble();
    System.out.println("Введите c");
    c = in.nextDouble();
    if (a == 0 && b != 0) {
      oneroot(b, 2);
    } else if (a == 0 && b == 0) {
      noroots();
    } else {
      haveroots(a, b, c);
    }
  }

  public static void oneroot(double b, double c) {
    double x = -1 * c / b;
    System.out.println("Корень равен " + x);
  }

  public static void noroots() {
    System.out.println("Отсутствуют неизвестные");
  }

  public static void haveroots(double a, double b, double c) {
    double d, x1, x2;
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