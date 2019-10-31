package tereshko.NewCollection;

import java.util.Scanner;

public class Scan {
    private static Scanner scanner = new Scanner(System.in);

    public static int setScanner() {
        int number;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("That not a positive number!");
                scanner.next(); // this is important!
            }
            number = scanner.nextInt();
        } while (number <= 0);
        return number;
    }
}
