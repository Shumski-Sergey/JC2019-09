package dmikulionak.lesson_3;

import java.util.Scanner;

//2. Имеется целое число, определить является ли это число простым,
//т.е. делится без остатка только на 1 и себя.
public class task2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = s1.nextInt();
        int b;
      boolean isComposite = false;
      for (b = 2; b<a; b++) {
          if (a % b == 0) {
              isComposite = true;
              break;
          }
      }
      if (isComposite)
          System.out.print("Введеное число - составное");
      else
          System.out.print("Введеное число - простое");
    }
    }

