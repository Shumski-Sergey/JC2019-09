package stitov.Lesson2;

import java.util.Scanner;
/**
 * Created by user on 28.09.2019.
 */
public class Lesson2_Task1A {
  public static void main(String[] args) {
    double m, n, a = 10;
    System.out.println("Введите первое число");
    Scanner in = new Scanner(System.in);
    m = in.nextDouble();
    System.out.println("Введите второе число");
    n = in.nextDouble();
    if (Math.abs(m - a) == Math.abs(n - a)) {
      System.out.print("Расстояние одинаково");
    } else {
      if (Math.abs(m - a) < Math.abs(n - a)) {
        System.out.print("Ближайшее к 10: " + m);
      } else {
        System.out.print("Ближайшее к 10: " + n);
      }
    }
  }
}