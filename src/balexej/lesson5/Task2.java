package balexej.lesson5;

import java.util.Arrays;
import java.util.Scanner;

//2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Input Array Size : ");
            int size = sc.nextInt();

            int[] elements = new int[size];
            System.out.println("Insert "+size+" Elements of the Array");
            for (int i = 0; i < size; i++) {
                System.out.print("Element "+i+" : ");
                elements[i] = sc.nextInt();
            }

            System.out.println("Provided array:" + Arrays.toString(elements));

    }
    }

