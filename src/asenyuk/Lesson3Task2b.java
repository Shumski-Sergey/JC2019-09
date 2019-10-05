package asenyuk;

import java.util.Scanner;

public class Lesson3Task2b {
    public static void main(String[] args) {

        Scanner inpt =new Scanner(System.in);
        int x=inpt.nextInt();
        System.out.println("x " + x);

       for (int i = 1; i <= x; i++) {
            if (x%i==0) {
                {
                    System.out.println( "i " +i);
                               }

            }
        }
      System.out.println( "--------");



    }
}

