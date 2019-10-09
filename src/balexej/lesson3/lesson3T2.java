package balexej.lesson3;

import java.util.Scanner;



public class lesson3T2 {
    public static void main(String [] arge) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int x = sc.nextInt();
        int i = 0;
        System.out.println(x);

        for (i = 2; i < x; i++) {
            if (x % i == 0) {
                System.out.println("число составное ");
                x=0; break;


            }
            else {
                System.out.println("число  простое ");
            }

            }
        }
    }