package AlexandraShokhan.lesson2;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer number: ");
        int num = in.nextInt(); // Request the user to enter a positive integer number.

        int number = num; // Add a variable to store the original number.
        int sum = num;
        /* Create a variable which will be used to calculate the sum of all the integer numbers
        in the segment [1; num]. */

        for (int i = num; i > 0; i--) {
            num = num - 1;
            sum = sum + num;
        }

        System.out.println("The sum of all the integer numbers in the segment [1; " + number + "] equals to " + sum + ".");
    }
}
