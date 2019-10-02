package stitov.Lesson2;
/**
 * Created by user on 28.09.2019.
 */
public class Lesson2_Task1B {
  public static void main(String[] args) {
    double a;
    a = 5 + Math.random()*150;
    if (a>=25 && a<=100){
      System.out.print(a + " попало в диапазон");
    } else {
      System.out.print(a + " не попало");
    }
  }
}
