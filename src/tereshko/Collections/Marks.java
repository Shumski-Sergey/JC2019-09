package tereshko.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Marks {
    private static int  AMOUNT;
    private static int MARKS;

    public static void setMarks() {
        List<Integer> list = new ArrayList<>();
        System.out.println("Введите диапозон рандома");
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a positive number!");
            while (!sc.hasNextInt()) {
                System.out.println("That not a number!");
                sc.next(); 
            }
            number = sc.nextInt();
        } while (number <= 0);
        System.out.println("Thank you! Got " + number);
        for (int i = 0; i < AMOUNT; i++) {
        }
    }
    }

